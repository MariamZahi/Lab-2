// Omitting fun main gives main.jar error
fun main() {
    averageArrayTester()
    print(arrayContains(arrayOf(1, 2, 3), 2)) // Boolean TEST
}
// Averaging the integer Array
// Double gives output in decimals

fun averageArray(inputArray: Array<Int>): Double {
    // To not divide by 0 for output
    if (inputArray.isEmpty()) {
        return 0.0
    }

    var sum = 0.0
    for (number in inputArray) {
        sum += number
    }
    return sum / inputArray.size
}
// Testing the method
fun averageArrayTester() {
    println(averageArray(arrayOf(1, 2, 3)))
    println(averageArray(arrayOf(-1, -2, -3)))
    println(averageArray(arrayOf(-1605)))
    println(averageArray(arrayOf(99, 10)))
    println(averageArray(arrayOf()))
}

// arrayContains for array and search value

fun arrayContains(inputArray: Array<Int>, target: Int): Boolean {

    for (number in inputArray) {
        if (number == target) {
            return true
        }
    }
    return false
}

// Reversed Array
// Usage of ArrayDeque needs OptIn (will get back to it later 11/06)
fun reverseArray() {
    val array: IntArray = intArrayOf(1, 2, 3, 4, 5)

    for (i in array.reversed()) {
        println(i)
    }
}
// Simplified because stack needs OptIn

// CaeserCypher
fun encryptStrings(vararg strings: String): List<String> {
    val encryptedStrings = mutableListOf<String>() // to hold string values

    for (string in strings) {
        val encryptedText = StringBuilder()

        for (char in string) {
            // encrypting the value by giving value next to original
            // Cannot use char.toInt as it was incompatible
            val encryptedChar = (char + 1).toChar()
            // use this stringbuilder append to join together strings and int
            encryptedText.append(encryptedChar as Any)
        }

        encryptedStrings.add(encryptedText.toString())
    }

    return encryptedStrings
}


