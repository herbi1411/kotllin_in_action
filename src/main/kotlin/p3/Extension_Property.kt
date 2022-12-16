package p3

var StringBuilder.lastChar: Char
    get () = get(length - 1)
    set (value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val sb = StringBuilder("Kotlin?")
    println(sb)

    sb.lastChar = '!'
    println(sb)
}