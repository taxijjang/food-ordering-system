import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.11"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"

	kotlin("jvm") version "1.8.20"
	kotlin("plugin.spring") version "1.8.20"
	kotlin("kapt")
}

group = "com.food.ordering.system"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
//	implementation(project(":order-application-service"))

	implementation("com.github.ferstl:depgraph-maven-plugin:4.0.2")
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
