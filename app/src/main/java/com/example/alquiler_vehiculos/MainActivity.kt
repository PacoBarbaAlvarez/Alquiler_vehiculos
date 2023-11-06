package com.example.alquiler_vehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiculos.adapted.VehiculoAdapter
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var recyclerView: RecyclerView
        lateinit var showRecyclerViewButton: Button
        var isRecyclerViewVisible = false

        super.onCreate(savedInstanceState) // Llamada al método onCreate de la superclase
        setContentView(R.layout.activity_main) // Establece el diseño de la actividad

        val miDialogo = MyDialogFragment() // Creación de una instancia de MyDialogFragment

        // Creación de una instancia de DividerItemDecoration para la separación en el RecyclerView
        val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)

        // Infla la vista utilizando ActivityMainBinding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Establece la vista inflada como el contenido de la actividad

        // Configura el LinearLayoutManager para el RecyclerView en el binding
        binding.Recicler.layoutManager = LinearLayoutManager(this)

        // Configura el adaptador del RecyclerView con VehiculoAdapter y la lista ListaVehiculos de VehiculosProvider
        binding.Recicler.adapter = VehiculoAdapter(VehiculosProvider.ListaVehiculos)

        // Encuentra el botón con el id BotonGuardar
        val buttonGuardar = findViewById<Button>(R.id.BotonGuardar)

        // Establece un click listener para el botón
        buttonGuardar.setOnClickListener {
            // Muestra el diálogo utilizando el FragmentManager y un tag "MiDialogo"
            miDialogo.show(supportFragmentManager, "MiDialogo")
        }


        recyclerView = findViewById(R.id.Recicler) // Enlaza el RecyclerView desde el diseño
        recyclerView.visibility = GONE // Establece la visibilidad del RecyclerView en GONE (oculto) inicialmente
        showRecyclerViewButton = findViewById(R.id.botonMostrar) // Enlaza el botón desde el diseño

        val layoutManager = LinearLayoutManager(this) // Configura el LinearLayoutManager para el RecyclerView
        recyclerView.layoutManager = layoutManager // Asigna el LinearLayoutManager al RecyclerView

        showRecyclerViewButton.setOnClickListener {
            if (isRecyclerViewVisible) { // Verifica si el RecyclerView ya está visible
                recyclerView.visibility = GONE // Oculta el RecyclerView si ya está visible
                isRecyclerViewVisible = false // Actualiza el indicador de visibilidad del RecyclerView
            } else {
                recyclerView.visibility = View.VISIBLE // Muestra el RecyclerView si no está visible
                isRecyclerViewVisible = true // Actualiza el indicador de visibilidad del RecyclerView
            }
        }
    }
}