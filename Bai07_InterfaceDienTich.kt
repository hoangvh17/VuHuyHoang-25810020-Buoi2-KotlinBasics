// Vũ Huy Hoàng - 25810020
import kotlin.math.PI

interface CoTheTinhDienTich{
    fun tinhDienTich(): Double
}

fun main() {
	class HinhVuong(val canh: Double): CoTheTinhDienTich{
        override fun tinhDienTich(): Double{
            return canh * canh
        }
    }
    class HinhTron(val banKinh: Double): CoTheTinhDienTich{
        override fun tinhDienTich(): Double{
            return banKinh * banKinh * PI
        }
    }
        
    val hinh1 = HinhVuong(canh = 4.0)
    println("Diện tích hình vuông cạnh ${hinh1.canh} :${hinh1.tinhDienTich()}")
    val hinh2 = HinhTron(banKinh = 3.0)
    println("Diện tích hình tròn bán kính ${hinh2.banKinh} :${hinh2.tinhDienTich()}")
}
