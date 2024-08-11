@file:Suppress("SpellCheckingInspection")

fun main() {

    println("")

    // Usando un par (Pair)
    // `to` es una función infix que crea un Pair (una pareja) de dos valores.
    // Aquí, estamos emparejando "fish net" con "catching fish".
    val equipment = "fish net" to "catching fish"
    // Usamos `first` y `second` para acceder a los elementos del par.
    println("${equipment.first} used for ${equipment.second}")

    println("")

    // Usando un triple (Triple)
    // Triple nos permite agrupar tres valores. Aquí, creamos un triple de números.
    val numbers = Triple(6, 9, 42)
    // `toString` convierte el triple en una cadena legible.
    println(numbers.toString())
    // `toList` convierte el triple en una lista, lo que facilita el manejo de los elementos.
    println(numbers.toList())

    println("")

    // Usando un par anidado
    // Aquí, creamos un par anidado: el primer elemento es un par y el segundo es un String.
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    // Accedemos a los elementos del par anidado usando `first` y `second`.
    println("${equipment2.first} is ${equipment2.second}")
    // Accedemos al segundo elemento del par interno.
    println(equipment2.first.second)

    println("")

    // Desestructuración de un par
    // Desestructuración permite desempaquetar los elementos de un par en variables individuales.
    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    // Ahora `tool` contiene "fish net" y `use` contiene "catching fish".
    println("$tool is used for $use")

    println("")

    // Desestructuración de un triple
    // Similar a los pares, podemos desestructurar un triple en tres variables.
    val numbers2 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers2
    // Ahora tenemos los tres números asignados a `n1`, `n2`, y `n3`.
    println("$n1 $n2 $n3")
}
