fun main(){
    println("Puntuación Calificación\n" +
            ">= 0.9 Sobresaliente\n" +
            ">= 0.8 Notable\n" +
            ">= 0.7 Bien\n" +
            ">= 0.6 Suficiente\n" +
            "< 0.6 Insuficiente")
    println("Introduce la nota (entre 0 y 1.0)")
    var nota = readLine()!!.toDouble()
    if (nota < 0.6)
        println("Insuficiente")
    if (nota >= 0.9)
        println("Sobresaliente")
    if (nota >= 0.8)
        println("Notable")
    if (nota >= 0.7)
        println("Bien")
    if (nota >= 0.6)
        println("Suficiente")
    else
        println("Las formao brother")
}