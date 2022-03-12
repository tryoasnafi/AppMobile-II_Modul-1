fun main() {
    // Ada banyak method/fungsi untuk mengubah tipe data secara eksplisit
    // seperti: toInt(), toLong(), toDouble(), toString(), dll.

    val valInt: Int = 1

    val valSum: Long = 3L + valInt //konversi implisit dari Integer (valInt) menjadi Long
    println("Konversi variabel valInt secara implisit : " + valSum + " " + valSum::class.simpleName)

    val valLong: Long = valInt.toLong() // konversi eksplisit menggunakan method
    println("Konversi variabel valInt secara eksplisit : " + valLong + " " + valLong::class.simpleName)

    /* Output:
    Konversi variabel valInt secara implisit : 4 Long
    Konversi variabel valInt secara eksplisit : 1 Long
     */
}