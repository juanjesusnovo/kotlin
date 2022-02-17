package ExamenJavaMayo

open class Punto(
    var x : Int,
    var y: Int
) : Grafico {
    override fun mover(x: Int, y: Int): Boolean {
        if (x <= 800 || y <= 600){
            return true
        }
        return false
    }

    override fun dibujar() {
        println(Punto(x,y))
    }
}