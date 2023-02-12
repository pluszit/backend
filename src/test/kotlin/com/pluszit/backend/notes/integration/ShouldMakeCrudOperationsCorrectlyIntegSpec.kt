package com.pluszit.backend.notes.integration

import com.pluszit.backend.BaseIntegSpec
import com.pluszit.backend.notes.domain.Note

class ShouldMakeCrudOperationsCorrectlyIntegSpec : BaseIntegSpec() {
    init {
        "should add a note" {
            // given
            val note = Note("This is my first note!!!")

            // when
            // make mvc performer and controller
            noteFacade.addNote(note)

            // then
//        facade.getAllNotes()
        }
    }
}