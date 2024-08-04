@file:Suppress("CanSealedSubClassBeObject", "unused", "SpellCheckingInspection")

package example.myapp

// Clase abstracta que implementa la interfaz FishAction
abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum") // Implementación de la función eat
}

// Clase Shark que implementa las interfaces FishAction y FishColor
class Shark: FishAction, FishColor {
    override val color = "gris"
    override fun eat() {
        println("cazar y comer peces")
    }
}

// Clase Plecostomus que implementa las interfaces FishAction y FishColor usando delegación
class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("comer algas"),
    FishColor by fishColor

// Interfaz FishAction con una función eat
interface FishAction  {
    fun eat()
}

// Interfaz AquariumAction con varias funciones relacionadas con la acción en un acuario
interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim()  {
        println("nadar")
    }
}

// Interfaz FishColor con una propiedad color
interface FishColor {
    val color: String
}

// Objeto GoldColor que implementa la interfaz FishColor
object GoldColor : FishColor {
    override val color = "dorado"
}

// Clase PrintingFishAction que implementa la interfaz FishAction
class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

// Clase sellada Seal y sus subclases
sealed class Seal
class SeaLion : Seal()
data object Walrus : Seal()

// Función que usa when para diferenciar las subclases de Seal
fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "morsa"
        is SeaLion -> "león marino"
    }
}
