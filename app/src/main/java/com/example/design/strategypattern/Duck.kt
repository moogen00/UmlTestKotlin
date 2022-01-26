package com.example.design.strategypattern

//interface FlyBehavior {
//    fun fly() : Unit
//}
//
//interface QuackBehavior {
//    fun quack() : Unit
//}

abstract class Duck(private var flyBehavior: FlyBehavior,
                    private var quackBehavior: QuackBehavior) {
//    lateinit private var flyBehavior: FlyBehavior
//    lateinit private var quackBehavior: QuackBehavior
    //lateinit var flyBehavior: FlyBehavior
    //lateinit var quackBehavior: QuackBehavior
//    lateinit private var flyBehavior: FlyBehavior
//    lateinit private var quackBehavior: QuackBehavior

    fun swim () {
        println("물에 떠있습니다.")
    }

    abstract fun display()

    open fun performQuack() {
        quackBehavior.quack()
    }

    open fun performFly() {
        flyBehavior.fly()
    }
//
    open fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }
//
    open fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }
}