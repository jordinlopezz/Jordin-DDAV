@file:Suppress("unused", "SpellCheckingInspection", "UnusedReceiverParameter")

// CONSTANTES

// Declaración de una constante global `ROCKS` con el valor 3.
const val ROCKS = 3

// Función que devuelve un valor constante.
fun complexFunctionCall(): Int {
    return 42
}

// Asignación de un valor a una variable `value1` llamando a la función `complexFunctionCall`.
val value1 = complexFunctionCall() // OK, porque `value1` es una variable que puede ser asignada en tiempo de ejecución.

// Nota: No se puede usar `const` en `CONSTANT1` porque `const` requiere una expresión constante en tiempo de compilación.
// const val CONSTANT1 = complexFunctionCall() // NOT OK

// Declaración de un objeto `Constants` con una constante dentro de él.
object Constants {
    const val CONSTANT2 = "object constant"
}

// Uso de una constante de un objeto para asignar a otra constante global `foo`.
const val foo = Constants.CONSTANT2

// Declaración de una clase `MyClass` con un objeto `companion` que contiene una constante.
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

fun main() {
    // Imprimir constantes y valores calculados
    println("")

    // Imprime el valor de la constante `ROCKS`.
    println("ROCKS: $ROCKS")                       // Outputs: ROCKS: 3

    // Imprime el valor de la variable `value1` que fue calculada llamando a `complexFunctionCall()`.
    println("Value1: $value1")                     // Outputs: Value1: 42

    // Imprime el valor de la constante `CONSTANT2` dentro del objeto `Constants`.
    println("Constants.CONSTANT2: ${Constants.CONSTANT2}") // Outputs: Constants.CONSTANT2: object constant

    // Imprime el valor de la constante global `foo` que fue asignada usando `Constants.CONSTANT2`.
    println("Foo: $foo")                           // Outputs: Foo: object constant

    // Imprime el valor de la constante `CONSTANT3` dentro del objeto `companion` de `MyClass`.
    println("MyClass.CONSTANT3: ${MyClass.CONSTANT3}")     // Outputs: MyClass.CONSTANT3: constant in companion
}
