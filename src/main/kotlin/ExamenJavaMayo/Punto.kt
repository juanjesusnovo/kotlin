package ExamenJavaMayo

open class Punto(
    var x : Int,
    var y: Int
) : Grafico {
    init {
        require(x <= Grafico.maxx && y <= Grafico.maxy)
        {"El punto sale de pantalla"}
    }
    override fun mover(x1: Int, y1: Int): Boolean {
        if (x + x1 <= Grafico.maxx && y + y1 <= Grafico.maxy){
            x += x1
            y += y1
            return true
        }
        return false
    }

    override fun dibujar() {
        println(Punto(x,y))
    }

    override fun toString(): String {
        return "Punto(x=$x, y=$y)"
    }


}