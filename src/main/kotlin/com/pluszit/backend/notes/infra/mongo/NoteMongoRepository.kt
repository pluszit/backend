package com.pluszit.backend.notes.infra.mongo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface NoteMongoRepository : ReactiveMongoRepository<NoteDocument, String> {
}