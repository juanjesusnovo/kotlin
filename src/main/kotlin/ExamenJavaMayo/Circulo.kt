package ExamenJavaMayo

class Circulo(
    var radio : Int,
    x : Int,
    y : Int
) : Punto(x, y){
    fun circulo(x : Int, y: Int, radio: Int){

    }
    override fun mover(x: Int,y: Int):Boolean{
        return super Punto.mover(x,y)
    }
}