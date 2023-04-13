package com.dree13.kotlin.`cp-4`

fun main(args: Array<String>) {
    val input = arrayOf(265, 111, 1234)

    for (num in input) {
        val binaryCount = Integer.bitCount(num)
        val hexCount = Integer.bitCount(Integer.parseInt(num.toString(), 16))

        println("$binaryCount $hexCount")
    }
}
