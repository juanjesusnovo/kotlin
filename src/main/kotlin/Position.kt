class Position(var x : Int, var y : Int) {
    /*
    private var x : Int = 0
    private var y : Int = 0

    constructor(x:Int, y:Int){
        this.x = x
        this.y = y
    }*/

    override fun toString(): String {
        return "($x,$y)"
    }
}


//Al declarar las variables junto a la clase se crea el constructor junto a las variables
//Al hacer esto tmbn generas los getter y setter