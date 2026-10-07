package com.example.unidad3_hrm.tarea2

class Cuenta( var saldo : Double=0.0 , var propietario : Persona?=null){
 val numeroCuenta = num
    companion object Cuent{
       var num =1
    }
    init{
        num++
    }
    override fun toString(): String {
        if (propietario==null)
        return "num de cuenta: $numeroCuenta Saldo: $saldo  Propietario: ninguno"
        else{
            return "num de cuenta: $numeroCuenta Saldo: $saldo  Propietario: $propietario"
        }
    }
    fun transaccion(contidad:Double , tipo:String){
        println("transaccion de "+ propietario?.nombre)
        fun ingreso(ingr:Double){
            if (ingr <= 0) println("no se permiten ingresos negativos")
            else{
                this.saldo += ingr
                println("ingreso de $ingr")
                println("saldo actual de $saldo")
            }
        }
        fun reintegro(reint: Double){
            if (saldo - reint < 0 && reint <= 0 ) println("no se permiten reintegros negativos")
            else{
                this.saldo -= reint
                println("reintegro de $reint")
                println("saldo actual de $saldo")
            }
        }
        when(tipo.lowercase()){
            "reintegro" -> reintegro(contidad)
            "ingreso" -> ingreso(contidad)
            else -> println("operacion invalida")
        }




    }

}
