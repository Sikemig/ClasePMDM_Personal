class CuentaBancaria constructor(val iban: String, val titular: String){
    private var saldo: Double = 0.0
    private var idMovimiento: Int = 0
    //Coleccion tipica de kotlin
    private val movimientos:  MutableList<Movimiento> = mutableListOf()

    init {
        if(!validarIban(iban)){
            //Excepcion arbitraria
            throw IllegalArgumentException("El IBAN no es valido")
        }
    }

    //validar formato iban
    private fun validarIban(iban: String): Boolean{
        return iban.matches(Regex("[A-Z]{2}[0-9]{22}"))
    }

    //validar titular
    private fun validarTitular(titular: String): Boolean{
        var isOk = false
        if(titular.length >= 3){
            isOk=true
        }
        return isOk
    }


    fun obtenerSaldo():Double{
        return this.saldo
    }


    fun ingresarDinero(cantidad:Double){
        if(cantidad>0.0){
            this.saldo+=cantidad
            registrarMovimiento(cantidad, "Ingreso")
        }
        else {
            println("La cantidad a ingresar debe ser positiva")
        }
    }

    fun retirarDinero(cantidad:Double){
        if(cantidad>0.0){
            if(this.saldo-cantidad >= -50) {
                this.saldo -= cantidad
                registrarMovimiento(cantidad, "Retirada")
            }
            else{
                println("La cuenta se quedaria a menos de 50€, no se puede retirar")
            }
        }
        else{
            println("La cantidad a retirar debe ser positiva")
        }
    }

    //crear movimiento
    private fun registrarMovimiento(cantidad: Double, tipo: String) {
        val mo = Movimiento(this.idMovimiento, tipo, cantidad)
        this.movimientos.add(mo)
        this.idMovimiento++
    }


    fun mostrarMovimientos(){
        if(movimientos.isEmpty()){
            println("No hay ningún movimiento")
        }
        else{
            //otra manera de hacer un foreach para recorrer el array
            this.movimientos.forEach{println(it)}
        }
    }

    fun obtenerDatosCuentaBancaria(): String{
        //return "Datos de la cuenta: IBAN -> " + this.iban + " Titular -> " + this.titular + " Saldo -> "+ this.saldo
        return "Datos de la cuenta: IBAN -> ${this.iban}  Titular -> ${this.titular}  Saldo -> ${this.saldo}"
    }


    //Complemento validador generico
    private fun validadorPatron(texto: String, patron: String): Boolean{
        return texto.matches(Regex(patron))
    }
}