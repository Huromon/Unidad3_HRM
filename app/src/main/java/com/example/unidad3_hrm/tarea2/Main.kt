package com.example.unidad3_hrm.tarea2

fun main(){

val x = Persona("Maria","Jose", "A11F33")
  val y = Persona("Jose","Maria", "992365732")
  println(x)
  println(y)
  var num1 = Cuenta(500.0,y)
  var num2 = Cuenta(200.0)
  var num3 = Cuenta()
  var num4 = Cuenta()
  num3.propietario=x
  println(num1)
  println(num2)
  println(num3)
  println(num4)

  num1.transaccion(300.0,"reintegro")
  num3.transaccion(800.0,"ingreso")
  num1.transaccion(-500.0 ,"ingreso")
  num3.transaccion(400.0,"Estafa")
}