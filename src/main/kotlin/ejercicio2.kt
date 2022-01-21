fun main(){
    val iva = 0.1
    println("Introduce el importe:")
    var importe = readLine()!!.toInt()
    println("Se ha pagado un 10% de iva")
    println("Precio sin IVA: ${importe/1.1}")
}