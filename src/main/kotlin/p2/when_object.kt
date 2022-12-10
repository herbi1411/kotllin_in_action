package p2
import p2.Color.*
import java.lang.Exception

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception ("Dirty Color")
    }


fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}