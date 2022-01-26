package com.example.design.strategypattern

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("난다!!")
    }
}