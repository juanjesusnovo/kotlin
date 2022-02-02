package Test

import org.junit.jupiter.api.Test

internal class Ejercicio44KtTest {

    @Test
    fun sumNumeros() {
        assert(Rel4.sumNumeros(listOf(1, 2, 3, 4, 5, 6)) == arrayListOf(6,0,21))
        assert(Rel4.sumNumeros(listOf(-1, -2, -3, -4, -5, -6)) == arrayListOf(0,6,-21))
        assert(Rel4.sumNumeros(listOf(1, 2, -3, 4, -5, 6)) == arrayListOf(4,2,5))
    }
}