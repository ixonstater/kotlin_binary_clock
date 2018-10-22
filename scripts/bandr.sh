cd ../
kotlinc src/main/kotlin/main.kt src/packages/clock.kt -include-runtime -d main.jar
java -jar main.jar
