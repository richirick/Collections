import java.util.concurrent.locks.Condition

//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}
//class PetOwner<T: Pet>(t: T) {
//    val pets = mutableListOf(t)
//    fun add(t: T) {
//        pets.add(t)
//    }
//    fun remove(t: T ) {
//        pets.remove(t)
//    }
//}
//fun main(args: Array<String>) {
//    val catFuzz = Cat("Fuzz Lightyear")
//    val catKatsu = Cat("Katsu")
//    val fishFinny = Fish("Finny McGraw")
//    val catOwner = PetOwner(catFuzz)
//    catOwner.add(catKatsu)
//}
//interface D<out T> {
//    fun myFunction(str: String): T
//}
fun unless( condition: Boolean, code:() -> Unit ) {
    if (!condition) { code()
    }
}
fun main(args: Array<String>) {
    val options = arrayOf("Red", "Amber", "Green")
    var crossWalk = options[(Math.random() * options.size).toInt()]
    if (crossWalk == "Green") {
        println("Walk!")
    }
    unless (crossWalk == "Green") {
        println("Stop!")
    }
}