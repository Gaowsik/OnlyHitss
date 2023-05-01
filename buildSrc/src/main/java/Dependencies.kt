object ApplicationId {
    const val id = "com.codezync.onlyhitss"
}

object Modules {

    //App  Feature Layer
    const val app = ":app"

    //App Core extensions Layer
    const val core = ":core"

    //presentation Layer {styles and colors}
    const val presentation = ":presentation"

    //Retrofit And API Layer
    const val network = ":network"
}

object ApkFormat {
    const val prefix = "pat_pat_partner_"
}


object Releases {

    const val versionCode = 17

    //    const val versionName = "1.0.2.4"   // Internal release version
    const val versionName = "2.0.3"

}

object Versions {

    const val compileSdk = 33
    const val buildToolsVersion = "30.0.2"

    const val minSdk = 19
    const val targetSdk = 33
    const val gradle_plugin = "3.4.2"

    const val kotlin = "1.7.20"

    const val ktx = "1.7.0"
    const val koin = "2.1.6"
    const val rxjava = "2.2.6"
    const val rxkotlin = "2.3.0"

    const val retrofit = "2.9.0"
    const val retrofitJson = "2.9.0"
    const val curlInterceptor = "0.1"


    const val permission = "4.8.0"
    const val pinEntryEditText = "2.0.6"
    const val countryCodePicker = "2.4.0"
    const val drawerLayoutBehaviour = "1.0.4"
    const val lottieVersion = "3.4.4"
    const val roundedimageview = "2.3.0"
    const val spinKitView = "1.4.0"
    const val circularMusicProgressbar = "v1.3.0"
    const val circularProgressIndicator = "1.3.0"
    const val otpView = "2.1.2"

    const val sdkVersion = "28.0.0"
    const val appcompat = "1.3.0"
    const val design = "1.3.0"
    const val cardview = "1.0.0"
    const val recyclerview = "1.0.0"
    const val support = "1.0.0"
    const val constraintlayout = "2.0.4"
    const val coroutines = "1.4.0"
    const val maps = "17.0.0"
    const val location = "17.1.0"
    const val places = "2.4.0"
    const val places_ktx = "0.2.2"
    const val mapsUtills = "2.0.3"
    const val mapsUtills_ktx = "2.2.0"
    const val lifecycle = "2.0.0"
    const val multidex = "2.0.1"
    const val play_services_base = "17.5.0"
    const val swipeRefresh = "1.1.0"
    const val fragmentKtx = "1.2.5"
    const val fragment = "1.3.0"
    const val activityKtx = "1.4.0"
    const val liveDataKtx = "2.2.0"
    const val lifeCycleKtx = "2.2.0"

    const val playcore = "1.3.7"
    const val googleauth = "17.0.0"
    const val googleservices = "4.2.0"

    const val room = "2.2.5"


    const val firebasesBom = "30.0.1"


    const val timber = "4.7.1"
    const val glide = "4.9.0"
    const val crashlytics = "2.9.9"

    const val volley = "1.1.0"
    const val gson = "2.8.9"
    const val okhttp = "4.9.0"

    const val butterKnife = "10.1.0"
    const val anko = "0.10.8"

    const val moshi = "1.8.0"
    const val threetenabp = "1.1.1"

    const val dagger = "2.19"
    const val stetho = "1.5.0"

    const val test_runner = "1.0.2"
    const val junit = "4.12"
    const val espresso = "3.3.0"
    const val mockito = "2.21.0"

    const val trail = "v1.51"
    const val circularImageView = "4.2.0"
    const val coilImageLoader = "1.1.0"
}


object Kotlin {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Androidx {

    const val gredle_plugin = "com.android.tools.build:gradle:3.2.1"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material_design = "com.google.android.material:material:${Versions.design}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val legacysupport = "androidx.legacy:legacy-support-v4:${Versions.support}"

    const val mulidex = "androidx.multidex:multidex:${Versions.multidex}"

    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val swipeRefresh =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefresh}"

    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtx}"
    const val fragment = "androidx.fragment:fragment:${Versions.fragment}"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveDataKtx}"
    const val lifeCycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleKtx}"


}

object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.room}"
    const val compiler = "androidx.room:room-compiler:${Versions.room}"
    const val room_rxjava = "androidx.room:room-rxjava2:${Versions.room}"
}

object Lifecycle {
    const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
}

object Googlelibraries {
    const val auth = "com.google.android.gms:play-services-auth:${Versions.googleauth}"
    const val playcore = "com.google.android.play:core:${Versions.playcore}"
    const val maps = "com.google.android.gms:play-services-maps:${Versions.maps}"
    const val place = "com.google.android.Libraries.places:places:${Versions.places}"
    const val places_ktx = "com.google.places.android:places-ktx:${Versions.places_ktx}"
    const val location = "com.google.android.gms:play-services-location:${Versions.location}"
    const val map_utills = "com.google.maps.android:android-maps-utils:${Versions.mapsUtills}"
    const val map_utills_ktx = "com.google.maps.android:maps-utils-ktx:${Versions.mapsUtills_ktx}"
    const val play_services_base =
        "com.google.android.gms:play-services-basement:${Versions.play_services_base}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
}

object Firebaselibraries {
    val auth = "com.google.firebase:firebase-auth"
    val core = "com.google.firebase:firebase-core"
    val database = "com.google.firebase:firebase-database-ktx"
    val database_ui = "com.firebaseui:firebase-ui-database:6.0.2"
    val analytics = "com.google.firebase:firebase-analytics-ktx"
    val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    val messaging = "com.google.firebase:firebase-messaging-ktx"
    val firestore_database = "com.google.firebase:firebase-firestore-ktx"
    val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebasesBom}"
}

object Moshi {
    const val runtime = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val adapter = "com.squareup.moshi:moshi-adapters:${Versions.moshi}"
    const val kotlin = "com.squareup.moshi:moshi-Kotlin:${Versions.moshi}"
}

object Externallib {
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val volley = "com.android.volley:volley:${Versions.volley}"

    const val butterKnife = "com.jakewharton:butterknife:${Versions.butterKnife}"
    const val butterKnifeCompiler = "com.jakewharton:butterknife-compiler:${Versions.butterKnife}"

    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"

    //  https://github.com/Kotlin/anko
    const val anko = "org.jetbrains.anko:anko:${Versions.anko}"

    const val threetenabp = "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabp}"


    const val loader = "com.github.ybq:Android-SpinKit:1.4.0"
    const val countryPick = "com.hbb20:ccp:2.3.1"
    const val facebookSdk = "com.facebook.android:facebook-login:[5,6)"
    const val exoplayer = "com.google.android.exoplayer:exoplayer:2.9.5"
    const val imagepicker = "com.github.dhaval2404:imagepicker:1.3"
    const val cropper = "com.isseiaoki:simplecropview:1.1.8"
    const val imageSelecter = "com.github.LuckSiege.PictureSelector:picture_library:v2.2.4"

    const val permissionDispatcher =
        "org.permissionsdispatcher:permissionsdispatcher:${Versions.permission}"
    const val permissionDispatcherProcessor =
        "org.permissionsdispatcher:permissionsdispatcher-processor:${Versions.permission}"

    const val rate = "me.zhanghai.android.materialratingbar:library:1.3.2"
    const val emoji = "com.vanniktech:emoji-google:0.6.0"

    const val filePicker = "com.droidninja:filepicker:2.2.1"
    const val imageViwer = "com.github.stfalcon:stfalcon-imageviewer:0.1.0"
    const val pinEntryEditText = "com.alimuzaffar.lib:pinentryedittext:${Versions.pinEntryEditText}"
    const val countryCodePicker = "com.hbb20:ccp:${Versions.countryCodePicker}"
    const val drawerLayoutBehavior =
        "com.infideap.drawerbehavior:drawer-behavior:${Versions.drawerLayoutBehaviour}"
    const val lottieAnimations = "com.airbnb.android:lottie:${Versions.lottieVersion}"
    const val roundedImageView = "com.makeramen:roundedimageview:${Versions.roundedimageview}"
    const val spinKitView = "com.github.ybq:Android-SpinKit:${Versions.spinKitView}"
    const val circularMusicProgressbar =
        "com.github.aliab:circular-music-progressbar:${Versions.circularMusicProgressbar}"
    const val circularProgressIndicator =
        "com.github.antonKozyriatskyi:CircularProgressIndicator:${Versions.circularProgressIndicator}"
    const val otpView =
        "com.github.mukeshsolanki:android-otpview-pinview:${Versions.otpView}"
    const val trailView =
        "com.github.amalChandran:trail-android:${Versions.trail}"
    const val circularImageView = "com.mikhaellopez:circularimageview:${Versions.circularImageView}"
    const val coilImageLoader = "io.coil-kt:coil:${Versions.coilImageLoader}"

}

object ApiLiveServer {
    const val auth_api_url = "\"https://auth.patpatgo.net\""
    const val main_api_url = "\"https://api.patpatgo.net\""
}

object ApiDemoServer {
    const val auth_api_url = "\"https://auth.patpatgo.net\""
    const val main_api_url = "\"https://api.patpatgo.net\""
}

object GoogleMapUrl {
    const val url = "\"https://maps.googleapis.com/maps/\""
}


object Retrofit {
    const val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitJson}"
    const val moshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val curl_logger =
        "com.github.grapesnberries:curlloggerinterceptor:${Versions.curlInterceptor}"
}

object Okhttp {
    const val runtime = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
}

object Dagger {
    const val runtime = "com.google.dagger:dagger:${Versions.dagger}"
    const val android = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val android_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val android_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
}

object Glide {
    const val runtime = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

object Reactivex {
    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
}

object Koin {
    const val android = "org.koin:koin-android:${Versions.koin}"
    const val viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val scope = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val ext = "org.koin:koin-android-ext:${Versions.koin}"

}

object Testing {
    const val test_runner = "com.android.support.test:runner:${Versions.test_runner}"
    const val junit = "junit:junit:${Versions.junit}"
    const val mock_core = "org.mockito:mockito-core:${Versions.mockito}"
    const val espresso_core = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
}

object Stetho {
    const val runtime = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val okhttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
}
