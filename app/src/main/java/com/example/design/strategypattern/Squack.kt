package com.example.design.strategypattern

class Squack : QuackBehavior {
    override fun quack() {
        println("삑삑")
    }
}