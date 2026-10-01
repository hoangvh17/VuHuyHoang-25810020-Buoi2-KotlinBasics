// Vũ Huy Hoàng - 25810020
fun main() {
	open class DongVat(val ten: String){
        open fun keu():String{
            return "tieng keu"
        }
    }
    class Cho(ten: String): DongVat(ten){
        override fun keu():String{
            return "gau gau"
        }
    }
    class Meo(ten: String): DongVat(ten){
        override fun keu():String{
            return "meo meo"
        }
    }
    val dongVat1= listOf(Cho("shiba"), Cho("chihuahua"), Meo("Meo Muop"))
    
    for (i in dongVat1){
        print(i.ten + ": ")
        println(i.keu())
    }
}
