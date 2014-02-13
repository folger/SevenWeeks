def factorial(n: Int): Int = n match {
    case 0 => 1
    case _ => factorial(n-1) * n
}


println(factorial(0))
println(factorial(6))
println(factorial(10))


