fun main() {
    /*
        Merupakan simbol yang berperan melakukan sesuatu antara dua operand
        Jenis-jenis operator:
        1. Arithmetic: + - * /
        2. Assignment: = += -= /= *= %=
        3. Logical: && || ! and or not
        4. Equality: == != === !==
        5. Comparison: > < >= <=
     */
    var a = 7
    var b = 6
    var c = (a++ + b--) / 2
    println(c - b)
}