package ExamenKotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LavadoraTest {

    @Test
    fun precioFinal() {
        var lavadora = Lavadora()
        var lavadora1 = Lavadora(precioBase = 120.0, peso = 40.0)
        var lavadora2 = Lavadora(10.0, 125.0, 15.0, "rojo", 'E')
        var lavadora3 = Lavadora(30.0)
        assert(lavadora.precioFinal()==210.0)
        assert(lavadora1.precioFinal()==270.0)
        assert(lavadora2.precioFinal()==215.0)
        assert(lavadora3.precioFinal()==260.0)
    }
}