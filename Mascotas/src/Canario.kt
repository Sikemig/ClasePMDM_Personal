import java.util.*

class Canario (nombre: String, edad: Int, estado: String, fechaNacimiento: Date,
               pico:String, vuela:Boolean, val color:String, val canta: Boolean)
                : Ave(nombre, edad, estado, fechaNacimiento, pico, vuela){


    override fun volar() {
        if(this.vuela){
            println("El canario ${this.nombre} vuela muy bien")
        } else {
            println("El canario ${this.nombre} no sabe volar")
        }
    }

    override fun muestra() {
        val mensaje: String = "Esta mascota es un canario de nombre $nombre, con $edad años y nacido el $fechaNacimiento " +
                "de color $color y canta: $canta"
        println(mensaje)
    }

    override fun habla() {
        println("Soy el canario $nombre y digo pio pio")
    }
}