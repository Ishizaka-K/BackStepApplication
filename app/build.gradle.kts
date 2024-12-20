plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.backstepapplication"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.backstepapplication"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.material3.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Compose
    // https://developer.android.com/jetpack/androidx/releases/compose-foundation?hl=ja#structure
    implementation("androidx.compose.ui:ui:1.7.5")
    implementation("androidx.compose.ui:ui-tooling:1.7.5")
    implementation("androidx.compose.foundation:foundation:1.7.5")
    implementation("androidx.compose.animation:animation:1.7.5")
    implementation("androidx.compose.material:material:1.7.5")
    implementation("androidx.compose.material:material-icons-core:1.7.5")
    // setContentがNotFoundになるので
    implementation("androidx.activity:activity-compose:1.9.1")
    implementation(kotlin("script-runtime"))
    implementation("androidx.compose.material:material-icons-core:1.7.5")
    implementation("androidx.compose.material:material-icons-extended:1.7.5")

}