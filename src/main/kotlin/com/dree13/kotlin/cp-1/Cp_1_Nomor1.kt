package com.dree13.kotlin.`cp-1`/*
* nomor 1 tentang fungsi rekursif untuk menentukan apakah itu bilangan prima atau bukan
* // bilangan prima merupakan bilangan yang hanya bisa dibagi 1 dan nilai itu sendiri
* */

fun isPrime(x : Int, divisor: Int = 2) : Boolean {
    if (x <= 2) return x == 2
    if (x / divisor == 0) return false
    if (divisor * divisor > x) return false
    return isPrime(x, divisor + 1)
//    if (x / x == 1 && x / 1 == x) {
//        return true
//    } else{
//        return false
//    }

}

fun main(){
    // untuk fungsi rekursif mencari nilai bilangan prima
    val x = 16
    var case = 0
    if (isPrime(x)){
        ++case
        println("case #$case : $x is a prime number")
    }else{
        ++case
        println("case #$case : $x is not a prime number")
    }

}