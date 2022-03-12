fun main() {
    // readline() berguna untuk membaca ketikan keyboard
    print("Siapa nama kamu? ")
    val inputName: String = readLine()!! // !! digunakan untuk memberi tahu bahwa tidak boleh null atau harus di-input

    print("Berapa umur kamu? ")
    val inputAge: Int = readLine()!!.toInt() // konversi menjadi Integer

    print("Apakah kamu pelajar? (true/false): ")
    val isStudent: Boolean = readLine()!!.toBoolean() // konversi menjadi boolean

    println("$inputName, $inputAge tahun, ${if (isStudent) "pelajar" else "bukan pelajar"}")

    /*
    Input:
    Tryo Asnafi
    20
    true

    Output:
    Siapa nama kamu? Tryo Asnafi
    Berapa umur kamu? 20
    Apakah kamu pelajar? (true/false): true
    Tryo Asnafi, 20 tahun, pelajar
     */
}