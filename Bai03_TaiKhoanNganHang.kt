// Vũ Huy Hoàng - 25810020
fun main() {
    val soDuBanDau: Int = 5_000_000
    var soDuHienTai: Int = soDuBanDau
	
    soDuHienTai += 2000000
    println("Số dư sau khi gửi thêm: $soDuHienTai")
    
    soDuHienTai -= 1500000
    println("Số dư sau khi rút: $soDuHienTai")
    
    // val cho số dư ban đầu ví đây là con số cố định ( hằng số mà thầy đã dạy ), var cho số dư hiện tại vì nó có sự biến động 
}
