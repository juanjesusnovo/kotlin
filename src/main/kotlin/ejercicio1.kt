fun main() {
    println("Introduce las horas:")
    var horas = readLine()!!.toInt()
    var coste = 10
    var importe = horas * coste
    println("Importe total: ${importe}")
}
