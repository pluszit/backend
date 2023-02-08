package com.pluszit.backend.notes.integration

import com.pluszit.backend.notes.domain.Note
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ShouldMakeCrudOperationsCorrectlyIntegSpec  : StringSpec({

    "my first test" {
        1 + 2 shouldBe 3
    }

    "should add a note" {
        // given
        val note = Note("This is my first note!!!")

        // when
//        facade.addNote(note)

        // then
//        facade.getAllNotes()
    }

})