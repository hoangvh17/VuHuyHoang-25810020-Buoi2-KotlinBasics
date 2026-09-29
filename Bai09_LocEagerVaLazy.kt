// Vũ Huy Hoàng - 25810020
fun main() {
	val nhacCu = listOf("Piano", "Guitar", "Violin", "Drum", "Saxaphone")
    println(nhacCu.filter{it.startsWith("V")})
	println(nhacCu.asSequence().filter{it.startsWith("V")}.toList())
    // Sequence xử lý dữ liệu khi cần, phù hợp với danh sách lớn hoặc nhiều bước xử lý.
}
