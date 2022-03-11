fun main() {
    /*
    Aturan penulisan variabel pada kotlin:
    1. Tidak boleh diawali oleh angka atau simbol, kecuali underscore(_)
    2. Tidak boleh ada whitespace
    3. Menggunakan style camelCase
    4. Tipe data diawali dengan huruf kapital, contoh: Double, String, Integer,
     */
    var dynamicVariabel = 1 .. 2
    var staticVariabel: Double = 2.0

    println("Contoh dynamic variabel $dynamicVariabel")
    println("Contoh static variabel $staticVariabel")
}