// Vũ Huy Hoàng - 25810020
fun main() {
	class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)
    val sanPham1 = SanPham("Sp1", 12.0, 2)
    println(sanPham1.tenSanPham)
    println(sanPham1.gia)
    println(sanPham1.soLuongTonKho)
    
    val sanPham2 = SanPham(tenSanPham = "Sp2", gia = 14.0, soLuongTonKho = 3)
    println(sanPham2.tenSanPham)
    println(sanPham2.gia)
    println(sanPham2.soLuongTonKho)
}
