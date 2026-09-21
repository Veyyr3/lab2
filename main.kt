fun main() {
    task1()
}

fun task1() {
    // Создать массив из 5 целых чисел и вывести все элементы.
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }

    // Найти сумму элементов массива.
    val summ = intArrayOf(5, 10, 15, 20)
    println(summ.sum())

    // Найти максимальный элемент массива.
    val maxnum = intArrayOf(5, 10, 15, 20)
    println(maxnum.maxOrNull())
}