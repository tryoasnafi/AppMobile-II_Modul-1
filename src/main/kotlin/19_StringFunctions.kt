fun main() {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin")) // false, karena R dan r berbeda (case-sensitive)
    println(s.endsWith("tamus")) // true
    println(s.contains("pot")) // true

    // uppercase() and lowercase()
    var config = "Fullscreen shaDows autosave"
    config = config.lowercase() // Menjadi huruf kecil semua
    println("Will sound be turned off?")
    println(config.contains("sound".uppercase())) // Mengubah menjadi huruf besar, sehingga menjadi"NOSOUND"
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))

    // replace(), mengganti kata/karakter tertentu dengan kata/karakter yang diinginkan
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println("$strJava is ${strJava.length} characters long.")

    // substring(), membuat string baru dari string lama, kita dapat menentukan range karakter yang ingin diambil
    println("I would not banish all of these Internets.".substring(19, 31))

    // compareTo(), membandingkan apakah kedua string sama,
    // jika tidak sama, maka mengembalikan nilai -1
    // jika sama, maka mengembalikan nilai 0
    println("alpha".compareTo("bravo"))

    /* Output:
    false
    true
    true
    Will sound be turned off?
    false
    Would the player like to use autosave?
    true
    Kotlin is the best! is 19 characters long.
    all of these
    -1
    */
}