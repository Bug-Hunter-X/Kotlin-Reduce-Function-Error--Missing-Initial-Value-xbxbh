fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    // Incorrect way to find the sum using reduce 
    val sum = list.reduce{ sum, element -> sum + element }
    println(sum)

    val sum2 = list.reduce { a,b -> a+b}
    println(sum2)
}