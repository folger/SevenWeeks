val hobbits = Map("frodo" -> "one", "samwise" -> "two", "pippin" -> "three")

hobbits.foreach(println)
hobbits.foreach(hobbit => println(hobbit._1))
hobbits.foreach(hobbit => println(hobbit._2))

println("-"*50)

val words = List("peg", "al", "bud", "kelly")
println("count of word length > 2 = " + words.count(word => word.size > 2))
println("word length > 2 = " + words.filter(word => word.size > 2))
println("length of all words = " + words.map(word => word.size))
println("All word sizes > 1 = " + words.forall(word => word.size > 1))
println("All word sizes > 2 = " + words.forall(word => word.size > 2))
println("Any word length > 4 = " + words.exists(word => word.size > 4))
println("Any word length > 5 = " + words.exists(word => word.size > 5))
println("words sorted by first char compare no case = " +
        words.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))
println("words sorted by length = " + words.sortWith((s,t) => s.size < t.size))

println("-"*50)

val ll = List(10,20,30)
println("sum of (10,20,30) = " + (0 /: ll){(sum, i) => sum + i})
println("product of (10,20,30) = " + ll.foldLeft(1)((product, value) => product * value))

