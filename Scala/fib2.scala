def fibNextPair(x: Int, y: Int): (Int, Int) = (y, x + y)

def fibNthPair(n: Int): (Int, Int) = n match {
    case 1 => (1, 1)
    case _ => {
        val p = fibNthPair(n-1)
        fibNextPair(p._1, p._2)
    }
}

println(fibNthPair(1)._1)
println(fibNthPair(6)._1)
println(fibNthPair(10)._1)


