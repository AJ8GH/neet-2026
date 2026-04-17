plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.kover)
}

val projectGroup: String by project
val projectVersion: String by project

group = projectGroup
version = projectVersion

repositories {
  mavenLocal()
  mavenCentral()
  gradlePluginPortal()
}

dependencies {
  implementation(libs.bundles.implementation)
  testImplementation(libs.bundles.test.implementation)
  testRuntimeOnly(libs.bundles.test.runtimeOnly)
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(libs.versions.java.get())
  }
}

tasks.named<Test>("test") {
  useJUnitPlatform()
}
