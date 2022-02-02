package Rel5

fun quitarVocales(palabra: String) : String{
    var pal = palabra
    for (x in pal){if (x in "aeiouAEIOU"){pal = pal.replace(x.toString(),"")}}
    return pal
}

fun quitarConsonantes(palabra: String) : String{
    var pal = palabra
    for (x in pal){if (x !in "aeiouAEIOU"){pal = pal.replace(x.toString(),"")}}
    return pal
}

fun ponerMayusculas(palabra: String) : String{
    var pal = palabra
    for (x in pal){if (x in "aeiou"){pal = pal.replace(x.toString(),x.uppercase())}}
    return pal
}