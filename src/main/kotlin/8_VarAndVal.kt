fun main() {
    // Kata kunci var akan menghasilkan mutable variable yang artinya variabel tersebut dapat di-assign ulang
    var mutableVariable: Int
    mutableVariable = 10

    // Kata kunci val akan menghasilkan immutable variable yang artinya variabel tersebut tidak dapat di-assign ulang
    val immutableVariable: String = "Hello"
    immutableVariable = "Hai" // Error: Val cannot be reassigned
}