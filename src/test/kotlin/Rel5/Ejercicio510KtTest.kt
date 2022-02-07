package Rel5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio510KtTest {

    @Test
    fun palindromo() {
        assert(Rel5.palindromo("rallar")==true)
        assert(Rel5.palindromo("webo")==false)
    }
}