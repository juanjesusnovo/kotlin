package Functions

internal class Ejercicio6KtTest {

    @org.junit.jupiter.api.Test
    fun calcPuntos() {
        assert(calcPuntos(Punto(2.0,3.0),Punto(4.0,6.0))==3.605551275463989)
        assert(calcPuntos(Punto(0.0,0.0),Punto(0.0,0.0))==0.0)
    }
}