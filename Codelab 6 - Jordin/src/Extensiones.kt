@file:Suppress("UnusedReceiverParameter", "unused", "SpellCheckingInspection")

// Función de extensión para `String` que verifica si la cadena contiene espacios.
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

// Función alternativa de extensión para `String` que también verifica espacios, usando una sintaxis más concisa.
fun String.hasSpacesAlt() = find { it == ' ' } != null

// Clase base `AquariumPlant` con propiedades privadas y métodos públicos.
open class AquariumPlant(val color: String, private val size: Int) {
    // Método para verificar si la planta es roja.
    fun isRed() = color == "red"

    // Método para verificar si la planta es grande, usando la propiedad privada `size`.
    // Nota: `size` es privado y no accesible fuera de esta clase.
    fun isBig() = size > 50
}

// Subclase `GreenLeafyPlant` que extiende `AquariumPlant` y usa el color verde.
class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

// Función de extensión para imprimir detalles de `AquariumPlant`.
fun AquariumPlant.print() = println("AquariumPlant")

// Función de extensión específica para `GreenLeafyPlant`, sobrescribe el método de la clase base.
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

// Propiedad de extensión para `AquariumPlant` que determina si la planta es verde.
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

// Función de extensión segura para `AquariumPlant?` que maneja casos nulos.
fun AquariumPlant?.pull() {
    this?.apply {
        println("Removing $this")
    }
}

fun main() {
    // Comprobación de espacios en la cadena usando funciones de extensión.
    println("")
    println("Does it have spaces? ${"Does it have spaces?".hasSpaces()}")  // Imprime: true
    println("Does it have spaces? ${"NoSpacesHere".hasSpacesAlt()}")       // Imprime: false

    // Uso de clases y funciones de extensión.
    val plant = GreenLeafyPlant(size = 10)
    plant.print() // Imprime: GreenLeafyPlant

    println("\n")

    // Uso de la clase base `AquariumPlant` para almacenar una instancia de `GreenLeafyPlant`.
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // Imprime: AquariumPlant (método de la clase base `AquariumPlant`)

    // Verificación si la planta es verde usando la propiedad de extensión `isGreen`.
    val isGreen = aquariumPlant.isGreen
    println("Is the plant green? $isGreen")  // Imprime: true

    // Manejo de un objeto `AquariumPlant` nulo con la función de extensión segura `pull`.
    val nullablePlant: AquariumPlant? = null
    nullablePlant.pull()  // No imprime nada porque la planta es nula
}