val a = List(1, 2, 3)
val b = List("one", "two", "three")
val c = List("one", "two", 3)

println("a(0) = " + a(0))
println("b(0) = " + b(1))
println("a(2) = " + c(2))

println("-"*50)


val animals = Set("lions", "tigers", "bears")
val animals2 = animals + "armadillos"
val animalsNoTiger = animals - "tigers"
val animalsMore = animals ++ Set("armadillos", "raccoons")
val animalsNoBear = animals -- Set("bears")
val animalsOnlyCats = animals & Set("lions", "tigers")

println("animals" + animals)
println("animals2" + animals2)
println("animalsNoTiger" + animalsNoTiger)
println("animalsMore" + animalsMore)
println("animalsNoBear" + animalsNoBear)
println("animalsOnlyCats" + animalsOnlyCats)

println("-"*50)

val ordinals = Map(0 -> "zero", 1 -> "one", 2 -> "two")
println(ordinals)
println("ordinals(2) = " + ordinals(2))

import scala.collection.mutable.HashMap
val map = new HashMap[Int, String]

map += 4 -> "four"
map += 8 -> "eight"

println(map)
println("map(1) = " + map(8))

