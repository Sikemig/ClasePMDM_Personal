import java.util.*

class Coche constructor(matricula: String, marca: String, acabado: String){

    val matricula: String
    val marca: String
    var acabado: String
    var bastidor: String

    init{
        this.matricula = matricula
        this.marca = marca
        this.acabado = acabado
        this.bastidor = UUID.randomUUID().toString() // esto genera un numero de bastidor aleatorio si no le metemos bastidor por constructor
    }

    constructor(matricula: String, marca: String, acabado: String, bastidor:String)
        :this(matricula,marca,acabado) {
            this.bastidor = bastidor
        }
}
