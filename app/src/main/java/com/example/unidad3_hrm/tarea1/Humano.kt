package com.example.unidad3_hrm.tarea1

class Humano(var nombre:String, edad :Byte = 0  ): SerVivo(edad){

    fun equals(otro: Humano): Boolean {
      if(this.edad==otro.edad && this.nombre==otro.nombre) return true
        else return false
    }
  fun mayor(otro: Humano): Humano{
        if (otro.edad > this.edad) {
            return otro
        }
        else if(otro.edad==this.edad) {
            if (otro.nombre.length>=this.nombre.length)return otro
            else return this
        }
        else return this
    }

    override fun toString(): String {
        return "Nombre: $nombre Edad: $edad"
    }





}