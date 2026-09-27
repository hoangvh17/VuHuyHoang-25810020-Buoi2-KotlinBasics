// Vũ Huy Hoàng - 25810020
fun main() {
    datBan("Hoang1", 1)
    datBan("Hoang2", 2, "VIP")
    datBan(tenKH = "Hoang3", soLuong = 2, loaiBan = "Luxury")
}
fun datBan(tenKH: String, soLuong: Int, loaiBan: String = "Bàn Thường"){
    println("Tên khách hàng: $tenKH, số lượng: $soLuong, loại bàn: $loaiBan")
}
