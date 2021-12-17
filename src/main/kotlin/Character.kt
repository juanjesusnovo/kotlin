class Character(var name : String = "", var position : Position = Position(0,0) ) {
    /*
    private var name : String = ""
    private var position : Position = Position(0,0)

    constructor(name : String, position: Position){
        this.name = name
        this.position = position
    }
    */

    constructor(name: String) : this(){
        this.name = name
    }
    fun walk(destiny: Position) : Boolean {
        this.position = destiny
        return true
    }

    override fun toString(): String {
        return "$name\n$position"
    }
}