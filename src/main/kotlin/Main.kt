fun main(args: Array<String>) {
    /*Циклы:*/

/*1. Вывести в консоль таблицу умножения на 4*/

    val num_1 = 4
    for (i in 1..10) {
        val product = num_1 * i
        println("$num_1 * $i = $product")
    }

/*2. Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х*/

    var num_2 = readLine()!!.toInt()
    for (i in 0..num_2) {
        if (i % 2 == 0) {
            println(i)
        }
    }

/*3. Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
            индексом х!!!*/

    var a_1 = 0
    var a_2 = 1
    var a_4 = readLine()!!.toInt()
    print("$a_1 $a_2 ")
    for (i in 3..a_4) {
        val a_3 = a_1 + a_2
        print("$a_3 ")
        a_1=a_2
        a_2=a_3
    }

/*4. Пользователь вводит число. Выводим в консоль факториал этого числа*/

    var num_3 = readLine()!!.toInt()
    var factorial : Long = 1
    for (i in 2..num_3) {
        factorial *= i
        println("Factorial of $num_3 = $factorial")
    }

/*5. Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
            один символ)*/

    val cat = readLine()!!.toString()
    for(char in cat.toCharArray()){
        println(char)
    }

}