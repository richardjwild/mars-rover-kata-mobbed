# Gradle Project Template

On windows use `gradlew.bat` instead of `./gradlew` to build.
You can also install gradle globally and then run just `gradle` and ignore `gradlew` script.

Build:

    ./gradlew clean jar

Test:

    ./gradlew clean test

Run:

    java -classpath ./build/libs/app.jar com.codurance.App

