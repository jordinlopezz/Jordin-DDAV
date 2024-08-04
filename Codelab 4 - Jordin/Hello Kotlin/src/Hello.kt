@file:Suppress("KotlinConstantConditions", "SpellCheckingInspection")

import java.util.*    // Importación requerida

fun main(args: Array<String>) {
    println("Hola, ${args[0]}") // Imprime un saludo con el primer argumento

    // Asignará kotlin.Unit
    print("\n")
    val isUnit = println("Esto es una expresión")
    println(isUnit) // Imprime el valor de isUnit (que será kotlin.Unit)

    // Todo tiene un valor
    print("\n")
    val temperature = 10
    val isHot = temperature > 50
    println(isHot) // Imprime si la temperatura es alta (true o false)

    print("\n")
    val temperature2 = 10
    val message = "La temperatura del agua es ${ if (temperature2 > 50) "demasiado caliente" else "OK" }."
    println(message) // Imprime un mensaje sobre la temperatura del agua

    // Llamado a funciones
    print("\n")
    feedTheFish()

    print("\n")
    swim()   // Usa la velocidad por defecto
    swim("lento")   // Argumento posicional
    swim(speed="como una tortuga")   // Parámetro nombrado

    // Impresión con filtro
    print("\n")
    println(decorations.filter { it[0] == 'p' }) // Imprime los elementos que empiezan con 'p'
    print("\n")
    println("ansioso: $eager") // Imprime la lista ansiosa
    print("\n")
    println("filtrado: $filtered") // Imprime la lista filtrada
    print("\n")
    println("nueva lista: $newList") // Imprime la nueva lista creada a partir de la lista filtrada
    print("\n")
    println("perezoso: $lazyMap") // Imprime la secuencia perezosa
    println("-----")
    println("primero: ${lazyMap.first()}") // Imprime el primer elemento de la secuencia perezosa
    println("-----")
    println("todo: ${lazyMap.toList()}") // Imprime todos los elementos de la secuencia perezosa como lista
    print("\n")
    println("-----")
    println("filtrado: ${lazyMap2.toList()}") // Imprime los elementos filtrados de la secuencia perezosa
    // Lambdas
    print("\n")
    println(waterFilter(dirtyLevel)) // Imprime el resultado del filtro de agua
    print("\n")
    println(updateDirty(30, waterFilter)) // Imprime el resultado de actualizar el nivel de suciedad
    print("\n")
    println(updateDirty(15, ::increaseDirty)) // Imprime el resultado de incrementar el nivel de suciedad
}

// Funciones

fun randomDay() : String {
    val week = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    return week[Random().nextInt(week.size)] // Devuelve un día aleatorio de la semana
}

fun fishFood(day: String) : String {
    return when (day) {
        "Lunes" -> "hojuelas"
        "Miércoles" -> "gusanos rojos"
        "Jueves" -> "gránulos"
        "Viernes" -> "mosquitos"
        "Domingo" -> "plancton"
        else -> "nada"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Hoy es $day y los peces comen $food") // Imprime el día y la comida de los peces
    println("Cambiar agua: ${shouldChangeWater(day)}") // Imprime si se debe cambiar el agua
}

fun swim(speed: String = "rápido") {
    println("nadando $speed") // Imprime la velocidad de nado
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

// Funciones compactas

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Domingo"

// Filtros

val decorations = listOf("roca", "pagoda", "planta de plástico", "caimán", "maceta")
// ansioso, crea una nueva lista
val eager = decorations.filter { it[0] == 'p' }
// perezoso, esperará hasta que se le pida evaluar
val filtered = decorations.asSequence().filter { it[0] == 'p' }
// fuerza la evaluación de la lista perezosa
val newList = filtered.toList()

val lazyMap = decorations.asSequence().map {
    println("acceso: $it")
    it
}

val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
    println("acceso: $it")
    it
}

// Lambdas

var dirtyLevel = 20
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

// Función de orden superior

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1
