package com.pluszit.backend.notes.infra.mongo

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface NoteRepository {
    fun save(noteDocument: NoteDocument): Mono<NoteDocument>
    fun findAll(): Flux<NoteDocument>
}