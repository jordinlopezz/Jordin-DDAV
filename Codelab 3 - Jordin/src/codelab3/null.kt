@file:Suppress("KotlinConstantConditions", "SpellCheckingInspection")

package codelab3

import java.util.*


fun main() {
    // Ejemplo 1: Uso de un valor nulo y captura de NullPointerException
    var s: String? = null

    try {
        // Intentar acceder a la longitud de una cadena que podría ser null
        val length = s!!.length // Esto lanzará NullPointerException si s es null
        println("La longitud de la cadena es: $length")
    } catch (e: NullPointerException) {
        println("Se ha producido una NullPointerException: ${e.message}")
    }

    // Ejemplo 2: Uso de llamada segura y operador Elvis
    s = "Hola, Kotlin!"
    val safeLength = s.length // No lanzará excepción, sino que retornará 0 si s es null
    println("La longitud de la cadena segura es: $safeLength")

    // Ejemplo 3: Uso de una función que puede lanzar una excepción
    try {
        val result = divide(10, 0) // Intentar dividir por cero
        println("El resultado de la división es: $result")
    } catch (e: ArithmeticException) {
        println("Se ha producido una ArithmeticException: ${e.message}")
    }

    // Ejemplo adicional: Uso de funciones que manejan valores nulos
    val userInput: String? = getUserInput() // Obtener entrada del usuario que podría ser null

    // Verificar si la entrada del usuario es nula usando llamada segura
    val inputLength = userInput?.length ?: -1 // Retorna -1 si userInput es null
    println("La longitud de la entrada del usuario es: $inputLength")

    // Procesar la entrada del usuario con una función que maneja valores nulos
    val processedInput = processInput(userInput)
    println("Entrada del usuario procesada: $processedInput")
}

// Función que simula obtener una entrada del usuario que podría ser null
fun getUserInput(): String? {
    // Simulación: en un caso real, esto podría provenir de un formulario o entrada del usuario
    return null // Cambia esto a una cadena no nula para probar diferentes escenarios
}

// Función que procesa la entrada del usuario y maneja valores nulos
fun processInput(input: String?): String {
    // Usar el operador Elvis para proporcionar un valor por defecto si la entrada es null
    return input?.uppercase(Locale.getDefault()) ?: "Entrada no proporcionada"
}

// Función que puede lanzar ArithmeticException si el divisor es 0
fun divide(numerator: Int, denominator: Int): Int {
    if (denominator == 0) {
        throw ArithmeticException("División por cero no permitida.")
    }
    return numerator / denominator
}
