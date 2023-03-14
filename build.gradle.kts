plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.4.2").apply(false)
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("android").version("1.8.0").apply(false)
    kotlin("multiplatform").version("1.8.0").apply(false)
    //id("com.github.ben-manes.versions").version("0.46.0")
    id("nl.littlerobots.version-catalog-update").version("0.7.0")
    alias(libs.plugins.gradle.versions)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

apply("${project.rootDir}/buildScripts/toml-updater-config.gradle")
