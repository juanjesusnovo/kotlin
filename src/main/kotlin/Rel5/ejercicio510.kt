package Rel5

fun palindromo(word : String) : Boolean{
    var word1 = word.reversed()
    if (word1 == word){return true}
    else{return false}
}