package inheritance

fun main() {
    val baseClass: BaseClass = BaseClass();
    val childClass: ChildClass = ChildClass()
    val baseClass1: BaseClass = ChildClass()
//    var childClass1: ChildClass = BaseClass() // Compilation error

    println("Addition ${baseClass.add(2, 3)}")
    println("Addition ${childClass.add(2, 3)}")
    println("Addition ${baseClass1.add(2, 3)}")
}

open class BaseClass {
    open fun add(num1: Int, num2: Int) = num1.plus(num2)
}

class ChildClass : BaseClass() {

    override fun add(num1: Int, num2: Int): Int {
        return num1.plus(num2).plus(10)
    }

    fun test(): String {
        return "Hello"
    }
}