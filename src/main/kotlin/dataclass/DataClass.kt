package dataclass

fun main() {
    val normalClass = NormalClass("Bharat")
    val normalClass2 = NormalClass("Bharat")
    println(normalClass)
    println(normalClass2)
    println(normalClass == normalClass2)

    val dataClass = DataClass("Bharat", 28)
    val dataClass1 = DataClass("Bharat", 28)
    println(dataClass)
    println(dataClass1)
    println(dataClass == dataClass1)
    val copyDataClass = dataClass.copy(age = 29)
    println(copyDataClass)
}

class NormalClass(var name: String)

data class DataClass(var name: String, var age: Int)