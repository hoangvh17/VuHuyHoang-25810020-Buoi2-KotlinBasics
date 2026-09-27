// Vũ Huy Hoàng - 25810020
fun main() {
    dinhDangDiaChi(
        tenNguoiGui = "Huy Hoàng",
        soDienThoai = "0868686868",
        diaChi = "Thủ Đức", 
        loaiGiaoHang = "Hỏa tốc", 
        khungGioGiaoHang = "18h00")
}
fun dinhDangDiaChi(
	tenNguoiGui: String,
    soDienThoai: String,
    diaChi: String,
   	loaiGiaoHang: String = "Nhanh",
   	khungGioGiaoHang: String = "18h00"
){
    println("Tên người gửi: $tenNguoiGui, SDT: $soDienThoai, Địa chỉ: $diaChi, Loại giao hàng: $loaiGiaoHang, Khung giờ giao hàng: $khungGioGiaoHang")
}
