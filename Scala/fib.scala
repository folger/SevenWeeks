def fibTuple(x: Int, y: Int, index: Int): (Int, Int, Int) = (x, y, index) match {
    case (x, y, 0) => (x, y, 0)
    case (x, y, index) if index > 0 => fibTuple(y, x + y, index - 1)
}

def fib(index: Int): Int = fibTuple(0, 1, index)._1

println(fib(1))
println(fib(6))
println(fib(10))



