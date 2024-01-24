package org.example

class Rectangle(base: Double, height: Double) {

    private val base = if (base <= 0) {
        1.0
    } else {
        base
    }

    private val height  = if (height <= 0) {
        1.0
    } else {
        height
    }

    override fun toString(): String {
        return "Base = $base\nHeight = $height"
    }

    private fun calculateArea() = (this.base * this.height)

    private fun calculatePerimeter() = 2 * (base + height)

    fun showInfo() {
        println("Area = ${calculateArea()}\nPerimeter = ${calculatePerimeter()}")
    }

}