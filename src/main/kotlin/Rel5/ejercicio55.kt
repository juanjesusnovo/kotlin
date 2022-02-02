package Rel5

fun ahorcado(palabras: String, letra : String): Any{
    var fallos = 5
    val pal = palabras
    var resul = ""
    for (x in pal){resul += "_"}
    if (resul == pal){
        return "Ganaste!!!!!"
    }
    else if (letra in pal) {
        fallos -= 1
        resul = resul.replaceRange((pal.indexOf(letra)..pal.indexOf(letra)),letra)
        println(resul)
        println("Te quedan ${fallos} fallos")
    }
    else {
        fallos -= 1
        println(resul)
        println("Te quedan ${fallos} fallos")
    }
    return listOf(fallos, resul)
}