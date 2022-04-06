package com.example.ejemplokotlinintroduccion.poo

fun main(){


    var p1 = Persona("1111-3", "jana", 30)

    println("Los datos de la persona son: rut:${p1.rut} "+
            "nombre: ${p1.nombre} edad ${p1.edad}")
}