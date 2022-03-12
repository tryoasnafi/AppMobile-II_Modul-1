fun main() {
    val msg = "system requirement specification"
    val shift = 4 // chiper
    var encryptedMessage = ""

    // Perulangan untuk mengenkripsi pesan
    for (char in msg) {
        var charCode = char.code // mengubah karakter menjadi kode ASCII desimal

        charCode += shift // menambahkan kode ASCII desimal dengan desimal chiper
        if (charCode > 'z'.code) charCode -= 26 // jika lebih besar dari 'z' maka mulai dari 'a
        encryptedMessage += charCode.toChar() // Masukkan encrypted karakter kedalam pesan
    }

    println("original: $msg")
    println("encrypted: $encryptedMessage")

    /* Output:
    original: system requirement specification
    encrypted: wcwxiq$viuymviqirx$wtigmjmgexmsr
     */
}