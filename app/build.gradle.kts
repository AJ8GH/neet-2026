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

kotlin {
  jvmToolchain(libs.versions.java.get().toInt())
}

tasks.withType<Test> {
  useJUnitPlatform()
  finalizedBy(
    tasks.koverHtmlReport,
    tasks.koverXmlReport,
  )
}

// kover {
//   reports {
//     filters {
//       excludes {
//         classes(
//           "$group.",
//           "$group."
//         )
//       }
//     }
//   }
// }
