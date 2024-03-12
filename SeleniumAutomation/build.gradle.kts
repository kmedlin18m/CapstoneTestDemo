plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    testImplementation ("org.testng:testng:7.3.0")
    testImplementation ("org.seleniumhq.selenium:selenium-java:4.18.1")
}

tasks.test {
    useJUnitPlatform()
}