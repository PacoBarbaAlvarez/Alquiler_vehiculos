package com.example.alquiler_vehiculos

class VehiculosProvider {

    companion object {
        val ListaVehiculos = listOf<Vehiculos>(
            Vehiculos(
                tipo = "Carrozado con trampilla",
                plazas = "3 plazas",
                capacidad = "20 m3",
                foto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfbWg1YhZQYciSOK_5pF3f0FC9eOdnURIuOGwRZ0dKPg&s"
            ),
            Vehiculos(
                tipo = "Carrozado sin trampilla",
                plazas = "3 plazas",
                capacidad = "20 m3",
                foto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRL3TQr-aqKgyGdghLQVyrkmznOsBb1ZCXhudI0bYJjvg&s"
            ),
            Vehiculos(
                tipo = "Furgoneta Grande",
                plazas = "3 plazas",
                capacidad = "15 m3",
                foto = "data:image/jpeg;base64,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"
            ),
            Vehiculos(
                tipo = "Furgoneta mediana",
                plazas = "3 plazas",
                capacidad = "8 m3",
                foto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWt-ITcOeQiZQDlDB1gqhOR1lTxKhGTxL35Iba_QYJBA&s"
            ),
            Vehiculos(
                tipo = "Furgoneta pequeña",
                plazas = "2 plazas",
                capacidad = "4 m3",
                foto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqaCSgqoozQdh7UVhQt58alGnvTCnnG9op4AeysIfxVQ&s"
            ),
        )
    }
}