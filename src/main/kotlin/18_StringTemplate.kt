fun main() {
    val a = 7
    val b = 8
    val c = a + b

    // Menggabungkan variabel ke dalam string
    val s = "When we add $a and $b, we get $c"
    println(s)

    // Jika memerlukan pemrosesan sebelum mencetak variabel gunakan ${ VARIABLE_NAME }
    println("When we add $a and $b, we get ${a + b}")

    // Char $ tidak dapat ditampilkan dengan escape(\), solusinya menggunakan string template
    val price = """
        ${'$'}9.99
    """.trimIndent()
    println(price)

    /* Output:
    When we add 7 and 8, we get 15
    When we add 7 and 8, we get 15
    $9.99
    */
}