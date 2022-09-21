package singleton

fun main() {
    println(Singleton.add(6,5))
    println(Singleton.add(3,6))
}

object Singleton {
    fun add(num1: Int, num2: Int) = num1.plus(num2)
}
