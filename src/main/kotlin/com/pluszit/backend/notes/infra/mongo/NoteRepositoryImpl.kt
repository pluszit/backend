package com.pluszit.backend.notes.infra.mongo

import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
class NoteRepositoryImpl(private val noteMongoRepository: NoteMongoRepository) : NoteRepository {
    override fun save(noteDocument: NoteDocument): Mono<NoteDocument> =
        noteMongoRepository.save(noteDocument)

    override fun findAll(): Flux<NoteDocument> = noteMongoRepository.findAll()

}