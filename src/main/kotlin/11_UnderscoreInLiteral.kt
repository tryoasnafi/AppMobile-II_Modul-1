fun main() {
    // Kita dapat menggunakan underscore(_) untuk memisahkan nilai number
    // sehingga dapat lebih mudah dibaca
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("oneMillion = " + oneMillion)
    println("creditCardNumber = " + creditCardNumber)
    println("socialSecurityNumber = " + socialSecurityNumber)
    println("hexBytes = " + hexBytes)
    println("bytes = " + bytes)

    /* Output:
    oneMillion = 1000000
    creditCardNumber = 1234567890123456
    socialSecurityNumber = 999999999
    hexBytes = 4293713502
    bytes = 3530134674
     */
}