package Rel5

fun contarLetras(word : String) : Any{
    var dicc = mutableMapOf<Any, Any>()
    for (char in word){
        var cont  = 0
        for (charac in word){
            if (charac == char){cont += 1}
        }
        dicc += mutableMapOf(char to cont)
    }
    return dicc
}

fun main(){
    println(contarLetras("aguacate"))
}

