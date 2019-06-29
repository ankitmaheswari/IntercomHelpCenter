# Weather

`Weather` is a simple Android application displaying the weather conditions of the user's location. It uses the free version of [apixu weather API](https://www.apixu.com/doc/) to fetch the weather data.

## Introduction
The working of the `Weather` app can be described as below:

- Retrieve the `current location` of the user device.
- Fetch the `current temperature` of the current location and display on the screen.
- Fetch the `average temperature forecasts` for the next `4 days` of the user's current location. Display the forecasts for the next 4 days.
-  In case an error or failure occurs, display the error screen showing an error message and a `retry button`.

## Getting Started

This project uses the Gradle build system. To build this project, use the `gradlew build` command or use `Import Project` in Android Studio.

There are two Gradle tasks for testing the project:

- `connectedAndroidTest` - for running UI tests on a connected device. Use the command `gradlew connectedAndroidTest` to run the UI tests.
- `test` - for running unit tests. Use the command `gradlew test` to run the UI tests.

## Architecture
The Weather app uses the `MVVM architecture`. The application is structured as following packages

-  <b>base</b>: It contains the base classes
-  <b>common</b>: It contains the common classes which provide functionalities to use across the application like the  network service, permission manager, model classes, etc.
-  <b>api</b>: It contains the api service generator and an api response observer.
-  <b>permissions</b>: It contains the permission manager to handle the `Android M runtime permissions` flow.
-  <b>rx</b>: It contains common utilities for fetching location and schedulers written using `RxJava`.
-  <b>Extensions.kt</b>: It contains `Kotlin` extension functions used in the app.

-  <b>forecast</b>: This package contains the MVVM stack for the core working of the application as described above.
-  <b>model</b>: This package contains all the data accessing and manipulating components.
-  <b>repository</b>: It contains the repository classes which actually fetches the data from the network api. This repository abstracts away the data fetching logic from the other layers.
- It also contains the model classes which are used for reading the response from the api service.
- <b>view</b>: This package contains all the view related classes.
- <i>ForecastActivity</i>: This `Activity` contains the various view related logics and code. This activity displays the forecast data.
- <i>ForecastListAdapter</i>: An implementation of  `RecyclerView Adapter` which is responsible for managing the list of temperature forecasts for the upcoming days.
- <i>ForecastViewHolder</i>: An implementation of the `RecyclerView ViewHolder` to bind the temperature forecast data to the list items.
- <b>view_model</b>: This layer contains the view model for the ForecastActivity.
- <i>ForecastViewModel</i>: An implementation of the `Android Architecture Components ViewModel` class. This class contains all the core logic of the temperature forecasts feature. It is responsible for triggering the data retrieval, converting the data received from the `model` layer in a form which can be easily consumed by the `view` layer.


`Classes have been designed in such a way that the dependency between the layers is in the form of contracts which can be easily mocked or stubbed while writing tests.`

## Libraries Used
- [Foundation](https://developer.android.com/jetpack/components) - Components for core system capabilities, Kotlin extensions and support for automated testing.
- AppCompat - Degrade gracefully on older versions of Android.
- Android KTX - Write more concise, idiomatic Kotlin code.
- Test - `JUnit` and `Mockito` for unit tests and `Espresso` for UI tests.

- [Architecture Components](https://developer.android.com/topic/libraries/architecture) - A collection of libraries that help you design robust, testable, and maintainable apps. Start with classes for managing your UI component lifecycle and handling data persistence.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Build data objects that notify views when the underlying database changes.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Store UI-related data that isn't destroyed on app rotations. Easily schedule asynchronous tasks for optimal execution.

- [RxJava 2](https://github.com/ReactiveX/RxJava): Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM.
- [Retrofit](https://square.github.io/retrofit/): Type-safe HTTP client for Android and Java.
- [Google Play Services - Location](https://developer.android.com/training/location): The location APIs available in Google Play services facilitate adding location awareness to your app with automated location tracking, geofencing, and activity recognition.


## Author
- <b>Ankit Maheswari</b>
- [Github](https://github.com/ankitmaheswari)
- [LinkedIn](https://www.linkedin.com/in/ankitmaheswari/)
