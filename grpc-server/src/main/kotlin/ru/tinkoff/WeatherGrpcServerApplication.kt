package ru.tinkoff

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class WeatherGrpcServerApplication

fun main(args: Array<String>) {
    runApplication<WeatherGrpcServerApplication>(args = args)
}
