fun main() {
    var charA : Char = 'A'
    // println(charA == 65)

    // Char pada kotlin memiliki method: isUpperCase(), isLowerCase(), isDigit(), lowercase()
    println(charA.isUpperCase()) // true
    println(charA.isLowerCase()) // false
    println(charA.isDigit()) // false
    println(charA.lowercase()) // a

    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = " + strA)

    /* Output:
    true
    false
    false
    a
    Kini charA sudah menjadi String = A
     */
}