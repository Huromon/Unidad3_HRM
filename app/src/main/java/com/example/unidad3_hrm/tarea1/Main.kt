package com.example.unidad3_hrm.tarea1

fun main(){

var x = SerVivo(3)

var y = SerVivo(4)

    println("¿son iguales?" + x.equals(y))
    println("¿quien es el nayor?" + x.mayor(y))
    x =  Humano("Homero", 34)
    y = Humano("Bart", 9)
    println("¿son iguales?"+ x.equals(y))
    println("¿quien es el nayor?" + x.mayor(y))

}