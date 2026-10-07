package com.example.unidad3_hrm.tarea2

import androidx.core.text.isDigitsOnly


class Persona(var nombre: String , var apellido: String , var telefono: String){
    init{
        var v = telefono.toCharArray()
        if(v.any {!it.isDigit() }){
            var correct: Boolean
            correct = false
            while (!correct){
                println("el telefono de $nombre deben ser digitos")
                telefono = readLine()?:""
                v = telefono.toCharArray()
                if(v.all {it.isDigit()}) correct = true
            }
        }
        if(telefono.length != 9){
            var correct: Boolean
            correct = false
            while (!correct){
                println("el telefono de $nombre tienen que ser 9 numeros")
                telefono = readLine()?:""
                if(telefono.length == 9) correct = true
            }
        }

    }



    override fun toString(): String {
        return "$nombre  $apellido telf: $telefono"
    }

}

