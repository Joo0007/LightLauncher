plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.youssef.lightlauncher"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.youssef.lightlauncher"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    buildFeatures {
        buildConfig = false
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
