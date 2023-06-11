//Omitting fun main gives main.jar error
fun main(){
    averageArrayTester()
    print(averageArray(arrayOf(1,2,3)))
}
// Averaging the integer Array
// Double gives output in decimals

fun averageArray(inputArray: Array<Int>): Double {
    // To not divide by 0 for output
    if (inputArray.isEmpty()){
        return 0.0
    }
    
       var sum = 0.0
    for (number in inputArray) {
        sum += number
    }
    return sum / inputArray.size
}
//Testing the method
fun averageArrayTester() {
    print(averageArray(arrayOf(1, 2, 3)))
    print(averageArray(arrayOf(-1, -2, -3)))
    print(averageArray(arrayOf(-1605)))
    print(averageArray(arrayOf(99, 10)))
    print(averageArray(arrayOf()))
}


