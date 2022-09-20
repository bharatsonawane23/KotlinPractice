fun main() {
    val nameList: List<String> = listOf("Bharat", "Sonawane")
    nameList.forEach { name ->
        println(name)
    }
    nameList.forEachIndexed { index, name ->
        print(index)
        println(name)
    }
}