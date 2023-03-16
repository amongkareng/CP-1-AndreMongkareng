package com.dree13.kotlin.`cp-2`

fun main(){
    val nilaiA = intArrayOf(112233,30800,2937,323455693,5038297,112234)

    for (a in nilaiA){
        if (a % 11 != 0){
            println("$a is not a multiple of 11.")
        } else{
            println("$a is a multiple of 11")
        }
    }

    }
