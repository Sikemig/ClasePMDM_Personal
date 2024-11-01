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

    fun insertarAnimales(animal : Mascota){
        this.animales.add(animal) // KOTLIN supone que animal NO es null
        println("${animal.nombre} ha sido insertado en el inventario")
    }


    fun eliminarAnimales(nombre: String){
        val animal = animales.find{it.nombre == nombre}

        if (animal != null){
            this.animales.remove(animal)
            println("${animal.nombre} ha sido eliminado en el invetario")
        } else{
            println("No se ha encontrado el animal en el inventario")
        }
    }

    fun eliminarAnimales(nombre: String, tipo: String){
        val animal = animales.find{it.nombre == nombre && it::class.simpleName == tipo}

        if (animal != null){
            this.animales.remove(animal)
            println("${animal.nombre} ha sido eliminado en el invetario")
        } else{
            println("No se ha encontrado el animal en el inventario")
        }
    }

    fun vaciarInventario(){
        animales.clear()
        println("Se ha vaciado el listado de animales")
    }
}