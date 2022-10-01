// You can experiment here, it won’t be checked
import java.util.LinkedList
fun main() {

    val planets =  LinkedList<String>()
    planets.addAll(listOf("Earth", "Venus", "Mars"))

        planets.addLast("Pluto")
        planets.addFirst("alpha")
        planets.addLast("centauri")

        println("planets = " + planets.first)
        println(planets.last)
        println(planets.size)
        println(planets.indexOf("alpha"))
    }
