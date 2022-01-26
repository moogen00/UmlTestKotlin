package com.example.umltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.design.strategypattern.MiniDuckSimulator
import com.example.umltest.classdiagram.ClassDiagramTest
import com.example.umltest.stereotype.MathUtility

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var c = ClassDiagramTest()
        c.getSchedule()
        c.introduce("aaaaaaaaaaaaa")


        var d = ClassDiagramTest(123, "bbbbbbbbbbb")
        d.getSchedule()
        d.introduce("aaaaaaaaaaaaa")

        println("class Stereo Type Test ---------------------------------------------------")
        println("MathUtility.PI = ${MathUtility.PI}")
        println("MathUtility.sin = ${MathUtility.sin(0.3)}")
        println("MathUtility.cos = ${MathUtility.cos(0.6)}")

        println("strategy pattern MiniDuckSimulator ------------------------------------")
        val mini = MiniDuckSimulator()
        mini.test()
    }
}