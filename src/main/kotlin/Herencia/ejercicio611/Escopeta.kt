package Herencia.ejercicio611

class Escopeta(
    var recortada : Boolean,
    var aumentoRecortada : Double,
    cargada : Boolean,
    potencia : Double
):ArmaFuego(cargada, potencia) {
    override fun atacar(potencia: Double) {
        super.atacar(potencia)
    }
}