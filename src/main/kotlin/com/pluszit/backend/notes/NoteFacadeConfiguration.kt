package com.pluszit.backend.notes

import com.pluszit.backend.notes.infra.mongo.NoteRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class NoteFacadeConfiguration {
    @Bean
    fun noteFacade(noteRepository: NoteRepository): NoteFacade = NoteFacade(noteRepository)
}