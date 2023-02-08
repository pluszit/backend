package com.pluszit.backend.notes.infra.mongo

import com.pluszit.backend.notes.domain.Note
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class NoteDocument(@Id private val id: UUID, private val payload:String) {
    companion object {
        fun from(note: Note): NoteDocument = NoteDocument(UUID.randomUUID(), note.payload)
    }
}