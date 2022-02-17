package Herencia.ejercicio611

open class ArmaBlanca(
    var afilada : Boolean,
    var reduccSinAfilar : Double,
    potencia : Double
):Arma(potencia) {
    fun afilar(){
        afilada = true
    }
    override fun atacar(potencia: Double) {
        super.atacar(potencia)
    }
}