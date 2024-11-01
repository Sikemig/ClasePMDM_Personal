import java.util.*

class Loro(nombre: String, edad: Int, estado: String, fechaNacimiento: Date,
            pico:String, vuela:Boolean, val origen:String, val habla: Boolean)
            : Ave(nombre, edad, estado, fechaNacimiento, pico, vuela) {

    override fun volar() {
        if(this.vuela){
            println("El loro ${this.nombre} vuela muy bien")
        } else {
            println("El loro ${this.nombre} no sabe volar")
        }
    }

    override fun muestra() {
        val mensaje: String = "Esta mascota es un perro de nombre $nombre, con $edad años y nacido el $fechaNacimiento " +
                "de origen $origen y hablar: $habla"
        println(mensaje)
    }

    override fun habla() {
        println("Soy el loro $nombre y repito lo que dices")
    }
}