package part3concurrency.demoC

val fibonacci = sequence<Int> {
    var cur = 1
    var next = 1
    while (true) {
        yield(cur)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}

fun main() {
    println(fibonacci.take(10).toList())
}