buildscript {
	repositories {
		mavenCentral()
	}
}

plugins {
	id("java")
	id("application")
}


group = "com.my"
version = "0.0.1-SNAPSHOT"
java {
	sourceCompatibility = JavaVersion.VERSION_16
	targetCompatibility = JavaVersion.VERSION_16
}

tasks.withType<JavaCompile> {
	options.release.set(16)
}

repositories {
	mavenCentral()
}

dependencies {
	//implementation("com.google.guava:guava:+")
	//implementation("org.bouncycastle:bcprov-jdk15on:+")
	//implementation("org.bouncycastle:bcpkix-jdk15on:+")
	implementation("io.lktk:blake3jni:0.2.2")
}

application {
	mainClassName = "com.my.ippv.Main"
}

tasks.wrapper {
  gradleVersion = "7.0.1"
  distributionType = Wrapper.DistributionType.ALL
}
