package companionobject

fun main() {
    val sum = CompanionObject.add(4, 5)
    print("Sum = $sum")
}

class CompanionObject {

    companion object {
        fun add(num1: Int, num2: Int) = num1.plus(num2)
    }
}