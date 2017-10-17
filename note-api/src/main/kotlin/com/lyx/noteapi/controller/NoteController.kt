package com.lyx.noteapi.controller

import com.lyx.noteapi.entity.po.Note
import com.lyx.noteapi.service.INoteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/note")
class NoteController(private val noteService: INoteService) {

    @GetMapping("/add")
    fun addNote(): Boolean {
        var note = Note()
        note.noteContent = "testContent"
        note.noteTitle = "testTitle"
        return noteService.addNote(note)
    }

    @GetMapping("/list")
    fun listNote(pageIndex: Int): Map<String, Any> {
        val resultMap = HashMap<String, Any>()
        val page = noteService.listNote(pageIndex)
        resultMap["totalPage"] = page.totalPages
        resultMap["noteData"] = page.content
        return resultMap
    }

}