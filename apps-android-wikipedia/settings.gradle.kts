pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

include(":app")

// Replace "flutter_module" with whatever package_name you supplied when you ran:
// `$ flutter create -t module [package_name]
val filePath = settingsDir.parentFile.toString() + "/wikipedia_flutter_module/.android/include_flutter.groovy"
apply(from = File(filePath)

// Note
// The ability to invoke include_flutter.groovy from Kotlin code requires Flutter 3.27.