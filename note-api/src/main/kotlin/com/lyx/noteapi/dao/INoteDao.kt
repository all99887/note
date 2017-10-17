package com.lyx.noteapi.dao

import com.lyx.noteapi.entity.po.Note
import org.springframework.data.repository.CrudRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.query.Param


interface INoteDao : CrudRepository<Note, Long> {
    fun findAll(pageable: Pageable): Page<Note>
}