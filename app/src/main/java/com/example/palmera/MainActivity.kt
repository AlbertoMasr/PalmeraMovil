package com.example.palmera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar
import com.example.palmera.API.API
import com.example.palmera.adapter.DatilAdapter
import com.example.palmera.model.Datil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<ArrayList<Datil>>
{

    var mAdapter: DatilAdapter? = null

    private var mReciclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mReciclerView = findViewById(R.id.rvProductos)
        val llm       = LinearLayoutManager(this)

        mReciclerView!!.layoutManager = llm


        mAdapter = DatilAdapter()
        mReciclerView!!.adapter = mAdapter

        val llamada: Call<ArrayList<Datil>> = API.apiService().getDatiles()
        llamada.enqueue(this)

    }

    override fun onResponse(call: Call<ArrayList<Datil>>, response: Response<ArrayList<Datil>>)
    {

        if( response.isSuccessful )
        {

            val datiles: ArrayList<Datil> = response.body()!!
            mAdapter!!.asignarDatiles(datiles)

        }

    }

    override fun onFailure(call: Call<ArrayList<Datil>>, t: Throwable) {  }

}