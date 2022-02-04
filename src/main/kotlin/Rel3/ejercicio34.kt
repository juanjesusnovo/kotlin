package Rel3


fun esBisiesto(anio : Int): Boolean{
    if (anio%4 == 0){
        if(anio%100==0){
            return anio%400==0
        }
    }
    return false
}