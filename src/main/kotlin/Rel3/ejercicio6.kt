package Rel3

import kotlin.math.sqrt

fun calcPuntos(p1 : Punto, p2 : Punto): Double {
    var ejx = Math.pow((p2.x - p1.x),2.0)
    var ejy = Math.pow((p2.y - p1.y),2.0)
    var sol = sqrt(ejx+ejy)
    return sol
}



