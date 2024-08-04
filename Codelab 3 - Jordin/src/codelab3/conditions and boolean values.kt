@file:Suppress("KotlinConstantConditions", "SpellCheckingInspection")
package codelab3

fun main() {

    // Declaración de variables
    val numberOfFish = 50
    val numberOfPlants = 23

    println("") // Imprime una línea en blanco

    // Verifica si el número de peces es mayor que el número de plantas
    if (numberOfFish > numberOfPlants) {
        println("¡Buena proporción!") // Imprime si la proporción es buena
    } else {
        println("Proporción no saludable") // Imprime si la proporción no es saludable
    }

    println("") // Imprime una línea en blanco

    val fish = 50
    // Verifica si el número de peces está entre 1 y 100
    if (fish in 1..100) {
        println(fish) // Imprime el número de peces
    }

    println("") // Imprime una línea en blanco

    // Verifica el número de peces y da un mensaje apropiado
    if (numberOfFish == 0) {
        println("Tanque vacío") // Imprime si no hay peces
    } else if (numberOfFish < 40) {
        println("¡Hay peces!") // Imprime si hay menos de 40 peces
    } else {
        println("¡Eso es un montón de peces!") // Imprime si hay 40 o más peces
    }

}
