fun main() {
    // Program Kalkulator Sederhana
    println("Kalkulator Sederhana")

    print("Masukkan angka pertama: ")
    val a = readLine()!!.toDouble() // terima masukan angka pertama lalu konversi menjadi Double

    print("Masukkan angka kedua: ")
    val b = readLine()!!.toDouble() // terima masukan angka kedua lalu konversi menjadi Double

    // lakukan fungsi matematika dan simpan pada masing-masing variabel
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b

    // tampilkan hasil operasi matematika
    println("Jumlah: ${sum}")
    println("Perbedaan: ${difference}")
    println("Hasil kali: ${product}")
    println("Hasil bagi: ${quotient}")
    println("Terimakasih telah menggunakan program ini.")

    /*
    Input:
    10
    20

    Output:
    Kalkulator Sederhana
    Masukkan angka pertama: 10
    Masukkan angka kedua: 20
    Jumlah: 30.0
    Perbedaan: -10.0
    Hasil kali: 200.0
    Hasil bagi: 0.5
    Terimakasih telah menggunakan program ini.
     */
}