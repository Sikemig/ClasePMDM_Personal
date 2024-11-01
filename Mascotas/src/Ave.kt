import java.util.*

abstract class Ave(nombre: String, edad: Int, estado: String, fechaNacimiento: Date,
                    val pico: String, var vuela: Boolean): Mascota(nombre, edad, estado, fechaNacimiento) {

         abstract fun volar()


}