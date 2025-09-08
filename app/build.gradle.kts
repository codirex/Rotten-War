
plugins {
    id("com.android.application")
    
}

android {
    namespace = "org.codirex.rottenwar"
    compileSdk = 33
    
    defaultConfig {
        applicationId = "org.codirex.rottenwar"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
	implementation("com.badlogicgames.gdx:gdx:1.13.0")
	implementation("com.badlogicgames.gdx:gdx-box2d:3.1.1-0")
	implementation("com.badlogicgames.gdx:gdx-backend-android:1.13.0")
}
