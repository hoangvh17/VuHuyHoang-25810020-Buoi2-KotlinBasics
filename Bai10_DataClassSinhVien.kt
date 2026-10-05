// Vũ Huy Hoàng - 25810020
data class SinhVien(
	var mssv: String,
    var hoTen: String,
    var diemTB: Double
)
fun main() {
    val sv1 = SinhVien("ms01", "Vu", 8.5)
    val sv2 = SinhVien("ms01", "Vu", 8.5)
    val sv3 = sv1.copy(diemTB = 9.3)
    if (sv1 == sv2){
        println("Giá trị giống nhau")
    }
    println(sv1.toString())
    println(sv3)
}
