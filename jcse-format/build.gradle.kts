plugins {
    id("jcse.java-library")
}

dependencies {
    api(project(":jcse-exception"))
    api(project(":jcse-config"))
    api(project(":jcse-util"))
    implementation(project(":jcse-annotation"))

    implementation("com.fasterxml.jackson.core:jackson-databind:2.20.1") 
}