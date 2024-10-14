fun main() {
    println("Bienvenido a DamBank")

    println("Introduzca el IBAN de la cuenta (formato: 2 letras y 22 digitos")
    val iban = readLine().orEmpty()

    println("Introduzca el titular")
    val titular = readLine().orEmpty()

    try {
        val cuentaBancaria = CuentaBancaria(iban, titular)
        println("Cuenta creada con exito")

        var opcion: Int

        do{
            println("""
                Elige una opcion:
                1. Ver datos de la cuenta
                2. Ver saldo
                3. Realizar Ingreso
                4. Realizar Retirada
                5. Ver movimientos
                6. Salir
                """.trimIndent())

            opcion = readLine()?.toIntOrNull() ?: 0

            when(opcion){
                1 -> println(cuentaBancaria.obtenerDatosCuentaBancaria())
                2 -> println(cuentaBancaria.obtenerSaldo())
                3 -> {
                    println("Introduzca la cantidad a ingresar")
                    val cantidad = readLine()?.toDoubleOrNull() ?: 0.0
                    cuentaBancaria.ingresarDinero(cantidad)
                }
                4 -> {
                    println("Introduzca la cantidad a retirar")
                    val cantidad = readLine()?.toDoubleOrNull() ?: 0.0
                    cuentaBancaria.retirarDinero(cantidad)
                }
                5 -> cuentaBancaria.mostrarMovimientos()
                6 -> println("Gracias por usar DamBank")
                else -> println("Opcion no valida")
            }

        }while(opcion!=6)

    }catch (e: IllegalArgumentException){
        println(e.message)
    }
}