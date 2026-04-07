fun operation(num1: Int, num2: Int, func: (Int, Int) -> Int) = func(num1, num2)

fun main() {

    val operations = mapOf(
        "+" to { a: Int, b: Int -> a + b },
        "-" to { a: Int, b: Int -> a - b },
        "*" to { a: Int, b: Int -> a * b },
        "/" to { a: Int, b: Int -> a / b }
    )

    val num1 = 10
    val num2 = 5

    operations.forEach {
        (symbol, func) -> 
            var result = operation(num1, num2, func)
            println("$num1 $symbol $num2 = $result")
    }
}