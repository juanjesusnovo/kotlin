package ExamenKotlin

open abstract class Electrodomestico(
    var precioBase : Double,
    var peso : Double,
    var color : String,
    var consumoEnergetico : Char
) {
    open abstract fun precioFinal(): Double
}