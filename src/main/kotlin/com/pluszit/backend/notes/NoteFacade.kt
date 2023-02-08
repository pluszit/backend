package com.pluszit.backend.notes

import com.pluszit.backend.notes.domain.Note
import com.pluszit.backend.notes.infra.mongo.NoteDocument
import com.pluszit.backend.notes.infra.mongo.NoteRepository

class NoteFacade(private val noteRepository: NoteRepository) {
    fun addNote(note: Note)  = noteRepository.save(NoteDocument.from(note))
    fun getAllNotes() = noteRepository.findAll()
}