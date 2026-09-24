// Vũ Huy Hoàng - 25810020
fun main() {
    val dsSach = mutableListOf("Math", "English", "Financial", "Life", "Geography")
    println("Danh sach ban dau: $dsSach")
    dsSach.add("History")
    dsSach.add("AI")
    dsSach.remove("Financial")
    dsSach.sort()
    println("Danh sach sau thay doi: $dsSach")
}
