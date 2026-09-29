// Vũ Huy Hoàng - 25810020
fun main() {
    val dsSoNguyen = listOf(1,2,3,4,5)
    val ketQua = dsSoNguyen.map { it * 2 }
    println(ketQua)
    
    val dsSo = listOf(listOf(1,2), listOf(3,4))
    println(dsSo)
    val gop = dsSo.flatten()
    println(gop)
}
