package com.example.unidad3_hrm.tarea3

open class Productos(var fecha_de_caducidad: String="indeterminada" , var numero_de_lote:Int=0){


    open fun establecer_FC( fecha : String){
        fecha_de_caducidad=fecha
    }
    open fun establecer_NL( lote : Int){
        numero_de_lote=lote
    }
    open fun recuperar_FC(): String{
        return this.fecha_de_caducidad
    }


    open fun recuperar_NL():Int{
      return this.numero_de_lote
    }


    open fun mostrar(){
        println( this.toString())
    }

    override fun toString(): String {
        return "Preoducto-> $numero_de_lote, fecha de caducidad: $fecha_de_caducidad"
    }






}