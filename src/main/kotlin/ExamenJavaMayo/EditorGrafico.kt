package ExamenJavaMayo

fun main(){
    var punto = Punto(2,9)
    var circulo = Circulo(6,500,300)
    var rectangulo = Rectangulo(20,10,400,100)
    punto.mover(10,15)
    punto.dibujar()
    circulo.dibujar()
    circulo.mover(900,500)
    rectangulo.mover(100,100)
    rectangulo.dibujar()
}