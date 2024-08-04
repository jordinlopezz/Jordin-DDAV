@file:Suppress("CanSealedSubClassBeObject", "unused", "SpellCheckingInspection")

package example.myapp

import example.myapp.decor.Direction
import example.myapp.decor.makeDecorations

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // altura y longitud por defecto
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // ancho por defecto
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // todo personalizado
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    // imprimir constructores secundarios
    println("\n")
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    println("\n")
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Tiburón: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    println("\n")
    buildAquarium()
    println("\n")
    makeFish()
    println("\n")
    makeDecorations()
    println("\n")
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}
