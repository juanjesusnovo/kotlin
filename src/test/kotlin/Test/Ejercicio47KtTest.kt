package Test

import Rel4.sumNumeros
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio47KtTest {

    @Test
    fun restasSucesivas() {
        assert(Rel4.restasSucesivas(10,2)== listOf(5,0))
        assert(Rel4.restasSucesivas(0,2)== listOf(0,0))
        assert(Rel4.restasSucesivas(-10,2)== listOf(0,0))
    }
}