@file:Suppress("SpellCheckingInspection")

package example.myapp

import java.lang.Math.PI

@Suppress("LeakingThis", "unused", "SpellCheckingInspection")


open class Aquarium(var length: Int = 100, var width: Int = 20, open var height: Int = 40) {

    open val shape = "rectángulo" // Forma predeterminada del acuario

    open val water: Double
        get() = volume * 0.9 // Calcula el agua ocupando el 90% del volumen

    open var volume
        get() = width * height * length / 1000 // Calcula el volumen en litros
        set(value) {
            height = (value * 1000) / (width * length) // Ajusta la altura según el volumen
        }

    init {
        println("inicializando acuario") // Mensaje de inicialización del acuario
    }
    /*init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${width * length * height / 1000} l")
    }*/

    fun printSize() {
        println(shape)
        println("Ancho: $width cm " +
                "Largo: $length cm " +
                "Alto: $height cm ")
        // 1 l = 1000 cm^3
        println("Volumen: $volume l Agua: $water l (${water/volume*100.0}% lleno)") // Imprime el tamaño del acuario y la cantidad de agua
    }

    // Constructores secundarios
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra para que no se derrame el agua
        val tank = numberOfFish * 2000 * 1.1

        // Calcula la altura necesaria
        height = (tank / (length * width)).toInt()
    }

}


class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // área de la elipse = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt() // Calcula el volumen del tanque cilíndrico
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt() // Ajusta la altura según el volumen
        }

    override var water = volume * 0.8 // Calcula el agua ocupando el 80% del volumen
    override val shape = "cilindro" // Forma del tanque cilíndrico
}
