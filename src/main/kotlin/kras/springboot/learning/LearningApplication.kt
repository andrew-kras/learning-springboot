package kras.springboot.learning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LearningApplication

fun main(args: Array<String>) {
	runApplication<LearningApplication>(*args)
}
