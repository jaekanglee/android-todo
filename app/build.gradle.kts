plugins {
    id(GradlePluginId.ANDROID_APP)
    id(GradlePluginId.BASE_GRADLE_PLUGIN)
    //id(GradlePluginId.googlePluginService)
   // id("com.google.firebase.crashlytics")
}

android {

    defaultConfig {
        applicationId = AppConfig.id
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isDebuggable = false

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )


            manifestPlaceholders["appName"] = "투두"
            manifestPlaceholders["appIcon"] = "@mipmap/ic_launcher"
        }

        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            applicationIdSuffix = ".dev"


            manifestPlaceholders["appName"] = "투두"
            manifestPlaceholders["appIcon"] = "@mipmap/ic_launcher"
        }
    }

    buildFeatures {
        dataBinding = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //implementation(platform("com.google.firebase:firebase-bom:26.1.1"))
//
//    implementation(project(Modules.base))
//    implementation(project(Modules.baseTest))
//    implementation(project(Modules.data))
//    implementation(project(Modules.dataremote))
//    implementation(project(Modules.domain))
//    implementation(project(Modules.presentation))


   // implementationList(LibraryList.FirebaseLibraries)
   // implementationList(LibraryList.SnsLogin)
}