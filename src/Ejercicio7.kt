fun main(args: Array<String>) {
    val array=IntArray(10)
    for(i in array.indices){
        print("introduzca elemento: ")
        array[i]= readLine()!!.toInt();
        
    }
    println("the first index in array is ${array[0]}")
    println("the last index in aray is ${array[array.lastIndex]}")
}