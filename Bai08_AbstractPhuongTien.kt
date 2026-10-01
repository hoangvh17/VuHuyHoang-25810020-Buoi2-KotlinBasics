// Vũ Huy Hoàng - 25810020
fun main() {
    abstract class PhuongTienDiChuyen(){
        abstract val tocDoToiDa: Int
        fun moTa(){
			println("Tốc độ tối đa cho phép: $tocDoToiDa")
        }
	}
	
    class XeMay(): PhuongTienDiChuyen(){
    	override val tocDoToiDa = 50   
    }
    class OTo(): PhuongTienDiChuyen(){
    	override val tocDoToiDa = 80
    }
    
    val xe1 = XeMay()
    xe1.moTa()
     val xe2 = OTo()
    xe2.moTa()
    
}
