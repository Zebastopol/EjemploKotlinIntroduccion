package com.example.ejemplokotlinintroduccion.poo

open class Persona (var rut:String, var nombre:String, var edad:Int){


    constructor():this("","",0)

    constructor(r:String):this(r,"",0)
}