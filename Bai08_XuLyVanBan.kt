// Vũ Huy Hoàng  25810020
fun main() {
    println(xuLyVanBan("hi", {text -> text.uppercase()}))
    
    println(xuLyVanBan("hi2", ::vietHoa))
    
	println(xuLyVanBan("hi3") {text -> text.uppercase()})
}

fun xuLyVanBan(vanBan: String, hamXuLy: (String) -> String): String{
    return hamXuLy(vanBan)
}

fun vietHoa(text: String): String{
    return text.uppercase()
}
