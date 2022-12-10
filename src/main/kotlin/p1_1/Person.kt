package p1_1

data class Person (val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("영희"), Person("철수", age=29)) // 영희의 나이는 0으로 저장된다. listOf는 read-only 리스트를 생성해준다.
    val oldset = persons.maxBy { it.age?:0 } // maxBy 함수에 람다 식으로 파라미터 하나를 받는다. it이라는 이름을 사용하면 람다 식의 유일한 인자를 사용할 수 있다.
    // 엘비스 연산자( Elvis Operator)라고 부르는 ?:는 age가 null일 경우 0을 반환하고, 그렇지 않은 경우 age의 값을 반환한다.
    println("나이가 가장 많은 사람: $oldset")
}