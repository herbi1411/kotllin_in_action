package p2

fun fizBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}
fun main(args: Array<String>) {

    for (i in 1..100) {
        println(fizBuzz(i))
    }

    for (i in 100 downTo 1 step 2) {
        println(fizBuzz(i))
    }
}