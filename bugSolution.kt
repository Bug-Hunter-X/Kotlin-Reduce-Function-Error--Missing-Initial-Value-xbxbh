fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    // Correct way to find the sum using reduce with an initial value
    val sum = list.reduce { sum, element -> sum + element }
    println(sum)

    //Alternative approach using fold with an initial value of 0 which handles empty list case
    val sum2 = list.fold(0) { a, b -> a + b }
    println(sum2)
    val emptyList = emptyList<Int>()
    val sum3 = emptyList.fold(0){a,b -> a+b}
    println(sum3)
}