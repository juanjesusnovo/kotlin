fun main(){
    println("Introduce dos numeros: ")
    var n1 = readLine()!!.toInt()
    var n2 = readLine()!!.toInt()
    while (true) {
        println("Que operación quieres hacer??[Sumar, Restar, Multiplicar, Dividir]")
        var op = readLine()
        if (op != null) {
            op.lowercase()
        }
        if (op == "sumar") {
            println("Solucion = ${n1 + n2}")
            break }
        else if (op == "restar") {
            println("Solucion = ${n1 - n2}")
            break }
        else if (op == "multiplicar") {
            println("Solucion = ${n1 * n2}")
            break }
        else if (op == "dividir") {
            if(n2 == 0)
                println("No se puede dividir por 0")
            else
                println("Solucion = ${n1 / n2}")
                break
        }
        else
            println("No es una operación válida")
    }
}