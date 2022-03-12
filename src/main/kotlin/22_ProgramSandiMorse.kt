fun main() {
    // Definisikan karakter alfabet dan morse
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    val morseMessage = "- .-. -.-- ---"
    println("The original message: $morseMessage")
    // String pesan yang sebenarnya
    var message = ""

    // Buat sebuah array yang menyimpan setiap karakter morse
    val characters = morseMessage.split(" ")

    // Lakukan perulangan terhadap `characters` morse
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        // Jika karakter ditemukan, masukkan ke dalam pesan
        if (index != -1) message += alphabetChars[index]

    }

    println("The decoded message: $message")

    /* Output:
    The original message: - .-. -.-- ---
    The decoded message: tryo
     */
}