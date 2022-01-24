package com.example.umltest.stereotype

class MathUtility {
    companion object {
        val PI: Double = 3.14159
        fun sin(theta : Double) : Double {
            println("sin = ${theta}")
            return 0.0
        }

        fun cos(theta : Double) : Double {
            println("cos = ${theta}")
            return 0.0
        }
    }
}