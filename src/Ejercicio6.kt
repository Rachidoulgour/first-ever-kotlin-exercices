fun main(args: Array<String>) {
    println("Introduzca el numero de empleados")
    var n = readLine()!!.toInt()
    var x = 1;
    var numSalario1 = 0
    var numSalario2=0
    var gastos1 =0
    var gastos2=0
    while (x<=n){
        println("Introduce el salario entre 100 y 500")
        var salario = readLine()!!.toInt()
        if (salario<=300) {
            numSalario1 = numSalario1 + 1;
            gastos1 = salario +gastos1
            x = x + 1;
        }
        else numSalario2= numSalario2+1
        gastos2= salario+gastos2
        x=x+1
    }

    println("numero de salarios menor o igual a 300 es $numSalario1")
    println("numero de salarios mayor a 300 es $numSalario2")
    var gastos = gastos1+gastos2
    println("gastos de la empresa es $gastos")
}