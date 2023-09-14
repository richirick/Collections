import kotlin.collections.Map as mapOf

//data class Recipe(var name: String)
//fun main(args: Array<String>){
//    var mShoppingList= mutableListOf("Tea", "Eggs", "Milk")
//    println("mShoppingList original: $mShoppingList")
//    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
//    mShoppingList.addAll(extraShopping)
//    println("mShoppingList items added: $mShoppingList")
//    if (mShoppingList.contains("Tea")) {
//        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
//    }
//    mShoppingList.sort()
//    println("mShoppingList sorted: $mShoppingList")
//    mShoppingList.reverse()
//    println("mShoppingList reversed: $mShoppingList")
//
//    val mShoppingSet = mShoppingList.toMutableSet()
//    println("mShoppingSet: $mShoppingSet")
//    val moreShopping = setOf("Chivies", "Spinch", "Milk")
//    mShoppingSet.addAll(moreShopping)
//    println("mShoppingSet items added: $mShoppingSet")
//    mShoppingList = mShoppingSet.toMutableList()
//    println("mShoppingList new version: $mShoppingList")
//    val r1 = Recipe("Chocken Soup")
//    val r2 = Recipe("Quinoa Salad")
//    val r3 = Recipe("Thai Curry")
//    val r4 = Recipe("Jambalaya")
//    val r5 = Recipe("Sausage Rolls")
//    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
//    println("mRecipeMap original: $mRecipeMap")
//    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
//    mRecipeMap.putAll(recipesToAdd)
//    println("mRecipeMap updated: $mRecipeMap")
//    if (mRecipeMap.containsKey("Recipe1")) {
//        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
//    }
//}
//fun main(args:Array<String>){
//    var a: MutableList<String> = mutableListOf()
//    a.add(0, "Zero")
//    a.add(1, "Two")
//    a.add(2, "Four")
//    a.add(3, "Six")
//    println(a)
//    if(a.contains("Zero")) a.add("Eight")
//    a.removeAt(0)
////    if(a.contains("Zero")) a.add("Eight")
//    println(a)
//    if (a.indexOf("Four") !=4) a.add("Ten")
//
//    println(a)
//        if(a.contains("Zero")) a.add("Twelve")
//        println(a)
//
//}
//fun main(args: Array<String>) {
//    val term1 = "Array"
//    val term2 = "List"
//    val term3 = "Map"
//    val term4 = "MutableList"
//    val term5 = "MutableMap"
//    val term6 = "MutableSet"
//    val term7 = "Set"
//
//    val def1 = "Holds values in no particular order."
//    val def2 = "Holds key/value pairs."
//    val def3 = "Holds values in a sequence."
//    val def4 = "Can be updated."
//    val def5 = "Can't be updated."
//    val def6 = "Can be resized."
//    val def7 = "Can't be resized."
//    val glossary = mapOf( term4 to "$def3 $def4 $def6",
//    term7 to "$def1 $def5 $def7",
//    term1 to "$def3 $def4 $def7",
//    term4 to "$def2 $def4 $def6",
//    term2 to "$def3 $def5 $def7",
//    term6 to "$def1 $def4 $def6",
//    term3 to "$def2 $def5 $def7")
//    for ((key, value) in glossary) println("$key: $value")
//}
fun main(args: Array<String>) {
    val mList = mutableListOf("Football", "Baseball", "Basketball")
    mList.sort()
    mList.reverse()
    println(mList)
}
//319 head first