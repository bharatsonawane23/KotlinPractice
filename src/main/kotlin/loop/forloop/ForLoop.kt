fun main() {

    val nameList: List<String> = listOf("Bharat", "Sonawane")
    for (name in nameList) {
        println(name)
    }
    for (number in 0..10) {
        println(number)
    }
    for (number in 0..10 step 5) {
        println(number)
    }
    for (index in nameList.indices) {
        println(nameList[index])
    }
    for ((index, name) in nameList.withIndex()) {
        print(index)
        println(name)
    }
}