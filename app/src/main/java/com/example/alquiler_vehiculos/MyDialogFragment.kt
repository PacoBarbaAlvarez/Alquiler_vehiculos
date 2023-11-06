package com.example.alquiler_vehiculos

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class MyDialogFragment: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Título del diálogo"
            val content = "¿Desea guardar los datos?"
            val builder: AlertDialog.Builder= AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(android.R.string.ok)  {dialog, which ->
                    //Callback para el ok
                    Toast.makeText(requireActivity().applicationContext, "Se han guardado los datos",
                        Toast.LENGTH_LONG).show()
                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->
                    //Callback para el Cancel
                    Toast.makeText(requireActivity().applicationContext, "Se ha cancelado la accion",
                        Toast.LENGTH_LONG).show()
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder
            return builder.create()} ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
    }
}