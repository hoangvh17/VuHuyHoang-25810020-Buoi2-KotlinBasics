// Vũ Huy Hoàng - 25810020
fun main() {
    val studentArr = arrayOf(8.0, 7.0, 8.4, 9.0, 7.9, 6.0, 10.0, 5.5, 8.1, 7.0)
    var sum:Double = 0.0
    var maxScore = studentArr[0]
    var minScore = studentArr[0]
    
    for(i in studentArr) {
        if(i > maxScore){
            maxScore = i
        }
        if(i < minScore){
            minScore = i
        }
        sum += i
    }
    
    val avgScore = sum / studentArr.size
    println("Average Score: $avgScore")
    println("Max score: $maxScore")
    println("Min score: $minScore")
}
