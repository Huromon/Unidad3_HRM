package com.example.unidad3_hrm.tarea3

class Frescos( fecha_de_caducidad : String="indeterminada",numero_de_lote: Int=0, var fecha_de_envasado : String = "indeterminada" , var PO: String = "indeterminado"   ): Productos(fecha_de_caducidad, numero_de_lote )
{
    fun establecer_FE( fecha : String){ this.fecha_de_envasado=fecha }

    fun establecer_PO( p : String){ this.PO=p }

    fun recuperar_FE(): String = this.fecha_de_envasado

    fun recuperar_PO(): String = this.PO

    override fun toString(): String = super.toString()+", fecha de envasado: $fecha_de_envasado, Pais de origen: $PO"
}