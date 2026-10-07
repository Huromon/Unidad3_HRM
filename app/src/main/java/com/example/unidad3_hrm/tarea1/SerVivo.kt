package com.example.unidad3_hrm.tarea1

open class SerVivo(var edad : Byte = 0){


  open  fun  equals(otro: SerVivo):Boolean{
        if (this.edad == otro.edad) return true
        else return false
    }
   open fun mayor(otro: SerVivo): SerVivo{
        if (otro.edad >= this.edad) return otro
        else return this
    }

    override fun toString(): String {
        return " Edad: $edad "
    }
}