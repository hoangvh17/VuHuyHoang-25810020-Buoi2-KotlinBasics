fun main() {
    val dtb: Double = 8.5
    
    when(dtb){
     	in 0.0..<5.0 -> print("Điểm $dtb. Xếp loại yếu")
        in 5.0..<6.5 -> print("Điểm $dtb. Xếp loại trung bình")
        in 6.5..<8.0 -> print("Điểm $dtb. Xếp loại Khá")
        in 8.0..<8.5 -> print("Điểm $dtb. Xếp loại Giỏi")
        in 8.5..10.0 -> print("Điểm $dtb. Xếp loại Xuất Sắc")
        else -> print("Điểm không hợp lệ!!!!!!")
    }
}
