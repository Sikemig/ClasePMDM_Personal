class Inventario {

    private val animales: MutableList<Mascota> = mutableListOf()

    fun mostrarAnimales(){
        if(animales.isEmpty()){
            println("No hay animales")
        } else{
            animales.forEach{ animale ->
                println("${animale::class.simpleName} - Nombre: ${animale.nombre}")
            }
        }
    }

    fun mostrarDatosAnimal(nombre: String){
        val animal = animales.find { it.nombre == nombre }

        if(animal != null){
            animal.muestra()
        } else{
            println("No hay animales con ese nombre")
        }
    }

    fun mostrarAnimalesCompletos(){
        if(animales.isEmpty()){
            println("No hay animales")
        } else{
            animales.forEach{ animale ->
                animale.muestra()
            }
        }
    }
}