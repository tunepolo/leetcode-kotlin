plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}