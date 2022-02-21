package ExamenJavaMayo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GraficoCompuestoTest {

    @Test
    fun mover() {
        var graficos = ArrayList<Grafico>()
        //var graficos1 = arrayListOf(Punto(100,200),Rectangulo(10,20,100,100),Circulo(12,400,400))
        graficos.add(Punto(100,200))
        graficos.add(Rectangulo(10,20,100,100))
        graficos.add(Circulo(12,400,400))
        val miGrafico = GraficoCompuesto(graficos)
        assert(miGrafico.mover(0,0))
    }
}