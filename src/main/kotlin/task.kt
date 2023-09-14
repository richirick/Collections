import jogamp.graph.font.typecast.ot.table.Table.name
import kotlin.math.max

////import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.search
//fun search (list: List<Grocery>,  criteria:(g: Grocery)-> Boolean){
////    if (l.name)
//        for (l in list) {
//            if (criteria(l))
//            println(l.name)
//
//    }
//}
////{}
////criteria(l)
////
//
//data class Grocery(val name: String, val category: String,
//                   val unit: String, val unitPrice: Double)
//
//fun main(args: Array<String>){
//    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "1b", 3.0),
//        Grocery("Mushrooms", "Vegetable", "1b", 4.0),
//        Grocery("Bagels", "Bakery", "Pack", 1.5),
//        Grocery("Olive oil", "Pantry", "Bottle", 6.0),
//        Grocery("Ice cream", "Frozen", "Pack", 3.0))
//    println("Expensive ingredients:")
//    search(groceries) {i: Grocery -> i.unitPrice > 5.0}
//    println("All vegetables: ")
//    search(groceries){i: Grocery -> i.category == "Vegetable"}
//    println("All packs:")
//    search(groceries){i: Grocery -> i.unit == "Pack"}
//}
////393
abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)
class Contest<T: Pet>() {
    var scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }
    fun getWinners(): Set<T> {
        val highScore = scores.values.max()
        val winners = scores.filter{ it.value== highScore }.keys
        winners.forEach{ println("Winner: ${it.name}") }
        return winners
    }
}