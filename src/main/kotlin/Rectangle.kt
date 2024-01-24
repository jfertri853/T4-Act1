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

    /** Calculates the Area of this Rectangle
     *
     * @return Area of this Rectangle
     */
    private fun calculateArea() = (this.base * this.height)

    /** Calculates the Perimeter of the Rectangle
     *
     * @return Perimeter of this Rectangle
     */
    private fun calculatePerimeter() = 2 * (base + height)

    /** Shows Area and Perimeter of this Rectangle
     */
    fun showInfo() {
        println("Area = ${calculateArea()}\nPerimeter = ${calculatePerimeter()}")
    }

}