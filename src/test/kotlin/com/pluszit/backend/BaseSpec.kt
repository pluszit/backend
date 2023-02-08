package com.pluszit.backend

import com.pluszit.backend.notes.NoteFacade
import io.kotest.core.spec.style.StringSpec

open class BaseSpec: StringSpec() {
    private val inMemoryNoteRepository: InMemoryNoteRepository = InMemoryNoteRepository()
    val noteFacade: NoteFacade = NoteFacade(inMemoryNoteRepository)
}