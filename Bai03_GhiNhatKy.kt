// Vũ Huy Hoàng - 25810020
fun main() {
    ghiNhatKyThuong("Chạy")
    ghiNhatKyUnit("Chạy")
}

fun ghiNhatKyThuong(hanhDong: String){
    println("Hành động: $hanhDong")
}

fun ghiNhatKyUnit(hanhDong: String): Unit{
    println("Hành động: $hanhDong")
}

// Khi hàm không trả về giá trị thì mặc định nó là Unit
