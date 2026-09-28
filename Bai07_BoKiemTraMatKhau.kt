// Vũ Huy Hoàng - 25810020
fun main() {
    val kiemTraDoDai: (String) -> Boolean = { matKhau ->  if(matKhau.length >= 8) true else false }
    println("Độ dài mật khẩu: ${kiemTraDoDai("xinchao")}")
    println("Độ dài mật khẩu: ${kiemTraDoDai("abc")}")
    println("Độ dài mật khẩu: ${kiemTraDoDai("matkhaudai")}")
}
