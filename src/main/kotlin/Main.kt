fun main(args: Array<String>) {
    println("Hello World!")

    var character1 : Character = Character("Manolito",Position(0,0))
    character1.walk(Position(3,4))

    println(character1.toString())
}