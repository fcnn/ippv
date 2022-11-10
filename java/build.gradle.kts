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
	sourceCompatibility = JavaVersion.VERSION_19
	targetCompatibility = JavaVersion.VERSION_19
}

tasks.withType<JavaCompile> {
	options.release.set(19)
}

repositories {
	mavenCentral()
}

dependencies {
	//implementation("com.google.guava:guava:+")
	//implementation("org.bouncycastle:bcprov-jdk15on:+")
	//implementation("org.bouncycastle:bcpkix-jdk15on:+")
}

application {
	//mainClassName = "com.y.ippv.Main"
}

tasks.wrapper {
  gradleVersion = "8.0-milestone-3"
  distributionType = Wrapper.DistributionType.ALL
}
