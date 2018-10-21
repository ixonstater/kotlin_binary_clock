cd ../
kotlinc src/main/kotlin/main.kt src/packages/clock.kt src/packages/time_to_binary.kt src/packages/update_actions.kt -include-runtime -d main.jar
java -jar main.jar
