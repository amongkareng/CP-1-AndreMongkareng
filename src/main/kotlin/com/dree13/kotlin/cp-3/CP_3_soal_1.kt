package com.dree13.kotlin.`cp-3`
import java.util.*
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
        val n = input.nextInt()
        val m = input.nextInt()

        if (n == 0 && m == 0) {
            break
        }

        val numbers = mutableListOf<Int>()

        for (i in 0 until n) {
            numbers.add(input.nextInt())
        }

        Collections.sort(numbers, Comparator<Int> { a, b ->
            when {
                a % m < b % m -> -1
                a % m > b % m -> 1
                a % 2 == 0 && b % 2 != 0 -> 1
                a % 2 != 0 && b % 2 == 0 -> -1
                a % 2 == 0 && b % 2 == 0 -> {
                    if (a < b) -1 else 1
                }
                else -> {
                    if (a < b) 1 else -1
                }
            }
        })

        println("$n $m")

        for (number in numbers) {
            println(number)
        }
    }
}
//[12, 6, 15, 9, 3, 10, 4, 13, 7, 1, 14, 8, 2, 11, 5]
//[12, 6, 15, 15, 9, 3, 10, 4, 13, 7, 1, 14, 8, 2, 11, 5]
//[6, 12, 3, 9, 15, 15, 4, 10, 1, 7, 13, 2, 8, 14, 5, 11]
//[6, 12, 3, 9, 15, 4, 10, 1, 7, 13, 2, 8, 14, 5, 11]