plugins {
    id("jcse.java-library")
}

dependencies {
    api(project(":jcse-exception"))
    api(project(":jcse-util"))
    api(project(":jcse-format"))
    implementation(project(":jcse-annotation"))
}