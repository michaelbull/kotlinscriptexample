package com.github.michaelbull.kotlinscriptexample

import kotlin.script.experimental.annotations.KotlinScript

@KotlinScript(
    displayName = "Custom script definition",
    fileExtension = "custom.kts",
)
abstract class CustomScriptDefinition {

    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun helloWorld() {
        println("Hello $name")
    }
}
