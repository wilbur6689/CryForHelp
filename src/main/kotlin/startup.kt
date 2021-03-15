
class startUp
fun main() {
    println("hello world")
    println("you have been selected to survive the island. good luck")

    println("how many rows would you like?")
    val rowsTotl = Integer.valueOf(readLine())

    println("how many columns would you like?")
    val colTotl = Integer.valueOf(readLine())


    // load previous world or create a new one
    val landTypes = arrayOf("stone", "ore", "dirt", "grass", "trees")
    var currWorldMap = mutableMapOf<Double, String>()
    var rowCount = 0
    for (i in 1..colTotl) {
        var columnCount = 0.1
        rowCount+=1
        //println("rowCount= " + rowCount)
        for (j in 1..rowsTotl) {
            //println("columnCount= " + columnCount)
            currWorldMap[rowCount.plus(columnCount)] = landTypes.random()
            columnCount += 0.1
        }

    }

    println("------------------------------------")

    println("current World Map = $currWorldMap")
    println(rowCount)
    println(currWorldMap.size)


    println("------------------------------------")


    // load/create all the required resources required for the game

    // call the method that will start the game


}
