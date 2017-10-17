package com.lyx.noteapi.entity.po

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "note", indexes = arrayOf(Index(name = "title_index", columnList = "note_title")))
data class Note(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var noteId: Long = -1,
        @Column(name = "note_title", nullable = false, length = 32) var noteTitle: String = "",
        @Column(name = "note_content", nullable = false, length = 256) var noteContent: String = "",
        @Column(name = "create_time", nullable = false) var createTime: Date = Date(),
        @Column(name = "update_time", nullable = false) var updateTime: Date = Date(),
        @Column(name = "status", nullable = false) var status: Int = 0) {

}