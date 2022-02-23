package ExamenKotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CompraTest {

    @Test
    fun precioFinal() {
        var lavadora = Lavadora()
        var televisor = Televisor()
        var lavadora1 = Lavadora(precioBase = 120.0, peso = 40.0)
        var televisor1 = Televisor(precioBase = 200.0, peso = 25.0)
        var lavadora2 = Lavadora(10.0, 125.0, 15.0, "rojo", 'E')
        var televisor2 = Televisor(40.0, arrayListOf(1920, 1080), 250.0, 20.0, "negro", 'A')
        var lavadora3 = Lavadora(30.0)
        var televisor3 = Televisor(40.0)
        var lavadora4 = Lavadora(peso = 22.0)
        var televisor4 = Televisor(consumoEnergetico = 'D')
        var electrodomesticos = arrayListOf(lavadora, lavadora1, lavadora2, lavadora3, lavadora4, televisor, televisor1, televisor2, televisor3, televisor4)
        var electrodomesticos1 = arrayListOf(lavadora, lavadora1, lavadora4, televisor, televisor1, televisor2, televisor3, televisor4)
        var electrodomesticos2 = arrayListOf(lavadora, lavadora1, lavadora2, lavadora3, lavadora4, televisor, televisor1, televisor2, televisor3, televisor4,lavadora4, televisor, televisor1,)
        var electrodomesticos3 = arrayListOf(lavadora, lavadora1, lavadora2, lavadora3,  televisor2, televisor3, televisor4)
        var compra = Compra(electrodomesticos)
        var compra1 = Compra(electrodomesticos1)
        var compra2 = Compra(electrodomesticos2)
        var compra3 = Compra(electrodomesticos3)
        assert(compra.precioFinal()==2611.0)
        assert(compra1.precioFinal()==2136.0)
        assert(compra2.precioFinal()==3421.0)
        assert(compra3.precioFinal()==1801.0)
    }

    @Test
    fun precioDesglosado() {
        var lavadora = Lavadora()
        var televisor = Televisor()
        var lavadora1 = Lavadora(precioBase = 120.0, peso = 40.0)
        var televisor1 = Televisor(precioBase = 200.0, peso = 25.0)
        var lavadora2 = Lavadora(10.0, 125.0, 15.0, "rojo", 'E')
        var televisor2 = Televisor(40.0, arrayListOf(1920, 1080), 250.0, 20.0, "negro", 'A')
        var lavadora3 = Lavadora(30.0)
        var televisor3 = Televisor(40.0)
        var lavadora4 = Lavadora(peso = 22.0)
        var televisor4 = Televisor(consumoEnergetico = 'D')
        var electrodomesticos = arrayListOf(lavadora, lavadora1, lavadora2, lavadora3, lavadora4, televisor, televisor1, televisor2, televisor3, televisor4)
        var electrodomesticos1 = arrayListOf(lavadora, lavadora1, lavadora4, televisor, televisor1, televisor2, televisor3, televisor4)
        var electrodomesticos2 = arrayListOf(lavadora, lavadora1, lavadora2, lavadora3, lavadora4, televisor, televisor1, televisor2, televisor3, televisor4,lavadora4, televisor, televisor1,)
        var electrodomesticos3 = arrayListOf(lavadora, lavadora1, lavadora2, lavadora3,  televisor2, televisor3, televisor4)
        var compra = Compra(electrodomesticos)
        var compra1 = Compra(electrodomesticos1)
        var compra2 = Compra(electrodomesticos2)
        var compra3 = Compra(electrodomesticos3)
        assert(compra.precioDesglosado()=="Te has gastado 1205.0 en Lavadoras y 1406.0 en Televisores")
        assert(compra1.precioDesglosado()=="Te has gastado 730.0 en Lavadoras y 1406.0 en Televisores")
        assert(compra2.precioDesglosado()=="Te has gastado 1455.0 en Lavadoras y 1966.0 en Televisores")
        assert(compra3.precioDesglosado()=="Te has gastado 955.0 en Lavadoras y 846.0 en Televisores")

    }
}