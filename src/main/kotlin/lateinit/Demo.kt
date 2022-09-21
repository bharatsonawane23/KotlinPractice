package lateinit

fun main() {
    val demo = Demo()
    println(demo.getNameWithoutException())
    println(demo.getName())
    demo.setName("Test")
    println(demo.getName())
}

class Demo {
    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name

    fun getNameWithoutException() = if (::name.isInitialized) name else "Not Initialized"
}

