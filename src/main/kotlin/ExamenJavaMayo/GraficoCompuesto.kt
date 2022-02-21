package ExamenJavaMayo

class GraficoCompuesto(
    var graficos : ArrayList<Grafico>
        ): Grafico{
    override fun mover(x: Int, y: Int): Boolean {
        var seMueve = true
        for (grafico in graficos){
            if (!grafico.mover(x,y)){seMueve = false}
        }
        return seMueve
    }

    override fun dibujar() {
        println("Grafico Compuesto: ")
        for (grafico in graficos){
            println(grafico)
        }
    }
}