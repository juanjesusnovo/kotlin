package ExamenJavaMayo

class Circulo(
    var radio : Int,
    x : Int,
    y : Int
) : Punto(x, y){
    override fun mover(x: Int, y: Int): Boolean {
        return super.mover(x, y)
    }

    override fun dibujar() {
        super.dibujar()
    }
}