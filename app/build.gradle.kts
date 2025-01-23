plugins {
    // Apply the shared build logic from a convention plugin.
    // The shared code is located in `buildSrc/src/main/kotlin/kotlin-jvm.gradle.kts`.
    id("buildsrc.convention.kotlin-jvm")

    application
}

dependencies {
    implementation(kotlin("scripting-common"))
    implementation(project(":script-definition"))
    implementation("io.github.classgraph:classgraph:4.8.179")

    runtimeOnly(project(":script-usage"))
}

application {
    mainClass.set("com.github.michaelbull.kotlinscriptexample.AppKt")
}
