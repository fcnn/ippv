import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	extra.apply {
		set("kotlinVersion", "1.8.0-Beta")
	}

	repositories {
		mavenCentral()
		gradlePluginPortal()
		maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
	}

	dependencies {
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${property("kotlinVersion")}")
	}
}

plugins {
	id("java")
	id("application")
	kotlin("jvm") version("${property("kotlinVersion")}")
	id("io.spring.dependency-management") version("1.1.0")
}

group = "com.my"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_19
	targetCompatibility = JavaVersion.VERSION_19
}

tasks.withType<KotlinCompile> {
        kotlinOptions {
                jvmTarget = "19"
                freeCompilerArgs = listOf("-Xjsr305=strict")
        }
}

tasks.withType<JavaCompile> {
	options.release.set(19)
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/snapshot") }
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
}

application {
	//mainClassName = "com.y.ippv.MainKt"
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib:${property("kotlinVersion")}")
}

tasks.wrapper {
	gradleVersion = "8.0-milestone-3"
	distributionType = Wrapper.DistributionType.ALL
}
