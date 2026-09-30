// Vũ Huy Hoàng - 25810020
fun main() {
    class TaiKhoanNganHang(val soTaiKhoan:String, val soDuBanDau:Double) {
        var soDu = soDuBanDau
        init{
            println("Tài khoản vừa được tạo")
            if(soDuBanDau < 0){
                println("Số dư không hợp lệ!!!")
            } else {
                println("Tạo tài khoản thành công, số dư $soDuBanDau")
            }
        }
    }
    TaiKhoanNganHang(soTaiKhoan= "237854827", soDuBanDau = -1.0)
    TaiKhoanNganHang(soTaiKhoan= "237854827", soDuBanDau = 12.0)
}
