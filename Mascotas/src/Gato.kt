import java.util.Date

class Gato(nombre: String, edad: Int, estado: String, fechaNacimiento: Date,
            val color: String, val peloLargo: Boolean): Mascota(nombre, edad, estado, fechaNacimiento) {

    override fun muestra() {
        val mensaje: String = "Esta mascota es un gato de nombre $nombre, con $edad años y nacido el $fechaNacimiento " +
                "de color $color y pelo largo: $peloLargo"
        println(mensaje)
    }

    override fun habla() {
        println("Soy un perro y digo guau guau")
    }
}