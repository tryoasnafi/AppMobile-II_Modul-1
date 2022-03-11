fun main() {
    // Tipe data number meliputi:
    // Byte dari -128 s.d. 127
    // Short dari -32768 s.d. 32767
    // Int dari -2147483648 s.d. 2147483647
    // Long dari -9223372036854775807 s.d. 9223372036854775807
    // Float, single precision (32 bits)
    // Double, double precision (64 bits)

    // Tipe bilangan bulat
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807L
    val maxLong: Long = 922337203685477580L // 64bit

    // Tipe bilangan pecahan
    val maxFloat: Float = 9.123456789f
    val maxDouble: Double = 9.922337203685477580000000000000000012312

    println("minByte: $minByte")
    println("maxByte: $maxByte")
    println("minShort: $minShort")
    println("maxShort: $maxShort")
    println("minInt: $minInt")
    println("maxInt: $maxInt")
    println("minLong: $minLong")
    println("maxLong: $maxLong")
    println("maxFloat: $maxFloat")
    println("maxDouble: $maxDouble")
}
