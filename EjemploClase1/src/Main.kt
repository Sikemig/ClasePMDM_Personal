fun main() {

    var miCoche = Coche("1010ABC ", "Honda", "SportLine")

    miCoche.acabado = "NoSport"


    val pp = Persona("Pedro" , 20)

    pp.peso = 101.0

    println("¿Sobrepeso?: ${if (pp.sobrePeso) "SI" else "NO"}")
    println(pp.sobrePeso)
}