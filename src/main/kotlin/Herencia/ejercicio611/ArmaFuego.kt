package Herencia.ejercicio611

open class ArmaFuego(
    var cargada : Boolean =  false,
    potencia : Double
) : Arma (potencia) {
    override fun atacar(potencia: Double) {
        super.atacar(potencia)
    }
    fun cargar(){
        cargada = true
    }
    fun disparar(): Boolean{
        return cargada
    }
    fun atacar(){}
}