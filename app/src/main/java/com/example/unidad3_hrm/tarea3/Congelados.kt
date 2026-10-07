package com.example.unidad3_hrm.tarea3

class Congelados (fecha_de_caducidad:String="indeterminada" , numero_de_lote:Int=0 , var tcr : Double = 0.0  ):  Productos(fecha_de_caducidad, numero_de_lote )
{
    fun establecer_TCR( t : Double){ this.tcr=t }

    fun recuperar_TCR(): Double = this.tcr

    override fun toString(): String=super.toString()+", Temperatura de congelacion recomendada: $tcr ºC "
}