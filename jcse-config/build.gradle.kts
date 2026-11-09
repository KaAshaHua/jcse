plugins {
    id("jcse.java-library")
}

dependencies {
    api(project(":jcse-exception"))
    api(project(":jcse-util"))
    implementation(project(":jcse-annotation"))
}