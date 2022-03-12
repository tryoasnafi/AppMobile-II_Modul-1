fun main() {
    // Constant Literal tidak dapat di-assign ulang nilainya

    val floatLiteral : Float = 178.95F //Literal Float
    println("Contoh Literal Float : " + floatLiteral)
    val oneBillion: Long = 1000000000L //Literal Long
    println("Contoh Literal Long : " + oneBillion)
    val valHeksa = 0x0F //Literal heksadesimal diawali dengan 0x
    println("Contoh Literal Heksadesimal : " + valHeksa)
    val valBinary = 0b00001011 //Literal binary diawali dengan 0b
    println("Contoh Literal Binary : " + valBinary)
    val notasiKonvensional = 123.5e10
    println("Contoh Literal Konvensional Floating Point Number : " + notasiKonvensional)

    /* Output:
    Contoh Literal Float : 178.95
    Contoh Literal Long : 1000000000
    Contoh Literal Heksadesimal : 15
    Contoh Literal Binary : 11
    Contoh Literal Konvensional Floating Point Number : 1.235E12
     */
}