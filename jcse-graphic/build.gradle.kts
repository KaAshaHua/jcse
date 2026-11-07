plugins {
    id("jcse.java-library")
}

val lwjglNatives = listOf("natives-linux", "natives-windows")
val lwjglModules = listOf(
    "lwjgl",
    "lwjgl-freetype",
    "lwjgl-glfw",
    "lwjgl-openal",
    "lwjgl-opengl",
    "lwjgl-stb",
)

dependencies {
    api(project(":jcse-core"))
    api(libs.joml)

    implementation(platform(libs.lwjgl.bom))
    implementation(libs.lwjgl.core)
    implementation(libs.lwjgl.freetype)
    implementation(libs.lwjgl.glfw)
    implementation(libs.lwjgl.openal)
    implementation(libs.lwjgl.opengl)
    implementation(libs.lwjgl.stb)

    lwjglNatives.forEach { natives ->
        lwjglModules.forEach { module ->
            runtimeOnly("org.lwjgl:$module::$natives")
        }
    }
}