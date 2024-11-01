import java.util.*

fun main() {

    val inventario = Inventario()

    inventario.insertarAnimales(Perro("Agallas", 9, "saludable", Date(), "Alaska malamute", false))
    inventario.insertarAnimales(Gato("Mona", 3, "Juerguista", Date(), "Gris", true))
    inventario.insertarAnimales(Loro("Pepe", 2, "saludable", Date(), "Naranja y largo", true,
        "Hispano", true))
    inventario.insertarAnimales(Canario("Paco", 6, "Aventurero", Date(),"pequeño", true,
        "amarillo", true))

    println("Mostrar todos los animales solo tipo y nombre")
    inventario.mostrarAnimales()

    println("Mostrar toda la información de todos los animales")
    inventario.mostrarAnimalesCompletos()

    println("Mostrar la información de 1 animal")
    inventario.mostrarDatosAnimal("Mona")
    inventario.mostrarDatosAnimal("sdrgidfjgidf")

    println("Eliminar un animal con nombre Pepe")
    inventario.eliminarAnimales("Pepe")
    inventario.mostrarAnimalesCompletos()

    println("Dar en adopcion todos los animales")
    inventario.vaciarInventario()
    inventario.mostrarAnimalesCompletos()
}