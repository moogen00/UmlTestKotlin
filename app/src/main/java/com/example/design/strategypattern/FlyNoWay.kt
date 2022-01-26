package com.example.design.strategypattern

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("날지못해요.")
    }
}