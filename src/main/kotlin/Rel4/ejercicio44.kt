package Rel4

fun sumNumeros(numeros : List<Int>): ArrayList<Int>{
    var positivo = 0
    var negativo = 0
    for (valor in numeros)
        if (valor >= 0){positivo += 1}
        else{negativo += 1}
    return arrayListOf<Int>(positivo, negativo, numeros.sum())
}