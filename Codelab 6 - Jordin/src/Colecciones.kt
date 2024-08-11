@file:Suppress("SpellCheckingInspection")

fun main() {

    // Colecciones: listas y mapas hash

    // Lista de enteros
    // `listOf` crea una lista inmutable de números enteros.
    // `sum` calcula la suma de todos los elementos en la lista.
    val list = listOf(1, 5, 3, 4)
    println(list.sum())  // Imprime: 13

    // Lista de cadenas
    // `listOf` también se usa para crear listas inmutables de cadenas.
    // `sumOf` permite sumar valores generados por una función lambda aplicada a cada elemento.
    // Aquí, sumamos la longitud de cada cadena en la lista.
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumOf { it.length })  // Imprime: 6

    // Iterador de lista
    // Usamos un iterador para recorrer los elementos de la lista `list3`.
    // `listIterator` permite iterar sobre la lista de manera bidireccional.
    val list3 = listOf("a", "bbb", "cc")
    for (s in list3.listIterator()) {
        println("$s ")  // Imprime cada elemento de la lista en una nueva línea.
    }

    // Mapa hash
    // `hashMapOf` crea un mapa hash que asocia claves (en este caso, síntomas de enfermedades de peces) con valores (las enfermedades correspondientes).
    // Los mapas hash son útiles para búsquedas rápidas.
    // Se puede acceder a los valores usando las claves, y si la clave no existe, devuelve `null`.
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures["white spots"])  // Imprime: Ich
    println(cures["red sores"])    // Imprime: hole disease
    println(cures["scale loss"])   // Imprime: null (ya que no existe esta clave en el mapa)
    // `getOrDefault` devuelve un valor por defecto si la clave no existe en el mapa.
    println(cures.getOrDefault("bloating", "sorry, I don't know"))  // Imprime: sorry, I don't know
    // `getOrElse` ejecuta un bloque de código y devuelve su resultado si la clave no existe.
    println(cures.getOrElse("bloating") { "No cure for this" })  // Imprime: No cure for this

    // Mapa mutable
    // `mutableMapOf` crea un mapa mutable, lo que significa que se puede modificar (añadir, eliminar elementos).
    // Aquí, se inicia con un ítem ("fish net") y se añade otro ("tank scrubber").
    val inventory = mutableMapOf("fish net" to 1)
    inventory["tank scrubber"] = 3
    println(inventory.toString())  // Imprime: {fish net=1, tank scrubber=3}
    // Se elimina "fish net" del inventario.
    inventory.remove("fish net")
    println(inventory.toString())  // Imprime: {tank scrubber=3}
}