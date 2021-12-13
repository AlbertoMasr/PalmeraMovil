package com.example.palmera.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.palmera.R
import com.example.palmera.model.Datil

class DatilAdapter: RecyclerView.Adapter<DatilAdapter.ViewHolder>()
{

    var datiles: ArrayList<Datil>? = null

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {

        //var civDatiles: CircleImageView? = null
        var nombreYCategoria: TextView?    = null
        var precio: TextView?              = null
        var descripcion: TextView?         = null
        var stock: TextView?               = null

        init
        {

            nombreYCategoria = view.findViewById(R.id.nombreYCategoria)
            precio           = view.findViewById(R.id.precio)
            descripcion      = view.findViewById(R.id.descripcion)
            stock            = view.findViewById(R.id.stock)

        }

    }

    init
    {

        datiles =  ArrayList();

    }

    fun asignarDatiles(datiles: ArrayList<Datil>)
    {

        this.datiles = datiles
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview_productos, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {

        holder.nombreYCategoria!!.text = "${datiles!!.get(position).obtenerVarNombre()} - ${datiles!!.get(position).obtenerCatNombre()}"
        holder.precio!!.text           = "Precio: $"+ datiles!!.get(position).obtenerPrecio() +" kg"
        holder.descripcion!!.text      = datiles!!.get(position).obtenerVarDescripcion()
        holder.stock!!.text            = "Stock: ${datiles!!.get(position).obtenerStock()} kg"

    }

    override fun getItemCount(): Int
    {

        Log.d("Datiles xd", datiles.toString())

        return datiles!!.size

    }

}