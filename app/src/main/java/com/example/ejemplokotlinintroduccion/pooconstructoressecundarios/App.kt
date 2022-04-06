package com.example.ejemplokotlinintroduccion.pooconstructoressecundarios

import com.example.ejemplokotlinintroduccion.poo.Alumno

fun main(){

    var a1 = Alumno("Mate", "111-1")
    a1.actuar()

    var textoMnesaje = mensaje.TOAST.m
    println(textoMnesaje)
}

enum class mensaje(val m:String){
    MENSAJE("ESTSE ES UN MENSAJE SIMPLE"),
    TOAST("EESTE ES UUN  MEENSAJE TOAST"),
    DIALOGO("ESTE ES UN DIALOGO")
}