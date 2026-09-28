// Vũ Huy Hoàng - 25810020
fun main() {
    println(tinhBinhPhuongMotSo(a = 4))
    println(tinhBinhPhuong_RutGon( a = 4))
    println(chuViHinhVuong( canh = 2))
    println(chuViHinhVuong_RutGon( canh = 2))
    println(kiemTraSoChan( so = 3))
    println(kiemTraSoChan_RutGon( so = 3))
}

fun tinhBinhPhuongMotSo(a: Int): Int{
    return a * a
}
fun tinhBinhPhuong_RutGon(a: Int): Int = a * a

fun chuViHinhVuong(canh: Int): Int{
    return canh * 4
}
fun chuViHinhVuong_RutGon(canh: Int): Int = canh * 4

fun kiemTraSoChan(so: Int): String{
    if(so % 2 == 0){
        return "Số $so là số chẵn"
    } else {
        return "Số $so là số lẻ"
    }
}
fun kiemTraSoChan_RutGon(so: Int): String = if(so % 2 == 0) "Số $so là số chẵn" else "Số $so là số lẻ"
