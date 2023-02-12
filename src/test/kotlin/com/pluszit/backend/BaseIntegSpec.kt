package com.pluszit.backend

import com.pluszit.backend.notes.NoteFacade
import io.kotest.core.extensions.install
import io.kotest.core.spec.style.StringSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.extensions.testcontainers.TestContainerExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.MongoDBContainer
import org.testcontainers.utility.DockerImageName

@SpringBootTest
@ActiveProfiles("integration")
@EnableAutoConfiguration(exclude=[MongoAutoConfiguration::class])
class BaseIntegSpec: StringSpec() {
    override fun extensions() = listOf(SpringExtension)

    companion object {
        val mongoDBContainer = MongoDBContainer(DockerImageName.parse("mongo:latest"))

        @DynamicPropertySource
        @JvmStatic
        fun mongoDbProperties(registry: DynamicPropertyRegistry) {
            registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl)
        }

    }

    @Autowired
    lateinit var noteFacade: NoteFacade

    init {
        val client = install(TestContainerExtension(mongoDBContainer))
    }
}