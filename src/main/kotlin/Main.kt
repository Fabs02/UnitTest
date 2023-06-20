fun countXO(str:String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var count0 = 0
    while(i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            count0++
        }
        i++
    }

    return count0 == countX && count0 != 0
}



fun main(args: Array<String>) {
    println(countXO("xxoo"))
    println(countXO("xxxo"))
    println(countXO("xxxxo"))
}