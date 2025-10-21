plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    // Plugin 'kotlin-compose' không cần thiết khi dùng BOM và thiết lập buildFeatures.compose
    // alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.tuan3"
    compileSdk = 36 // Giữ nguyên, hoặc bạn có thể dùng 34 nếu gặp vấn đề với các phiên bản alpha

    defaultConfig {
        applicationId = "com.example.tuan3"
        minSdk = 24
        targetSdk = 36 // Giữ nguyên hoặc dùng 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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

    compileOptions {
        // Cập nhật lên Java 17 để tương thích tốt hơn với các thư viện Android mới
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        // Cập nhật lên jvmTarget 17
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    // XÓA BỎ composeOptions này đi. BOM sẽ tự quản lý phiên bản compiler.
    // composeOptions {
    //     kotlinCompilerExtensionVersion = "1.5.8"
    // }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Các thư viện core giữ nguyên
    implementation("androidx.core:core-ktx:1.12.0") // Hoặc phiên bản mới hơn như 1.17.0
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0") // Hoặc 2.9.4
    implementation("androidx.activity:activity-compose:1.8.2") // Hoặc 1.11.0

    // --- ĐÂY LÀ PHẦN QUAN TRỌNG NHẤT ---

    // 1. Sử dụng Compose BOM (Bill of Materials) để quản lý phiên bản
    // Phiên bản 2024.05.00 là phiên bản ổn định gần đây, bạn có thể dùng 2024.09.00 nếu muốn thử bản mới nhất
    val composeBom = platform("androidx.compose:compose-bom:2024.05.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    // 2. Triển khai các thư viện Compose mà không cần chỉ định phiên bản
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")

    // 3. XÓA BỎ Material 2 và THAY THẾ bằng Material 3
    // implementation("androidx.compose.material:material") // <-- XÓA DÒNG NÀY
    implementation("androidx.compose.material3:material3") // <-- THÊM DÒNG NÀY

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")

    // Debug
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
