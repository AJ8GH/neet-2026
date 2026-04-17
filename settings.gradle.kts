plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

val projectName: String by settings
val projectAppModule: String by settings

rootProject.name = projectName
include(projectAppModule)
