// Vũ Huy Hoàng - 25810020
fun main() {
    val fiboList = mutableListOf(0, 1)

    for(i in 2..20){        
        val nextFibo = fiboList[i - 1] + fiboList[i - 2]
        if(nextFibo >= 100){
            break
        }
        fiboList.add(nextFibo)
        println("Location: $i, value: ${fiboList[i]}")
    }
}
