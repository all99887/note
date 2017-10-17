package com.lyx.noteapi.service.impl

import com.lyx.noteapi.dao.INoteDao
import com.lyx.noteapi.entity.po.Note
import com.lyx.noteapi.service.INoteService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort


@Service
@Transactional
class NoteServiceImpl(private val noteDao: INoteDao) : INoteService {
    override fun listNote(pageIndex: Int): Page<Note> {
        val sort = Sort(Sort.Direction.DESC, "createTime")
        val pageable = PageRequest(pageIndex, 5, sort)
        return noteDao.findAll(pageable)
    }

    override fun addNote(note: Note): Boolean {
        return noteDao.save(note) != null
    }

}