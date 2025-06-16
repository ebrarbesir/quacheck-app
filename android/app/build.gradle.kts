plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services") // Firebase için
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.quacheck"
    compileSdk = 34  // Sabit olarak 33 verdim, istersen flutter.compileSdkVersion kullanabilirsin

    ndkVersion = "27.0.12077973"  // Firebase eklentileriyle uyumlu NDK versiyonu

    defaultConfig {
        applicationId = "com.example.quacheck"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
            isMinifyEnabled = true       // minify etkinleştirildi
            isShrinkResources = true    // shrinkResources etkinse bu da olmalı
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.15.0"))
    implementation("com.google.firebase:firebase-auth")
}
