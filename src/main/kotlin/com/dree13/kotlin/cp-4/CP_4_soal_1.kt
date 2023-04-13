package com.dree13.kotlin.`cp-4`

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2..n/2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun isEmirp(n: Int): Boolean {
    if (!isPrime(n)) {
        return false
    }
    val reversed = n.toString().reversed().toInt()
    return reversed != n && isPrime(reversed)
}

fun main() {
    val numbers = arrayOf(17, 18, 19, 179, 199)
    for (n in numbers) {
        if (isPrime(n)) {
            if (isEmirp(n)) {
                println("$n is emirp.")
            } else {
                println("$n is prime.")
            }
        } else {
            println("$n is not prime.")
        }
    }
}
