package Rel5

fun contarLetras(word : String) : Any{
    var dicc = mutableMapOf<Any, Any>()
    for (char in word){
        dicc += mutableMapOf(char to "")
    }
    return dicc
}

fun main(){
    println(contarLetras("pope"))
}

