fun main(args: Array<String>) {
    println("Introduce el valor 1:")
    val valor1 = readLine()!!.toInt();
    println("introducir el valor 2:")
    val valor2 = readLine()!!.toInt();
    val suma = valor1 + valor2;
    println("La suma del valor 1 y el valor 2 es: $suma")
    val producto = valor1*valor2;
    println("el producto del valor 1 multiplicado por el valor 2 es: $producto")
    println("Introduzca el valor del lado del cuadro")
    val ladoCuadro= readLine()!!.toInt();
    val perimetro= ladoCuadro*4
    println("El perimetro del cuando con lado egual a $ladoCuadro es: $perimetro")
    println("Introduzca el precio")
    var precio: Float = readLine()!!.toFloat()
    println("Introduzca la cantidad")
    var cantidad = readLine()!!.toInt()
    var coste: Float = precio*cantidad;
    println("El total a pagar es $coste €")

}