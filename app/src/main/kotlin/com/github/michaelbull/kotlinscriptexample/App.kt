package com.github.michaelbull.kotlinscriptexample

import io.github.classgraph.ClassGraph

fun main() {
    println("Starting...")

    ClassGraph().acceptPackages("com.github.michaelbull.kotlinscriptexample").scan().use { result ->
        for (classInfo in result.getSubclasses("com.github.michaelbull.kotlinscriptexample.CustomScriptDefinition")) {
            println("found custom script: ${classInfo.name}")
            val clazz = classInfo.loadClass(CustomScriptDefinition::class.java)
            val constructor = clazz.getConstructor()
            val instance = constructor.newInstance()
            instance.helloWorld()
        }
    }
}
