package ExamenKotlin

class Televisor(
    var diagonal : Double = 35.0,
    var resolucion : ArrayList<Int> = arrayListOf(1280,768),
    precioBase : Double = 100.0,
    peso : Double = 5.0,
    color : String = "blanco",
    consumoEnergetico : Char = 'F'
): Electrodomestico(precioBase, peso, color, consumoEnergetico)
{
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
        if (diagonal >= 40 ){
            precioFinal += precioFinal * 0.3
        }
        return precioFinal
    }
    fun getDensidad(): Double{
        var densidad = 0.0
        densidad = Math.sqrt(Math.pow(this.resolucion[0].toDouble(),2.0)+Math.pow(this.resolucion[1].toDouble(),2.0))/this.diagonal
        return densidad
    }
    override fun toString(): String {
        return "Televisor: diagonal: $diagonal, " +
                "resolucion, $resolucion" +
                "precio base: $precioBase, "+
                "peso: $peso, " +
                "color: $color, " +
                "consumo: $consumoEnergetico"
    }

}