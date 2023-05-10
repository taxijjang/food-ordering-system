plugins {
    kotlin("jvm") version "1.8.20"
}

group = "org.food.ordering.system"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}