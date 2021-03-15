buildscript {
    val kotlin_version by extra("1.4.31")
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(GradleClasspath.androidGradlePlugin)
        classpath(GradleClasspath.kotlinGradlePluginClasspath)
        classpath(GradleClasspath.hiltGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//        classpath(GradleClasspath.googleCrashlytics)
//        classpath(GradleClasspath.googleService)
//        classpath(GradleClasspath.safeArgs)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
       // maven("https://devrepo.kakao.com/nexus/content/groups/public/")
    }
}

task("clean") {
    delete(rootProject.buildDir)
}