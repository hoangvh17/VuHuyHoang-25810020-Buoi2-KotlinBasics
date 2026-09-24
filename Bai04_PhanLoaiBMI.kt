// Vũ Huy Hoàng - 25810020
fun main() {
    val canNang:Int = 54
    val chieuCao:Double = 1.74
    
    val tiSoKhoi = canNang / (chieuCao*chieuCao)
    
    println("Tỉ só khối cơ thể: $tiSoKhoi")
    print("Phân loại: ")
    if(tiSoKhoi < 18.5){
        println("Gầy")
    } else if(tiSoKhoi < 23){
        println("Bình thường")
    } else if(tiSoKhoi < 25){
        println("Thừa cân")
    } else {
        println("Béo phì")
    }
    
}
