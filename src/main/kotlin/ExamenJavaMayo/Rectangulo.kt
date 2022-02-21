package ExamenJavaMayo

class Rectangulo(
    var ancho : Int,
    var alto : Int,
    x : Int,
    y : Int
) : Punto(x,y){
    init {
        require(x+ancho/2 <= Grafico.maxx && y+alto/2 <= Grafico.maxy)
        {"El rectángulo sale de pantalla"}
    }
    override fun mover(x: Int, y: Int): Boolean {
        return super.mover(x, y)
    }

    override fun dibujar() {
        println(Rectangulo(ancho,alto,x,y))
    }

    override fun toString(): String {
        return "Rectangulo($ancho, $alto, $x, $y)"
    }

}