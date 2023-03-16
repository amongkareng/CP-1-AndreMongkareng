package com.dree13.kotlin.`cp-1`

fun main(){
    val N = IntArray(100)
    val nomorSoal = listOf<Int>(1,2,1,3,4,6,2,3,5,5)
    val A = charArrayOf('A','A','C','B','D','E')
    for(i in nomorSoal.indices){
        N[i] = nomorSoal[i]
    }
    val sortedNomorSoal = nomorSoal.sorted().distinct()
    for (i in sortedNomorSoal.indices) {
        println("${sortedNomorSoal[i]} answers are ${A[i]}")
    }

}
