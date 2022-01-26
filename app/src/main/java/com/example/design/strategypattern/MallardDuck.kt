package com.example.design.strategypattern

class MallardDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) : Duck(flyBehavior, quackBehavior) {

    constructor() : this(FlyWithWings(), Quack())  {
        println("MallardDuck 보조생성자호출")
    }

    override fun display() {
        println("청둥오리 입니다.")
    }
}