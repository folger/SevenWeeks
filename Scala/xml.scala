val movies = 
    <movies>
        <movie genre="action">Pirates of the Caribbean</movie>
        <movie genre="fairytale">Edward Scissorhands</movie>
    </movies>

println(movies.text)

println("-"*50)

val movieNode = movies \ "movie"
println(movieNode(0))
println(movieNode(1))

println("-"*50)

println(movieNode(0) \ "@genre")
println(movieNode(1) \ "@genre")

println("-"*50)

val movies2 = <movies>
    <movie>The Incredibles</movie>
    <movie>Wall E</movie>
    <short>Jack Jack Attack</short>
    <short>Geri's Game</short>
    </movies>

(movies2 \ "_").foreach { movie =>
    movie match {
        case <movie>{movieName}</movie> => println(movieName)
        case <short>{shortName}</short> => println(shortName + " (short)")
    }
}
