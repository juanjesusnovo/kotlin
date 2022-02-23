package ExamenKotlin

class Lavadora(
    var carga : Double = 5.0,
    precioBase : Double = 100.0,
    peso : Double = 5.0,
    color : String = "blanco",
    consumoEnergetico : Char = 'F'
): Electrodomestico(precioBase, peso, color, consumoEnergetico) {
    init {
        require(consumoEnergetico in arrayListOf('A','B','C','D','E','F'))
        require(color in arrayListOf("blanco", "negro", "rojo", "azul", "gris"))
        {"No se han insertado bien los datos"}
    }
    override fun precioFinal(): Double {
        var precioFinal = precioBase
        if (consumoEnergetico == 'A'){ precioFinal += 10.0}
        else if (consumoEnergetico == 'B'){ precioFinal += 30.0 }
        else if (consumoEnergetico == 'C'){ precioFinal += 50.0 }
        else if (consumoEnergetico == 'D'){ precioFinal += 60.0 }
        else if (consumoEnergetico == 'E'){ precioFinal += 80.0 }
        else { precioFinal += 100.0}
        if (peso <= 19.0){ precioFinal += 10.0 }
        else if (peso <= 49.0){ precioFinal += 50.0 }
        else if (peso <= 79.0){ precioFinal += 80.0 }
        else{ precioFinal += 100.0 }
        if ( carga >= 30.0 ){
            precioFinal += 50.0
        }
        return precioFinal
    }

    override fun toString(): String {
        return "Lavadora:" +
                "carga: $carga, " +
                "precio base: $precioBase, " +
                "peso: $peso, " +
                "color: $color, " +
                "consumo: $consumoEnergetico"
    }

}