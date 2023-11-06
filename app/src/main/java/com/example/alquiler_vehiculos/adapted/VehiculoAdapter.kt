package com.example.alquiler_vehiculos.adapted

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.R

class VehiculoAdapter (private val listaVehiculos:List<Vehiculos>): RecyclerView.Adapter<VehiculoViewHolder>() {

    // Esta función se utiliza para crear instancias de ViewHolder. Utiliza LayoutInflater para inflar la vista de diseño del elemento de vehículo.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehiculoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VehiculoViewHolder(layoutInflater.inflate(R.layout.item_vehiculo, parent, false))
    }

    // Esta función devuelve la cantidad de elementos en la lista de vehículos.
    override fun getItemCount(): Int {
        return listaVehiculos.size
    }

    // Esta función se utiliza para enlazar los datos de un elemento de la lista con la vista correspondiente en el ViewHolder.
// El método 'render' se encarga de mostrar los datos en la interfaz de usuario para el elemento en particular.
    override fun onBindViewHolder(holder: VehiculoViewHolder, position: Int) {
        val item = listaVehiculos[position]
        holder.render(item)
    }

}