plugins {
  id("com.android.application").version("8.0.0")
  id("org.jetbrains.kotlin.android").version("1.9.0")
}

android {
  namespace = "sample"
  compileSdk = 33
}

dependencies {
  implementation("androidx.datastore:datastore-preferences:1.1.0-alpha04")
  implementation("com.google.firebase:firebase-sessions:1.0.0")
}