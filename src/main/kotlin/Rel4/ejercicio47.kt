package Rel4

fun restasSucesivas(dividendo : Int, divisor : Int): List<Int>{
    var cociente = 0
    var dividendo1 = dividendo
    if (dividendo < 0) {dividendo1 = 0}
    while (dividendo1 >= divisor){
        dividendo1 -= divisor
        cociente += 1
    }
    return listOf(cociente, dividendo1)
}