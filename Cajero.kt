package com.example.cajero

fun main()
{
    var saldo = 12956.87

    do {
    println("Bienvenido, para checar su saldo por favor digite su nip")
    var nip = readLine()!!.toInt()

        if (nip == 2383) {
            println("Su saldo de cuenta es: " + saldo)
            do {
                println("1. Retiar")
                println("2.Deposotar")
                println("3. Salir")
                print("¿Que desea realizar hoy? ")
                var menu = readLine()!!.toInt()
                when (menu) {
                    1 -> {
                        println("Ingrese la cantidad a retirar")
                        var reti = readLine()!!.toDouble()
                        if (reti > saldo) {
                            println("No cuenta con el saldo sufuiciente para hacer el retiro")
                        } else {
                            saldo = (saldo - reti)
                            println("Su saldo actual es de: " + saldo)
                        }
                    }

                    2 -> {
                        println("Ingrese la cantidad a depositar")
                        var depo = readLine()!!.toDouble()
                        saldo = (saldo + depo)
                        println("Su saldo actual es de: " + saldo)
                    }
                }
            } while (menu < 3)


        } else {
            println("El nip es incorrecto, favor de ingresar un nip valido")
        }
    }while(nip != 2383)
}