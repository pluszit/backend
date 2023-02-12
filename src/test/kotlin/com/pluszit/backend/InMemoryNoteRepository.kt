package com.pluszit.backend

import com.pluszit.backend.notes.infra.mongo.NoteDocument
import com.pluszit.backend.notes.infra.mongo.NoteRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

class InMemoryNoteRepository: NoteRepository {
    private val notes = mutableMapOf<UUID, NoteDocument>()

    override fun save(noteDocument: NoteDocument): Mono<NoteDocument> {
        notes[noteDocument.id] = noteDocument
        return Mono.just(noteDocument)
    }

    override fun findAll(): Flux<NoteDocument> = Flux.fromIterable(notes.values)

}
