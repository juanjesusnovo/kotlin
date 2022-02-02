package Rel5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio55KtTest {

    @Test
    fun ahorcado() {
        assert(Rel5.ahorcado("buenas","a")== listOf(4,"____a_"))
        assert(Rel5.ahorcado("buenas","x")== listOf(4,"______"))
        assert(Rel5.ahorcado("buenas","u")== listOf(4,"_u____"))
    }
}