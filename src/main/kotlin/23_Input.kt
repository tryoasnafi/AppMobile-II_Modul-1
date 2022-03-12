fun main() {
    print("Siapa nama kamu? ")
    val inputName: String = readLine()!!

    print("Berapa umur kamu? ")
    val inputAge: Int = readLine()!!.toInt()

    print("Apakah kamu pelajar? (true/false): ")
    val isStudent: Boolean = readLine()!!.toBoolean()

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