package Rel5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio51KtTest {

    @Test
    fun quitarVocales() {
        assert(Rel5.quitarVocales("Programacion")=="Prgrmcn")
    }

    @Test
    fun quitarConsonantes() {
        assert(Rel5.quitarConsonantes("Programacion")=="oaaio")
    }

    @Test
    fun ponerMayusculas() {
        assert(Rel5.ponerMayusculas("Programacion")=="PrOgrAmAcIOn")
    }
}