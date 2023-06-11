//Test the method
fun main(){
    print(averageArray(arrayOf(1,2,3,4)))
}

//Averaging the integer Array
//Double gives output as decimals 

fun averageArray(inputArray: Array<Int>):Double {
     var sum = 0.0
    for (number in inputArray){
        sum += number
    }
    return sum/inputArray.size
}