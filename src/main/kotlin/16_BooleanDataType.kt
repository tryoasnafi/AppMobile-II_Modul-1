fun main() {
    var varBool : Boolean = true
    if(varBool) println("varBool bernilai " + varBool)

    /* Output:
    varBool bernilai true
     */

    var varInt : Int = 1
    if(varInt) { // Menghasilkan error karena `if` mengevaluasi nilai Int bukan Boolean
        println("varInt bernilai " + varInt)
    }
}