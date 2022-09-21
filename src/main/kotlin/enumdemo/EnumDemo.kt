package enumdemo

fun main() {
    val maleUser = User("Bharat", Gender.MALE)
    val femaleUSer = User("Bharat", Gender.FEMALE)

    println(maleUser)
    println(femaleUSer)
    for (gender in Gender.values()) {
        println(gender.name)
        println(gender.ordinal)
    }
}

class User(var name: String, var gender: Gender)

enum class Gender {
    MALE,
    FEMALE
}