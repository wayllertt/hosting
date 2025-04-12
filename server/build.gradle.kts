plugins {
    id("org.springframework.boot") version "3.2.0" //плагин Spring Boot
    id("io.spring.dependency-management") version "1.1.4" //управление версиями
    kotlin("jvm") version "2.0.10" //просто виртуальная машина с котлина
    kotlin("plugin.spring") version "2.0.10" //поддержка котлин в спринг
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Spring Boot Starter Web (для REST API)
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Spring Data JPA (для работы с БД)
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // SQLite (лёгкая база данных)
    implementation("org.xerial:sqlite-jdbc:3.42.0.0")
    implementation("com.github.gwenn:sqlite-dialect:0.1.2")  // Диалект SQLite для Hibernate

    // Kotlin Serialization (для JSON)
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.3")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}