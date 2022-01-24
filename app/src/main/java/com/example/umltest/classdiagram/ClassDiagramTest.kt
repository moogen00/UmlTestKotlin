package com.example.umltest.classdiagram

class ClassDiagramTest {
    private var age: Int = 0
    private var name: String = ""

    init {
        println("------------------------------")
        println("기본 생성자호출 init ")
    }

    constructor() {
        println("주생성자 호출")
    }

    constructor(age: Int, name: String) : this() {
        this.age = age
        this.name = name
        println("보조생성자 호출")
    }


    fun getSchedule() : Unit {
        println("getSchedule() ============= ${age} ** ${name}")
    }

    fun introduce(introduce : String) {
        println("introduce() ============= ${introduce} ${age} ** ${name} ")
    }
}