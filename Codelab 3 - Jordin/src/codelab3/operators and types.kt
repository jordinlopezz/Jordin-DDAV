@file:Suppress("""SpellCheckingInspection""")

package codelab3

fun main() {

    // Uso de tipos

    val i = 6

    val b1 = i.toByte()
    println(b1) // Imprime el valor convertido a Byte

    val b2: Byte = 1
    println(b2) // Imprime el valor de b2

    /*
    val i1: Int = b2
    val i2: String = b2
    val i3: Double = b2
    */

    val i4: Int = b2.toInt() // ¡OK!
    println(i4) // Imprime el valor convertido a Int

    val i5: String = b2.toString()
    println(i5) // Imprime el valor convertido a String

    val i6: Double = b2.toDouble()
    println(i6) // Imprime el valor convertido a Double

    // Tipos de variables

    /*
    var fish = 1
    fish = 2
    val aquarium = 1
    aquarium = 2
    */

    // Cadenas

    val numberOfFish = 5
    val numberOfPlants = 12
    print("Tengo $numberOfFish peces y $numberOfPlants plantas \n") // Imprime la cantidad de peces y plantas
    print("Tengo ${numberOfFish + numberOfPlants} peces y plantas") // Imprime la suma de peces y plantas

}
