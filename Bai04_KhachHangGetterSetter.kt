// Vũ Huy Hoàng - 25810020
fun main() {
    class KhachHang( var ho: String, var ten: String){
        var hoTen: String
        	get() = this.ho + " " + this.ten
        	set(value) {
				val phan = value.split(" ")
                ho=phan[0]
                ten=phan[1]
            }
    }
    val khachHang = KhachHang("Vũ", "Huy Hoàng") 
    println(khachHang.hoTen)
    
    khachHang.ten = "Nam"
	println(khachHang.hoTen)
    
    khachHang.hoTen = "Xin Chào"
    println(khachHang.ho)
    println(khachHang.ten)
}
