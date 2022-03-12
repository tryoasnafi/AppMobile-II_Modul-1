fun main() {
    var c: Char // character
    var i: Int // ordinal (ASCII) value of the character

    // konversi dari char ke nilai ASCII
    c = 'a'
    i = c.code
    println("Char $c dikonversi ke ASCII menjadi $i")

    // konversi dari nilai ASCII ke char
    i = 98
    c = i.toChar()
    println("ASCII $i dikonversi ke Char menjadi $c")

    /* Output:
    Char a dikonversi ke ASCII menjadi 97
    ASCII 98 dikonversi ke Char menjadi b
     */
}