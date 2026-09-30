// Vũ Huy Hoàng - 25810020
fun main() {
    class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double){
	    constructor(ten: String) : this("TAM", ten, 0.0)
    }
    
    val nv1 = NhanVien("MS01", "Hoàng", 21.0)
	// println(nv1.maNhanVien) // Lỗi vì maNhanVien không có val/var nên không phải property.
    println(nv1.ten)
    println(nv1.luongThang) 
    
    val nv2 = NhanVien("Huy")
    println(nv2.ten)
    println(nv2.luongThang)
}
