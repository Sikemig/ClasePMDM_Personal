import java.util.*

abstract class Mascota (val nombre: String, var edad: Int, var estado: String,
                        val fechaNacimiento: Date){

    abstract fun muestra()

    fun cumpleMascota(){
         println("El cumpleaños de $nombre es el ${fechaNacimiento.toString()}")
    }

    fun morir(){
         println("Lamentablemente tengo que abandonar este mundo")
    }

    abstract fun habla()
}