/*
1. Crear una clase Rectángulo, con atributos base y altura.
 La clase debe disponer del constructor y los métodos para calcular el area y el perimetro.
 Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.
 */

/*
2. Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo:
 override fun toString() = "". (Pulsa Ctrl+o)
 */

/*
3. En el programa principal, crear varios rectángulos.
 Mostarlos y mostrar por pantalla sus áreas y perímetros.
 */

package org.example

fun main() {
    val rectangle1 = Rectangle(3.5, 8.0)
    println("Rectangulo 1:")
    println(rectangle1.toString())
    rectangle1.showInfo()
    println()

    val rectangle2 = Rectangle(-5.3, 2.91)
    println("Rectangulo 2:")
    println(rectangle2.toString())
    rectangle2.showInfo()
    println()

    val rectangle3 = Rectangle(4.12, 2.4)
    println("Rectangulo 3:")
    println(rectangle3.toString())
    rectangle3.showInfo()
    println()

}