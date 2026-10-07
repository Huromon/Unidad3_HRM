package com.example.unidad3_hrm.tarea3

open class Productos(var fecha_de_caducidad: String="indeterminada" , var numero_de_lote:Int=0){


    open fun establecer_FC(fecha : String){this.fecha_de_caducidad=fecha}

    open fun establecer_NL(lote : Int){this.numero_de_lote =lote}

    open fun recuperar_FC(): String = this.fecha_de_caducidad

    open fun recuperar_NL():Int = this.numero_de_lote

    open fun mostrar(){println(this.toString())}

    override fun toString(): String ="Preoducto-> $numero_de_lote, fecha de caducidad: $fecha_de_caducidad"







}