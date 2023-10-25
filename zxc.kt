import kotlin.math.pow
fun d(): Int {
    var maxValue = 0
    for (i in 1..1000) {
        val got = mutableListOf<Int>()
        var start = 1
        while (true) {
            val new = start * (10.0.pow(i.toString().length.toDouble()).toInt()) % i
            if (new !in got) {
                got.add(new)
                start = new
            } else {
                if (got.size > maxValue) {
                    maxValue = i
                }
                break
            }
        }
    }
    return maxValue
}

fun main() {
    println(d())
}
