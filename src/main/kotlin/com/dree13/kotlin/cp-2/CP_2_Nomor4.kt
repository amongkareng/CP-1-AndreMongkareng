package com.dree13.kotlin.`cp-2`

fun main(){
        val n = 81
        val m = 3
        var num = n
        var seq = mutableListOf<Int>()

        while (num > 1) {
            seq.add(num)
            if (num % m == 0) {
                num = num / m
            } else {
                println("boring!")
                break
            }
        }
        if (num == 1) {
            seq.add(num)
            println(seq.joinToString(", "))
        }
    }