pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "ChessClocks"
include(":app")
include(":database")
include(":features:settings")
include(":core:database")
include(":features:clocks")
include(":features:customizeclocks")
include(":features:mainscreen")
include(":features:fideevents")
include(":core:ui")
include(":core:extensions")
