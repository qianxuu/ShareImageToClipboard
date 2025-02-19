plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.qianxu.image.shareimagetoclipboard"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.qianxu.image.shareimagetoclipboard"
        minSdk = 29
        targetSdk = 35
        versionCode = 2
        versionName = "1.0.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

