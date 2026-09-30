// Vũ Huy Hoàng - 25810020
fun main() {
    class TaiKhoanNganHang(
        val soTaiKhoan:String,
        val soDuBanDau:Double){
        
        fun napTien(soTien:Double) {
            soDu += soTien
            println("Số dư sau khi nạp '$soTien': $soDu")
        }
        fun rutTien(soTien:Double): Boolean {
            if(soDu < soTien){
                print("Không đủ số dư")
                return false
            }
            soDu -= soTien
            println("Số Dư sau khi rút '$soTien': $soDu")
            return true
        }
        
        var soDu = soDuBanDau
    }
    
    val tk1 = TaiKhoanNganHang(soTaiKhoan= "237854827", soDuBanDau = 0.0)
    println("Số dư ban đầu: ${tk1.soDuBanDau}")
    tk1.napTien(24.0)
    tk1.rutTien(1.0)
}
