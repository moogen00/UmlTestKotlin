package com.example.design.strategypattern

class MiniDuckSimulator {
    fun test() {
        val mallard : Duck = MallardDuck()
        mallard.performQuack()
        mallard.performFly()

        mallard.setFlyBehavior(FlyNoWay())
        mallard.performFly()
    }
}