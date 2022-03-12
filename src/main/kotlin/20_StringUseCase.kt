fun main() {
    // Program menghitung jumlah huruf vokal dan konsonan pada sebuah kalimat
    var sentence = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat."
    println(sentence)
    sentence = sentence.lowercase() // mengubah seluruh kata menjadi huruf kecil

    // Wadah penyimpanan total huruf vokal dan konsonan
    var vowelCount = 0
    var consonantCount = 0

    // Daftar karakter huruf vokal dan konsonan
    val vowels = "aiueo"
    val consonants = "bcdfghjklmnpqrstvwxyz"

    // Perulangan mengecek setiap karakter pada kalimat
    for (char in sentence) {
        // Cek, apakah karakter saat ini terdapat pada daftar huruf vokal, jika ya maka increment vowelCount
        // jika tidak, apakah karakter saat ini terdapat pada daftar huruf konsonan? jika ya, maka increment consonantCount
        // jika tidak, maka bukan vokal/konsonan.
        if (vowels.contains(char)) vowelCount++ else if (consonants.contains(char)) consonantCount++
    }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${sentence.length - (vowelCount + consonantCount)}") // Hitung karakter yang bukan vokal maupun konsonan

    /* Output:
    A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat.
    Vowels: 33
    Consonants: 55
    Other characters: 21
     */
}
