// Vũ Huy Hoàng - 25810020
import kotlin.math.sqrt
fun main() {
    fun String.demSoNguyenAm(): Int{
        var dem: Int=0
        for (kyTu in this) {
            if(kyTu.lowercase() in "ueoai"){
        		dem++
        	}
        }
        return dem
    }
    
    fun Int.demSoNguyenTo(): Boolean{
        if(this <= 1){
            return false
        }
        
        val gioiHan = sqrt(this.toDouble()).toInt()
        for (i in 2..gioiHan) {
    		if (this % i == 0) {
        		return false
    		}
		}
        
		return true
    }
    
    println("hEllOoo".demSoNguyenAm())
    println("Bounjour".demSoNguyenAm())
    println("UeoaI".demSoNguyenAm())
    println(4.demSoNguyenTo())
    println(13.demSoNguyenTo())
    println(171.demSoNguyenTo())
}
