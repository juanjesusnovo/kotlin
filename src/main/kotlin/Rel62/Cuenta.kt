package Rel62

class Cuenta (
    var cliente: Cliente,
    var numero: Int,
    var saldo: Double
        ){
    fun ingresos(dinero : Double){
        saldo += dinero
    }

}