package extensionfunction

fun main() {
    val number = 10
    println("Count ${number.getLength()}")
    val number2 = 1321321561
    println("Count ${number2.getLength()}")
}

fun Int.getLength(): Int {
    return this.toString().filter { it.isDigit() }.count()
}