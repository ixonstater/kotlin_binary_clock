cd ../
kotlinc src/main/kotlin/main.kt src/packages/clock.kt src/packages/update_display.kt -include-runtime -d main.jar
java -jar main.jar
