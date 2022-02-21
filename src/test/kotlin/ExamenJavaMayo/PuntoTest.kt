package ExamenJavaMayo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PuntoTest {

    @Test
    fun mover() {
        var puntoPrueba = Punto(0,0)
        assert(puntoPrueba.mover(100,100))
        assert(puntoPrueba.mover(100,0))
        assert(puntoPrueba.mover(0,100))
        assert(puntoPrueba.mover(0,0))
        assert(puntoPrueba.mover(800,600))
        assert(!puntoPrueba.mover(900,100))
        assert(!puntoPrueba.mover(100,700))
    }
}