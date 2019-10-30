fun main(args: Array<String>) {
    println("Introduzca num1")
    val num1= readLine()!!.toInt()
    println("Introduzca num2")
    val num2= readLine()!!.toInt()
    println("Introduzca num3")
    val num3= readLine()!!.toInt()
    if (num1>num2)
        if(num1>num3) println("num1 es mayor que los otros") else println("num3 es mayor")
    else if (num2>num3) println("num2 es mayor") else println("num3 es mayor")


    println("Introduzca num")
    val num= readLine()!!.toInt()
    if (num>0) println("El numero es positivo")
    else  if (num<0) println("El numero es negativo")
    else println("es nulo")

    println("introduzca un numero positivo y con de 1 a 3 cifras")
    var number= readLine()!!.toInt()
    if (number<0 || number>999) println("Introduzca un numero entre 1 y 999")
    else if(number<10) println("numero con un digeto") else if(number<100) println("numero con dos digitos") else println("numero con tres digitos")


}