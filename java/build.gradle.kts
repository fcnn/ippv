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
	sourceCompatibility = JavaVersion.VERSION_18
	targetCompatibility = JavaVersion.VERSION_18
}

tasks.withType<JavaCompile> {
	options.release.set(18)
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
	mainClassName = "com.y.ippv.Main"
}

tasks.wrapper {
  gradleVersion = "7.5-rc-1"
  distributionType = Wrapper.DistributionType.ALL
}
