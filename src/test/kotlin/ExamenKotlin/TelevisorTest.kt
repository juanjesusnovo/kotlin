package ExamenKotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TelevisorTest {

    @Test
    fun precioFinal() {
        var televisor = Televisor()
        var televisor1 = Televisor(precioBase = 200.0, peso = 25.0)
        var televisor2 = Televisor(40.0, arrayListOf(1920, 1080), 250.0, 20.0, "negro", 'A')
        var televisor3 = Televisor(40.0)
        assert(televisor.precioFinal()==210.0)
        assert(televisor1.precioFinal()==350.0)
        assert(televisor2.precioFinal()==403.0)
        assert(televisor3.precioFinal()==273.0)
    }

    @Test
    fun getDensidad() {
        var televisor = Televisor()
        var televisor1 = Televisor(40.0, arrayListOf(1920,1080))
        assert(televisor.getDensidad()==42.649248145154196)
        assert(televisor1.getDensidad()==55.072679252057455)
    }
}