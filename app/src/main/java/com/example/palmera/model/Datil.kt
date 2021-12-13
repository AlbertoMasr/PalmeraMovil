package com.example.palmera.model

class Datil
{

    var VarNombre: String      = ""
    var CatNombre: String   = ""
    var Precio: Double      = 0.0
    var VarDescripcion: String = ""
    var Stock: Int          = 0

    constructor(VarNombre: String, CatNombre: String, Precio: Double, VarDescripcion: String, Stock: Int)
    {

        this.VarNombre      = VarNombre
        this.CatNombre   = CatNombre
        this.Precio      = Precio
        this.VarDescripcion = VarDescripcion
        this.Stock       = Stock

    }

    fun asignarVarNombre(VarNombre: String)
    {

        this.VarNombre = VarNombre

    }

    fun obtenerVarNombre(): String
    {

        return VarNombre

    }

    fun asignarCatNombre(CatNombre: String)
    {

        this.CatNombre = CatNombre

    }

    fun obtenerCatNombre(): String
    {

        return CatNombre

    }

    fun asignarPrecio(Precio: Double)
    {

        this.Precio = Precio

    }

    fun obtenerPrecio(): Double
    {

        return Precio

    }

    fun asignarVarDescripcion(VarDescripcion: String)
    {

        this.VarDescripcion = VarDescripcion

    }

    fun obtenerVarDescripcion(): String
    {

        return VarDescripcion

    }

    fun asignarStock(Stock: Int)
    {

        this.Stock = Stock

    }

    fun obtenerStock(): Int
    {

        return Stock

    }

}