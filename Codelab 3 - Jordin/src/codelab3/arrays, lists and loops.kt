@file:Suppress("KotlinConstantConditions", "SpellCheckingInspection")
package codelab3

fun main() {

    // Listas

    println("")

    val school = listOf("caballo", "trucha", "halibut")
    println(school) // Imprime la lista de peces

    println("")

    val myList = mutableListOf("atún", "salmón", "tiburón")
    myList.remove("tiburón") // Elimina "tiburón" de la lista

    // Matrices

    val school2 = arrayOf("tiburón", "salmón", "pececillo")
    println(school2.contentToString()) // Imprime la matriz de peces

    // Matriz con múltiples tipos de datos

    arrayOf("pez", 2) // Matriz con un String y un Int

    // Matriz de enteros

    intArrayOf(1, 2, 3) // Matriz de enteros

    // Combinación de matrices
    println("")
    val numbers2 = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers2
    println(foo2[5]) // Imprime el sexto elemento de la matriz combinada

    // Combinaciones de matrices y listas anidadas
    println("")
    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlántico", "Pacífico")
    val oddList = listOf(numbers4, oceans, "salmón")
    println(oddList) // Imprime la lista anidada

    // Inicializar matrices con código
    println("")
    val array = Array (5) { it * 2 }
    println(array.contentToString()) // Imprime la matriz inicializada

    // Bucles

    println("")
    val school3 = arrayOf("tiburón", "salmón", "pececillo")
    for (element in school3) {
        print("$element ") // Imprime cada elemento de la matriz
    }

    println("\n")
    for ((index, element) in school.withIndex()) {
        println("El elemento en el índice $index es $element\n") // Imprime el índice y el elemento de la lista
    }
    println("\n")
    for (i in 1..5) print(i) // Imprime los números del 1 al 5
    println("\n")
    for (i in 5 downTo 1) print(i) // Imprime los números del 5 al 1
    println("\n")
    for (i in 3..6 step 2) print(i) // Imprime los números del 3 al 6 con paso 2
    println("\n")
    for (i in 'd'..'g') print (i) // Imprime los caracteres de 'd' a 'g'

    println("\n")

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles burbujas en el agua\n") // Imprime el número de burbujas en el agua

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles burbujas en el agua\n") // Imprime el número de burbujas en el agua después del bucle do-while

    repeat(2) {
        println("Un pez está nadando") // Imprime el mensaje dos veces
    }

}
