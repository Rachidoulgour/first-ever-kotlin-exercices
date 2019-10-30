fun main(args: Array<String>) {
    println("Ingresa la nota1")
    val nota1= readLine()!!.toInt()
    println("Ingresa la nota2")
    val nota2= readLine()!!.toInt()
    println("Ingresa la nota3")
    val nota3= readLine()!!.toInt()
    var notaFinal= (nota1+nota2+nota3)/3
    if (notaFinal>7){
        println("Promocionado")
    }
    println("Ingresa un numero entre 1 y 99")
    var numero = readLine()!!.toInt()
    if (numero>=10){
        println("es numero con dos digitos")
    };if (numero<10){
        println("es numero con un digitos")
    }else{
        println("el numero no está comprendido entre 1 y 99")
    }
    
}