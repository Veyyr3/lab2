fun main() {
    // вызываю задания как функции
    // task1()
    // task2()
    task3()
}

// 3 задание
fun task3() {
    // 1 Создать множество из чисел и вывести его.
    val numbers = setOf(1, 2, 3)
    println(numbers) // вывод: [1, 2, 3]

    // 2 Добавить в множество повторяющиеся элементы и проверить результат.
    val letters = mutableSetOf('a', 'b', 'c', 'c')
    println(letters) // вывод: [a, b, c]

    // 3 Найти пересечение двух множеств.
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(4, 5, 6, 7, 8)
    println(set1 intersect set2) // вывод: [4, 5]

    // 4 Найти объединение двух множеств.
    println(set1 union set2) // вывод: [1, 2, 3, 4, 5, 6, 7, 8]

    // 5 Найти разность двух множеств.
    println(set1 subtract set2) // вывод: [1, 2, 3]

    // 6 Проверить, содержится ли элемент в множестве.
    if ('a' in letters) {
        println(true) // вывод: true
    }

    // 7 Подсчитать количество уникальных символов в строке.
    val text = "hi, Kotlin!"
    // сначала во множество для уникальности, затем спросить его размер
    println(text.toSet().size) // вывод: 10

    // 8 Преобразовать список в множество для удаления дубликатов.
    val list = listOf("pain", "fear", "cry", "cry")
    println(list.toSet()) // вывод: [pain, fear, cry]

    // 9 Найти симметрическую разность двух множеств.
    println(
        (set1 - set2) + (set2 - set1) // вывод: [1, 2, 3, 6, 7, 8]
    )

    // 10 Создать множество строк и проверить, есть ли там слово "Kotlin".
    val languages = setOf("Python", "C++", "Rust")
    if ("Kotlin" in languages) {
        println("Котлин есть")
    } else {
        println("Котлина нет") // <- этот вывод
    }
}

// 2 задание
// fun task2() {
//     // 1 Создать список целых чисел и добавить в него 10 элементов.
//     var numbers = ArrayList<Int>()
//     for (i in 1..10) {
//         numbers.add(i)
//     }

//     // 2 Удалить элемент из списка по индексу.
//     numbers.removeAt(2) // удалит число 3
//     println(numbers) // ​вывод [1, 2, 4, 5, 6, 7, 8, 9, 10]

//     // 3 Найти среднее значение элементов списка.
//     println(numbers.average()) // вывод 5.7777...

//     // 4 Проверить, пустой ли список
//     if (numbers.isEmpty()) {
//         println("список пуст")
//     } else {
//         println("список не пуст") // <- этот вывод
//     }

//     // 5 Заменить элемент списка на другой.
//     val arr = mutableListOf("Lord", "Acorn", "Lorem") // mutableListOf для превращения в ArrayList
//     arr[0] = "Minor"
//     println(arr) // вывод [Minor, Acorn, Lorem]

//     // 6 Перевести список строк в верхний регистр.
//     for (i in arr.indices) {
//         arr[i] = arr[i].uppercase()
//     }
//     println(arr) // вывод [MINOR, ACORN, LOREM]

//     // 7 Создать список чисел и удалить все чётные.
//     val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//     val newNumbers = numbers2.filter { it % 2 != 0 }
//     println(newNumbers) // вывод [1, 3, 5, 7, 9]

//     // 8 Объединить два списка в один.
//     val list1 = listOf(1, 2)
//     val list2 = listOf(3, 4)
//     println(list1 + list2) // вывод [1, 2, 3, 4]

//     // 9 Найти второй по величине элемент списка.
//     val numbers3 = listOf(5, 10, 10, 2, 8, 1)
//     val secondMax = numbers3
//         .distinct() // убрать повторяющиеся
//         .sortedDescending() // сортировать по убыванию
//         .getOrNull(1) // взять элемент по 1 индексу
//     println(secondMax) // вывод: 8

//     // 10 Преобразовать список чисел в множество (Set).
//     val nmbrs = listOf(1, 2, 2, 3, 4, 4, 5)
//     val nmbrsSet = nmbrs.toSet()
// }

// 1 задание
// fun task1() {
//     // 1 Создать массив из 5 целых чисел и вывести все элементы.
//     val numbers = arrayOf(1, 2, 3, 4, 5)
//     for (number in numbers) {
//         println(number) // вывод 1, 2, 3, 4, 5
//     }

//     // 2 Найти сумму элементов массива.
//     val summ = intArrayOf(5, 10, 15, 20)
//     println(summ.sum()) // вывод 50

//     // 3 Найти максимальный элемент массива.
//     val maxnum = intArrayOf(5, 10, 15, 20)
//     println(maxnum.maxOrNull()) // вывод 20

//     // 4 Посчитать количество чётных чисел в массиве.
//     val evennum = intArrayOf(1, 3, 5, 2, 4, 6)
//     val evencount = evennum.count { it % 2 == 0 }
//     println("четных элементов: $evencount") // вывод 3

//     // 5 Развернуть массив (вывести в обратном порядке).
//     val notreversed = intArrayOf(1, 2, 3, 4, 5)
//     println(notreversed.reversed()) // вывод [5, 4, 3, 2, 1]

//     // 6 Проверить, содержит ли массив заданное число.
//     val findnumber = arrayOf(1, 2, 6, 10)
//     val find = 6 // число, которое надо найти
//     if (find in findnumber) {
//         println("число есть") // вывод "число есть"
//     } else {
//         println("числа нет")
//     }

//     // 7 Отсортировать массив по возрастанию.
//     val arr = intArrayOf(70, 10, 20, 30, 40)
//     arr.sort() // сортировка
//     // метод joinToString(), чтобы вывести массив а не что-то странное 
//     println(arr.joinToString()) // вывод 10, 20, 30, 40, 70

//     // 8 Создать массив строк и найти самую длинную строку.
//     val words = arrayOf("Я", "Люблю", "Котлин", "И", "Папу")
//     val longest = words.maxByOrNull { it.length }
//     println(longest) // вывод: Котлин

//     // 9 Найти индекс минимального элемента массива.
//     val numbers2 = intArrayOf(22, 43, 543, 1, 2, 5)
//     // ищем индекс минимального числа. toTypedArray() для того, чтобы перевести тип Int? у numbers2 в тип Int
//     val min = numbers2.toTypedArray().indexOf(numbers2.minOrNull()) 
//     println(min) // вывод 3

//     // 10Умножить каждый элемент массива на 2.
//     val numbers3 = intArrayOf(1, 2, 3, 4, 5)
//     for (i in numbers3.indices) {
//         numbers3[i] *= 2 
//     }
//     println(numbers3.joinToString()) // вывод: 2, 4, 6, 8, 10
// }
