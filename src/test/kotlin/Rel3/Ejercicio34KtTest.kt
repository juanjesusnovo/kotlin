package Rel3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio34KtTest {

    @Test
    fun esBisiesto() {
        assert(Rel3.esBisiesto(2000)==true)
        assert(Rel3.esBisiesto(0)==true)
        assert(Rel3.esBisiesto(1562)==false)
    }
}