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
    }
}

rootProject.name = "ComposeDestinations"
include(":multimoduleapp:app")
include(":multimoduleapp:featuretwo")
include(":multimoduleapp:featureone")
include(":singlemoduleapp")
