package com.pluszit.backend.notes.infra.mongo

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "data-notes", path = "data-notes")
interface NoteRestRepository : PagingAndSortingRepository<NoteDocument, Long> {
}