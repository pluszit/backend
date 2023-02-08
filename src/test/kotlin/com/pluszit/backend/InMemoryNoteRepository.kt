package com.pluszit.backend

import com.pluszit.backend.notes.infra.mongo.NoteDocument
import com.pluszit.backend.notes.infra.mongo.NoteRepository
import reactor.core.publisher.Mono

class InMemoryNoteRepository: NoteRepository {
    override fun save(noteDocument: NoteDocument): Mono<NoteDocument> {
        TODO("Not yet implemented")
    }

}
