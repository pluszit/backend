package com.pluszit.backend.notes.domain

import com.pluszit.backend.BaseSpec
import io.kotest.matchers.shouldBe

class ShouldMakeCrudOperationsCorrectlySpec : BaseSpec() {

    init {
        "my first test" {
            1 + 2 shouldBe 3
        }

        "should add a note" {
            // given
            val note = Note("This is my first note!!!")

            // when
            noteFacade.addNote(note)

            // then
            //assert flux not empty
            noteFacade.getAllNotes() shouldHaveSize 1
        }
    }
}