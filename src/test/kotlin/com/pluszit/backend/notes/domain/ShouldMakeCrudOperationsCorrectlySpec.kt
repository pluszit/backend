package com.pluszit.backend.notes.domain

import com.pluszit.backend.BaseSpec
import reactor.test.StepVerifier

class ShouldMakeCrudOperationsCorrectlySpec : BaseSpec() {

    init {
        "should add a note" {
            // given
            val note = Note("This is my first note!!!")

            // when
            noteFacade.addNote(note)

            // then
            StepVerifier.create(noteFacade.getAllNotes())
                .expectNextMatches { it.payload === note.payload }
                .verifyComplete()
        }
    }
}