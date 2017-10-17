package com.lyx.noteapi.service

import com.lyx.noteapi.entity.po.Note
import org.springframework.data.domain.Page

interface INoteService {
    fun addNote(note: Note): Boolean

    fun listNote(pageIndex: Int): Page<Note>
}