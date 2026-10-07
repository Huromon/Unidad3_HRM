package com.example.unidad3_hrm.tarea3

class Refrigerados (fecha_de_caducidad:String="indeterminada" , numero_de_lote:Int=0 , var cosa : Int =0 ):  Productos(fecha_de_caducidad, numero_de_lote )
{
    fun establecer_COSA(  cos : Int){ this.cosa =cos }

    fun recuperar_COSA():Int = this.cosa

    override fun toString(): String = super.toString()+", codigo del organismo de supervision alimentaria: $cosa"
}