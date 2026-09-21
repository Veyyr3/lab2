fun main() {
    // вызываю задания как функции
    task1()
}

// 1 задание
fun task1() {
    // 1 Создать массив из 5 целых чисел и вывести все элементы.
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number) // вывод 1, 2, 3, 4, 5
    }

    // 2 Найти сумму элементов массива.
    val summ = intArrayOf(5, 10, 15, 20)
    println(summ.sum()) // вывод 50

    // 3 Найти максимальный элемент массива.
    val maxnum = intArrayOf(5, 10, 15, 20)
    println(maxnum.maxOrNull()) // вывод 20

    // 4 Посчитать количество чётных чисел в массиве.
    val evennum = intArrayOf(1, 3, 5, 2, 4, 6)
    val evencount = evennum.count { it % 2 == 0 }
    println("четных элементов: $evencount") // вывод 3

    // 5 Развернуть массив (вывести в обратном порядке).
    val notreversed = intArrayOf(1, 2, 3, 4, 5)
    println(notreversed.reversed()) // вывод [5, 4, 3, 2, 1]

    // 6 Проверить, содержит ли массив заданное число.
    val findnumber = arrayOf(1, 2, 6, 10)
    val find = 6 // число, которое надо найти
    if (find in findnumber) {
        println("число есть") // вывод "число есть"
    } else {
        println("числа нет")
    }

    // 7 Отсортировать массив по возрастанию.
    val arr = intArrayOf(70, 10, 20, 30, 40)
    arr.sort() // сортировка
    // метод joinToString(), чтобы вывести массив а не что-то странное 
    println(arr.joinToString()) // вывод 10, 20, 30, 40, 70

    // 8 Создать массив строк и найти самую длинную строку.
    val words = arrayOf("Я", "Люблю", "Котлин", "И", "Папу")
    val longest = words.maxByOrNull { it.length }
    println(longest) // вывод: Котлин

    // 9 Найти индекс минимального элемента массива.
    val numbers2 = intArrayOf(22, 43, 543, 1, 2, 5)
    // ищем индекс минимального числа. toTypedArray() для того, чтобы перевести тип Int? у numbers2 в тип Int
    val min = numbers2.toTypedArray().indexOf(numbers2.minOrNull()) 
    println(min) // вывод 3

    // 10 Умножить каждый элемент массива на 2.
    val numbers3 = intArrayOf(1, 2, 3, 4, 5)
    for (i in numbers3.indices) {
        numbers3[i] *= 2 
    }
    println(numbers3.joinToString()) // вывод: 2, 4, 6, 8, 10
}
