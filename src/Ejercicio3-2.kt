fun main(args: Array<String>) {
    println("Iintroduzca numero1")
    val numero1= readLine()!!.toInt()
    println("Iintroduzca numero2")
    val numero2= readLine()!!.toInt()
    println("Iintroduzca numero3")
    val numero3= readLine()!!.toInt()
    println("Iintroduzca numero4")
    val numero4= readLine()!!.toInt()
    var suma= numero1+numero2+numero3+numero4
    println("La suma es $suma")
    var promedio = suma/4
    println("el promedio es $promedio")

}