package ExamenKotlin

class Compra(
    var electrodomesticos: ArrayList<Electrodomestico> = arrayListOf(Lavadora()),
){
    fun precioFinal(): Double {
        var precioFinalTodo = 0.0
        for (x in electrodomesticos){
            precioFinalTodo += x.precioFinal()
        }
        return precioFinalTodo
    }
    fun precioDesglosado(): String{
        var lavadoras = 0.0
        var teles = 0.0
        for (x in electrodomesticos){
            if (x is Lavadora){lavadoras += x.precioFinal()}
            else{teles += x.precioFinal()}
        }
        return "Te has gastado $lavadoras en Lavadoras y $teles en Televisores"
    }
}


fun main(){
    var lavadora = Lavadora()
    var televisor = Televisor()
    var lavadora1 = Lavadora(precioBase = 120.0, peso = 40.0)
    var televisor1 = Televisor(precioBase = 200.0, peso = 25.0)
    var lavadora2 = Lavadora(10.0, 125.0, 15.0, "rojo", 'E')
    var televisor2 = Televisor(40.0, arrayListOf(1920, 1080), 250.0, 20.0, "negro", 'A')
    var lavadora3 = Lavadora(30.0)
    var televisor3 = Televisor(40.0)
    var lavadora4 = Lavadora(peso = 22.0)
    var televisor4 = Televisor(consumoEnergetico = 'D')
    var electrodomesticos = arrayListOf(lavadora, lavadora1, lavadora2, lavadora3, lavadora4, televisor, televisor1, televisor2, televisor3, televisor4)
    var compra = Compra(electrodomesticos)
    println("Te has gastado en electrodomesticos: ")
    println(compra.precioFinal())
    println(compra.precioDesglosado())

}