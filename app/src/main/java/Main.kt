class MyClass {
    companion object {
        fun sayHello() {
            println("Hello")
        }
    }
}

object AppConfig {
    const val API_URL = "https://api.example.com"
    const val TIMEOUT = 5000
}

fun Int.square(): Int {
    return this * this
}

fun String?.isNullOrBlank(): Boolean {
    return this == null || this.isBlank()
}

fun main() {
    MyClass.sayHello()

    val pair = Pair("Alice", 25)
    println("Name: ${pair.first}, Age: ${pair.second}")

    val triple = Triple("Alice", 25, "Engineer")
    println("Name: ${triple.first}, Age: ${triple.second}, Job: ${triple.third}")

    val numbers = listOf(1, 2, 3, 4, 5)

    println(numbers.first())
    println(numbers.last())
    println(numbers[2])
    println(numbers.contains(3))
    println(numbers.filter { it % 2 == 0 })

    val fruits = mutableListOf("Apple", "Banana", "Cherry")
    fruits.add("Date")
    println(fruits)

    println(AppConfig.API_URL)
    println(AppConfig.TIMEOUT)

    val number = 5
    println(number.square())

    val nullString: String? = null
    println(nullString.isNullOrBlank())

    val blankString: String? = "  "
    println(blankString.isNullOrBlank())
}

