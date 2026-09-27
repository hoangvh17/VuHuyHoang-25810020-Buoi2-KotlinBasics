// Vũ Huy Hoàng - 25810020
fun main() {
    val tuoi = 18
    val loaiVe = if(tuoi >= 70){
    	print("Vé cao tuổi")
    } else if(tuoi >= 20){
        print("Vé người lớn")
    } else if(tuoi > 0){
        print("Vé trẻ em")
    } else {
        print("Tuổi không hợp lệ")
    }
}

