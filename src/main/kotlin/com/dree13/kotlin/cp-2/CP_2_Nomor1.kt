package com.dree13.kotlin.`cp-2`

fun main(){
    val a = 2
    val b = 5
    var sum = 0
    var case = 0

    for (i in a .. b){
        if (i % 2 != 0){
            case++
            sum += i
        }
    }
    println("case $case: $sum")
}