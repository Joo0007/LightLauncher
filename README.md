# Light Launcher

A small, offline-first Android launcher starter project. Phase 1 focuses on a usable core rather than claiming to reproduce every feature of every launcher.

## Included in this phase

- Android HOME activity, selectable as the device's default launcher.
- Home screen with pinned app shortcuts; first launch shows up to 12 apps and explains how to pin favorites.
- App drawer, installed-app search, app launch, and long-press actions to pin/unpin or open Android's app-info page.
- Up-swipe opens the drawer; down-swipe returns to Home.
- System/light/dark theme choice and 3–6 column grid setting.
- No network, contacts, storage, location, or broad runtime permissions. Package visibility is limited to apps that declare a launcher activity.

## Not included yet

Widgets, icon packs, folders, wallpaper controls, notification badges, backup/restore, advanced gestures, per-icon customization, and vendor-specific shortcuts are not implemented. Android restricts some launcher behaviors; a launcher cannot grant itself every permission. This starter asks for no dangerous runtime permissions. The package visibility query is deliberately narrow; do not add `QUERY_ALL_PACKAGES` unless a later feature truly needs it and its distribution rules are understood.

## Build in Android Studio

1. Install a current Android Studio release and its Android SDK Platform 35. The project uses Android Gradle Plugin 8.7.3, Kotlin 2.0.21, JDK 17, and Gradle 8.9 (the included wrapper downloads the matching Gradle runtime during sync).
2. Extract the ZIP, then choose **File → Open** and select the `LightLauncher` folder (the one containing `settings.gradle.kts`).
3. Accept the Gradle sync prompt and install any requested SDK components. Then choose **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
4. Android Studio reports the generated APK location. Install it on your phone, open it, and choose **Light Launcher** when Android asks for a Home app. If it does not ask, use Android Settings → Apps → Default apps → Home app.

## Important caveats

This source has not been compiled, run, or tested on a device. It is an initial implementation, not a verified APK. Android Studio/Gradle may surface compile or device-specific issues; fix those before relying on it. The target SDK and APIs may need adjustment if your installed Android Studio is older. Android 8.0+ is the declared minimum.
