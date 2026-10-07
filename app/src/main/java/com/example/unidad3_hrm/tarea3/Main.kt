package com.example.unidad3_hrm.tarea3

fun main(){

    var pd = Productos("11/3/2030",1)
    var pf = Frescos("7/9/2028",2,"12/8/2026","Francia")
    var pr = Refrigerados("20/8/2027",3,2234)
    var pc = Congelados("16/5/2031",4,-19.6)

    pd.mostrar()
    pf.mostrar()
    pr.mostrar()
    pc.mostrar()

    println(pd.recuperar_FC())






}