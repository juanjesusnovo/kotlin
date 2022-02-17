package ExamenJavaMayo

abstract class GraficoCompuesto (
    var graficos : ArrayList<Grafico>
        ): Grafico{
    override fun mover(x: Int, y: Int): Boolean {
        if(x <= 800 || y <= 600){
            return true
        }
        return false
    }

    override fun dibujar() {
        println("Grafico Compuesto: ")
        for (grafico in graficos){
            println(grafico)
        }
    }
}