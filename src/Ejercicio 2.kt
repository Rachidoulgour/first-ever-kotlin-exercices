fun main(args: Array<String>) {
    val num1: Int= 10;
    val num2: Int= 5;
    var resultado: Int;
    resultado = num1+num2;
    println(resultado);
    resultado = num1*num2;
    println(resultado);

    val ladoCuadro= 50;
    val superficie= ladoCuadro*ladoCuadro
    println("La superfice del cuadro es $superficie")
    val perimetro= ladoCuadro*4
    println("EL PERIMETRO DEL CUADRO ES $perimetro kg")
    val peso1 = 75.5F;
    val peso2 = 82.4F
    val peso3 = 63.7F
    var pesoMedio= (peso1+peso2+peso3)/3
    println("El promedio del peso de las tres personas es $pesoMedio")
}

