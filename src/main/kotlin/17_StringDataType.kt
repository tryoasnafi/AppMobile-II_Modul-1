fun main() {
    // String merupakan kumpulan character
    val myName: String = "Tryo Asnafi"

    // Lakukan perulangan setiap character pada String
    for(chr in myName){
        print(chr)
    }
    println()

    // Menggabungkan tipe data lain ke dalam String
    val s = "abc" + 1
    println(s + "def")

    // Multi-baris String menggunakan 3x double quote (""" """)
    var text = """
        for (c in "foo")
        print(c)
    """.trimIndent() // Menghapus indentasi (whitespace) yang tidak diperlukan
    println(text)

    /* Output:
    Tryo Asnafi
    abc1def
    for (c in "foo")
    print(c)
    */
}