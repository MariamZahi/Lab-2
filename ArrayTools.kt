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


    //Reversed Array
    fun reverseArray() {
        val array: IntArray = intArrayOf(1, 2, 3, 4, 5)
     
        for (i in array.reversed()) {
            println(i)
        }
    }
   
    //CaeserCypher
    fun encryptStrings(vararg strings: String): List<String> {
        val encryptedStrings = mutableListOf<String>()
        
        for (string in strings) {
            val encryptedText = StringBuilder()
            
            for (char in string) {
                val encryptedChar = (char.code + 1).toChar()
                encryptedText.append(encryptedChar)
            }
            
            encryptedStrings.add(encryptedText.toString())
        }
        
        return encryptedStrings
    }