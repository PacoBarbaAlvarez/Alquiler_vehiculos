package com.example.alquiler_vehiculos.adapted

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding

class VehiculoViewHolder (view: View): RecyclerView.ViewHolder (view) {
    val binding = ItemVehiculoBinding.bind(view)

    fun render(VehiculoModel: Vehiculos) {
        binding.TipoVehiculo.text = VehiculoModel.tipo
        binding.Plazas.text = VehiculoModel.plazas
        binding.Capacidad.text = VehiculoModel.capacidad

        Glide.with(binding.ImagenVehiculo.context).load(VehiculoModel.foto).into(binding.ImagenVehiculo)

    }
}