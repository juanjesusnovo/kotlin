package Rel5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio511KtTest {

    @Test
    fun contarLetras() {
        assert(Rel5.contarLetras("hola")==(mapOf('h' to 1, 'o' to 2, 'l' to 3, 'a' to 4)))
    }
}