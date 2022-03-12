fun main() {
    val a: Int = 10000
    println("a apakah identik dengan a (a === a) : " + (a === a))

    // Ketika membuat dua variabel baru dan menginisilisasi dengan variabel yang sudah ada & sama,
    // maka kedua variabel baru hanya memiliki nilai yang sama, tetapi tidak identik.
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA (boxedA === anotherBoxedA) : " + (boxedA === anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA (boxedA == anotherBoxedA) : " + (boxedA == anotherBoxedA))

    /* Output:
    a apakah identik dengan a (a === a) : true
    boxedA apakah identik dengan anotherBoxedA (boxedA === anotherBoxedA) : false
    boxedA apakah memiliki nilai yang sama dengan anotherBoxedA (boxedA == anotherBoxedA) : true
     */
}