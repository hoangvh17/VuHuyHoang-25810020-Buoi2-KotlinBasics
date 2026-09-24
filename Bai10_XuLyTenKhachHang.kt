// Vũ Huy Hoàng - 25810020
fun handleName(name: String?){
    val safeLength = name?.length
    println("Do dai chuoi safe call: $safeLength")
    
    val displayName = name?: "Khach vang lai"
    println("Ten hien thi elvis: $displayName")
    
    val forceLength = name!!.length
    println("Do dai chuoi toan tu: $forceLength")
    // !! ep kieu khong the la null
    // toan tu !! khang dinh bien khong null. neu bien null chuong trinh se bi loi
}

fun main() {
    handleName("Hoang")
}
