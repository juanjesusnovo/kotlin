package ExamenJavaMayo

class Circulo(
    var radio : Int,
    x : Int,
    y : Int
) : Punto(x, y){
    init {
        require(x+radio <= Grafico.maxx && y+radio <= Grafico.maxy)
        {"El círculo sale de pantalla"}
    }
    override fun mover(x: Int, y: Int): Boolean {
        return super.mover(x, y)
    }

    override fun dibujar() {
        println(Circulo(radio,x,y))
    }

    override fun toString(): String {
        return "Circulo(radio: $radio, x: $x, y: $y)"
    }

}