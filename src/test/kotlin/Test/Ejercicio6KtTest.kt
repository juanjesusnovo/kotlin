package Test

import Rel3.Punto

internal class Ejercicio6KtTest {

    @org.junit.jupiter.api.Test
    fun calcPuntos() {
        assert(Rel3.calcPuntos(Punto(2.0, 3.0), Punto(4.0, 6.0)) ==3.605551275463989)
        assert(Rel3.calcPuntos(Punto(0.0, 0.0), Punto(0.0, 0.0)) ==0.0)
    }
}