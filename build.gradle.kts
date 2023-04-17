plugins {
    `maven-publish`
}

allprojects {
    apply(plugin = "maven-publish")
}


dependencies {
    implementation(project(":checker"))
    implementation(project(":tickable"))
}
