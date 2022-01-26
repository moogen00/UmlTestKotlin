package com.example.design.strategypattern

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("조용")
    }

}