fun factorial(number: Int): Int {
    if (number <= 1) {
        return 1
    }

    return number * factorial(number - 1)
}

fun prime(number: Int): Boolean {
    if (number <= 1) {
        return false
    } else if (number % 2 == 0) {
        return false
    } else {
        return true
    }
}

fun reverseString(text: String): String {
    var reversed = ""
    var index = text.length - 1

    while (index >= 0) {
        reversed += text[index]
        index--
    }

    return reversed
}

fun maxElement(list: Array<Int>): Int {
    var max = list[0]
    for (number in list) {
        if (number > max) {
            max = number
        }
    }

    return max
}

fun fibonacci(term: Int): Int {
    var prevTerm = 0
    var currentTerm = 1

    for (i in 2 .. term) {
        val next = prevTerm + currentTerm
        prevTerm = currentTerm
        currentTerm = next
    }

    return currentTerm
}


fun palindrome(text: String): Boolean {
    if (text == reverseString(text)) {
        return true
    }

    return false
}

fun sumOfDigits(number: Int): Int {
    var num = number
    var sum = 0

    while (num > 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}

fun GCD(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }

    return num1
}

fun vowelCount(text: String): Int {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0

    for (letter in text) {
        if (letter in vowels) {
            count++
        }
    }

    return count
}

fun tempConverter(temp: Double): Double {
    val farenheit = ((temp * 9 / 5) + 32)
    return farenheit
}

fun main() {
    println(factorial(7))
    println(prime(10))
    println(reverseString("Hello"))
    println(maxElement(arrayOf(2, 3, 1, 5, 4)))
    println(fibonacci(7))
    println(palindrome("kayak"))
    println(sumOfDigits(12))
    println(GCD(8, 10))
    println(vowelCount("Hello World Hello World"))
    println(tempConverter((32.32)))
}