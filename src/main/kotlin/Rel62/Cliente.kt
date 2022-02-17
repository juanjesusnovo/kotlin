package Rel62

class Cliente(
    var nombre : String,
    var dni : String,
    var cuentas : Array<Cuenta>
) {
    fun anadirCuenta(cuenta: Cuenta){
        cuentas += cuenta
    }
}