import java.util.*

class Perro(nombre: String, edad: Int, estado: String, fechaNacimiento: Date,
            val raza: String, var pulgas: Boolean) : Mascota(nombre, edad, estado, fechaNacimiento) {


    override fun muestra() {
        val mensaje: String = "Esta mascota es un perro de nombre $nombre, con $edad años y nacido el $fechaNacimiento" +
                " de raza $raza"
        println(mensaje)
    }


    override fun habla() {
        println("Soy un perro y digo guau guau")
    }


}