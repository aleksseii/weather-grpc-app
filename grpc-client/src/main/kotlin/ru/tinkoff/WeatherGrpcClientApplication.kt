package ru.tinkoff

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class WeatherGrpcClientApplication

fun main(args: Array<String>) {
    runApplication<WeatherGrpcClientApplication>(args = args)
}
