package com.example.nguru_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.firebase.firestore.FirebaseFirestore

class PresidentesActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presidentes)

        setup()

    }

    private fun setup(){

        var nombre3 = findViewById<TextView>(R.id.nombreText)
        val bundle = intent.extras
        var nombre = bundle?.getString("nombre")
        nombre3.setText(nombre)


        var id = findViewById<EditText>(R.id.idEdit)
        var nombreCan = findViewById<EditText>(R.id.nombreEdit)
        var comuna = findViewById<EditText>(R.id.comunaEdit)
        var partido = findViewById<EditText>(R.id.partidoEdit)
        var lista = findViewById<EditText>(R.id.listaEdit2)
        val titulo = findViewById<EditText>(R.id.tituloEdit)
        var distrito = findViewById<EditText>(R.id.distritoEdit)
        var circunscripcion = findViewById<EditText>(R.id.circunsEdit)

        val estudios = findViewById<Spinner>(R.id.estudiosSpinner)
        val religion = findViewById<Spinner>(R.id.religionSpinner)
        val practica = findViewById<Spinner>(R.id.practicanteSpinner)
        val transporte = findViewById<Spinner>(R.id.transporteSpinner)
        val personaje = findViewById<Spinner>(R.id.personajeSpinner)
        val muerte = findViewById<Spinner>(R.id.muerteSpinner)
        val drogas = findViewById<Spinner>(R.id.drogaSpinner)
        val prosti = findViewById<Spinner>(R.id.prostiSpinner)
        val homo = findViewById<Spinner>(R.id.homoSpinner)
        val adop = findViewById<Spinner>(R.id.adopHomoSpinner)
        val aborto = findViewById<Spinner>(R.id.abortoSpinner)
        val pena = findViewById<Spinner>(R.id.penaSpinner)
        val deuda = findViewById<Spinner>(R.id.deudaSpinner)
        val edu = findViewById<Spinner>(R.id.eduSpinner)
        val afp = findViewById<Spinner>(R.id.afpSpinner)
        val tierras = findViewById<Spinner>(R.id.tierrasSpinner)
        val cultos = findViewById<Spinner>(R.id.cultosSpinner)
        val militar = findViewById<Spinner>(R.id.militarSpinner)
        val castigo = findViewById<Spinner>(R.id.castigoSpinner)
        val inmigrante = findViewById<Spinner>(R.id.inmigrantSpinner)
        val ambiente = findViewById<Spinner>(R.id.ambienteSpinner)
        val terror = findViewById<Spinner>(R.id.terrorSpinner)
        val agua = findViewById<Spinner>(R.id.aguaSpinner)
        val violencia = findViewById<Spinner>(R.id.violenciaSpinner)
        val montajes = findViewById<Spinner>(R.id.montajesSpinner)
        val genero = findViewById<Spinner>(R.id.generoSpinner)
        val crimen = findViewById<Spinner>(R.id.crimenSpinner)
        val eduysalud = findViewById<Spinner>(R.id.eduYsaludSpinner)

        val nivelEstudios = findViewById<TextView>(R.id.estudiosText)
        val religionText = findViewById<TextView>(R.id.religionText)
        val practicaText = findViewById<TextView>(R.id.practicaText)
        val transporteText = findViewById<TextView>(R.id.transporteText)
        val personajeText = findViewById<TextView>(R.id.personajeText)
        val muerteText = findViewById<TextView>(R.id.muerteText)
        val drogaText = findViewById<TextView>(R.id.drogaText)
        val prostiText = findViewById<TextView>(R.id.prostiText)
        val matriHomo = findViewById<TextView>(R.id.matriText)
        val adopHomo = findViewById<TextView>(R.id.adopText)
        val abortoText = findViewById<TextView>(R.id.abortoText)
        val penaMuerte = findViewById<TextView>(R.id.penaText)
        val deudaText = findViewById<TextView>(R.id.deudaText)
        val eduText = findViewById<TextView>(R.id.eduText)
        val afpText = findViewById<TextView>(R.id.afpText)
        val tierrasText = findViewById<TextView>(R.id.tierraText)
        val cultoText = findViewById<TextView>(R.id.cultoText)
        val militarText = findViewById<TextView>(R.id.militarText)
        val castigoText = findViewById<TextView>(R.id.castigoText)
        val inmigranteText = findViewById<TextView>(R.id.inmigranteText)
        val ambienteText = findViewById<TextView>(R.id.ambienteText)
        val terrorText = findViewById<TextView>(R.id.terrorText)
        val aguaText = findViewById<TextView>(R.id.aguaText)
        val violenciaText = findViewById<TextView>(R.id.violenciaText)
        val montajeText = findViewById<TextView>(R.id.montajeText)
        val generoText = findViewById<TextView>(R.id.generoText)
        val crimenText = findViewById<TextView>(R.id.crimenText)
        val eduYsaludText = findViewById<TextView>(R.id.eduYsaludText)



        var save = findViewById<Button>(R.id.saveButton)
        var buscar = findViewById<Button>(R.id.getButton)
        var eliminar = findViewById<Button>(R.id.deleButton)
        var actualizar = findViewById<Button>(R.id.actualizaButton)



        //****** desde aqui empiezan los adapter
        val adapterEstudios: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.estudios,android.R.layout.simple_spinner_item)
        estudios.adapter = adapterEstudios

        val adapterReligion: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.religion,android.R.layout.simple_spinner_item)
        religion.adapter = adapterReligion

        val adapterPractica: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.practica,android.R.layout.simple_spinner_item)
        practica.adapter = adapterPractica

        val adapterTransporte: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.transporte,android.R.layout.simple_spinner_item)
        transporte.adapter = adapterTransporte

        val adapterPersonaje: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.personajes,android.R.layout.simple_spinner_item)
        personaje.adapter = adapterPersonaje

        val adapterMuerte: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        muerte.adapter = adapterMuerte

        val adapterDrogas: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        drogas.adapter = adapterDrogas

        val adapterProsti: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        prosti.adapter = adapterProsti

        val adapterHomo: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        homo.adapter = adapterHomo

        val adapterAdop: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        adop.adapter = adapterAdop

        val adapterAbort: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        aborto.adapter = adapterAbort

        val adapterPena: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        pena.adapter = adapterPena

        val adapterDeuda: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        deuda.adapter = adapterDeuda

        val adapterEdu: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        edu.adapter = adapterEdu

        val adapterAfp: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        afp.adapter = adapterAfp

        val adapterTierras: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        tierras.adapter = adapterTierras

        val adapterCultos: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        cultos.adapter = adapterCultos

        val adapterMilitar: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        militar.adapter = adapterMilitar

        val adapterCastigo: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        castigo.adapter = adapterCastigo

        val adapterInmi: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        inmigrante.adapter = adapterInmi

        val adapterAmbi: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        ambiente.adapter = adapterAmbi

        val adapterTerror: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        terror.adapter = adapterTerror

        val adapterAgua: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        agua.adapter = adapterAgua

        val adapterViolencia: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        violencia.adapter = adapterViolencia

        val adapterMontaje: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        montajes.adapter = adapterMontaje

        val adapterGenero: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        genero.adapter = adapterGenero

        val adapterCrimen: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        crimen.adapter = adapterCrimen

        val adapterEduSalud: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.posicion,android.R.layout.simple_spinner_item)
        eduysalud.adapter = adapterEduSalud


        // ********* aqui terminan los adapter

        var complete = "voluntario"


        save.setOnClickListener{

            if (partido.text.isNotEmpty()) {

                var condicion = "Si"

                db.collection("presidentes").document(id.text.toString()).set(
                    hashMapOf(
                        "id" to id.text.toString(),
                        "completado" to complete,
                        "nombre" to nombreCan.text.toString(),
                        "comuna" to comuna.text.toString(),
                        "pacto" to lista.text.toString(),
                        "partido" to partido.text.toString(),
                        "distrito" to distrito.text.toString(),
                        "circunscripcion" to circunscripcion.text.toString(),
                        "titulo" to titulo.text.toString(),
                        "estudios" to estudios.selectedItem.toString(),
                        "religion" to religion.selectedItem.toString(),
                        "practica" to practica.selectedItem.toString(),
                        "transporte" to transporte.selectedItem.toString(),
                        "personaje" to personaje.selectedItem.toString(),
                        "muerte" to muerte.selectedItem.toString(),
                        "drogas" to drogas.selectedItem.toString(),
                        "prostitucion" to prosti.selectedItem.toString(),
                        "homo" to homo.selectedItem.toString(),
                        "adopcion" to adop.selectedItem.toString(),
                        "aborto" to aborto.selectedItem.toString(),
                        "penaMuerte" to pena.selectedItem.toString(),
                        "deuda" to deuda.selectedItem.toString(),
                        "educacion" to edu.selectedItem.toString(),
                        "afp" to afp.selectedItem.toString(),
                        "tierras" to tierras.selectedItem.toString(),
                        "cultos" to cultos.selectedItem.toString(),
                        "militar" to militar.selectedItem.toString(),
                        "castigo" to castigo.selectedItem.toString(),
                        "inmigrante" to inmigrante.selectedItem.toString(),
                        "ambiente" to ambiente.selectedItem.toString(),
                        "terrorismo" to terror.selectedItem.toString(),
                        "agua" to agua.selectedItem.toString(),
                        "violencia" to violencia.selectedItem.toString(),
                        "montajes" to montajes.selectedItem.toString(),
                        "genero" to genero.selectedItem.toString(),
                        "crimen" to crimen.selectedItem.toString(),
                        "edusalud" to eduysalud.selectedItem.toString(),
                        "pertenecePartido" to condicion))
                showGood()

            }else{

                var condicion = "No"

                db.collection("presidentes").document(id.text.toString()).set(
                    hashMapOf(
                        "id" to id.text.toString(),
                        "completado" to complete,
                        "nombre" to nombreCan.text.toString(),
                        "comuna" to comuna.text.toString(),
                        "pacto" to lista.text.toString(),
                        "partido" to partido.text.toString(),
                        "distrito" to distrito.text.toString(),
                        "circunscripcion" to circunscripcion.text.toString(),
                        "titulo" to titulo.text.toString(),
                        "estudios" to estudios.selectedItem.toString(),
                        "religion" to religion.selectedItem.toString(),
                        "practica" to practica.selectedItem.toString(),
                        "transporte" to transporte.selectedItem.toString(),
                        "personaje" to personaje.selectedItem.toString(),
                        "muerte" to muerte.selectedItem.toString(),
                        "drogas" to drogas.selectedItem.toString(),
                        "prostitucion" to prosti.selectedItem.toString(),
                        "homo" to homo.selectedItem.toString(),
                        "adopcion" to adop.selectedItem.toString(),
                        "aborto" to aborto.selectedItem.toString(),
                        "penaMuerte" to pena.selectedItem.toString(),
                        "deuda" to deuda.selectedItem.toString(),
                        "educacion" to edu.selectedItem.toString(),
                        "afp" to afp.selectedItem.toString(),
                        "tierras" to tierras.selectedItem.toString(),
                        "cultos" to cultos.selectedItem.toString(),
                        "militar" to militar.selectedItem.toString(),
                        "castigo" to castigo.selectedItem.toString(),
                        "inmigrante" to inmigrante.selectedItem.toString(),
                        "ambiente" to ambiente.selectedItem.toString(),
                        "terrorismo" to terror.selectedItem.toString(),
                        "agua" to agua.selectedItem.toString(),
                        "violencia" to violencia.selectedItem.toString(),
                        "montajes" to montajes.selectedItem.toString(),
                        "genero" to genero.selectedItem.toString(),
                        "crimen" to crimen.selectedItem.toString(),
                        "edusalud" to eduysalud.selectedItem.toString(),
                        "PertenecePartido" to condicion))
                showGood()
            }

        }

        buscar.setOnClickListener{
            if (id.text.isNotEmpty()) {
                db.collection("presidentes").document(id.text.toString()).get()
                    .addOnSuccessListener {
                        nombreCan.setText(it.get("nombre") as String?)
                        comuna.setText(it.get("comuna") as String?)
                        partido.setText(it.get("partido") as String?)
                        distrito.setText(it.get("distrito") as String)
                        circunscripcion.setText(it.get("circunscripcion") as String?)
                        lista.setText(it.get("pacto") as String?)
                        nivelEstudios.setText(it.get("partido") as String?)
                        titulo.setText(it.get("titulo") as String?)
                        religionText.setText(it.get("religion") as String?)
                        practicaText.setText(it.get("practica") as String?)
                        transporteText.setText(it.get("transporte") as String?)
                        personajeText.setText(it.get("personaje") as String?)
                        muerteText.setText(it.get("muerte") as String?)
                        drogaText.setText(it.get("droga") as String?)
                        prostiText.setText(it.get("prostitucion") as String?)
                        matriHomo.setText(it.get("homo") as String?)
                        adopHomo.setText(it.get("adopcion") as String?)
                        abortoText.setText(it.get("aborto") as String?)
                        penaMuerte.setText(it.get("penaMuerte") as String?)
                        deudaText.setText(it.get("deuda") as String?)
                        eduText.setText(it.get("educacion") as String?)
                        afpText.setText(it.get("afp") as String?)
                        tierrasText.setText(it.get("tierras") as String?)
                        cultoText.setText(it.get("culto") as String?)
                        militarText.setText(it.get("militar") as String?)
                        castigoText.setText(it.get("castigo") as String?)
                        inmigranteText.setText(it.get("inmigrante") as String?)
                        ambienteText.setText(it.get("ambiente") as String?)
                        terrorText.setText(it.get("terrorismo") as String?)
                        aguaText.setText(it.get("agua") as String?)
                        violenciaText.setText(it.get("violencia") as String?)
                        montajeText.setText(it.get("montajes") as String?)
                        generoText.setText(it.get("genero") as String?)
                        crimenText.setText(it.get("crimen") as String?)
                        eduYsaludText.setText(it.get("edusalud") as String?)
                    }
            }else{
                showError()
            }

        }

        actualizar.setOnClickListener{
            if (id.text.isNotEmpty()) {
                if (partido.text.isNotEmpty()) {

                    var condicion = "Si"

                    db.collection("presidentes").document(id.text.toString()).update(
                        hashMapOf(
                            "id" to id.text.toString(),
                            "completado" to complete,
                            "nombre" to nombreCan.text.toString(),
                            "comuna" to comuna.text.toString(),
                            "pacto" to lista.text.toString(),
                            "partido" to partido.text.toString(),
                            "distrito" to distrito.text.toString(),
                            "circunscripcion" to circunscripcion.text.toString(),
                            "titulo" to titulo.text.toString(),
                            "estudios" to estudios.selectedItem.toString(),
                            "religion" to religion.selectedItem.toString(),
                            "practica" to practica.selectedItem.toString(),
                            "transporte" to transporte.selectedItem.toString(),
                            "personaje" to personaje.selectedItem.toString(),
                            "muerte" to muerte.selectedItem.toString(),
                            "drogas" to drogas.selectedItem.toString(),
                            "prostitucion" to prosti.selectedItem.toString(),
                            "homo" to homo.selectedItem.toString(),
                            "adopcion" to adop.selectedItem.toString(),
                            "aborto" to aborto.selectedItem.toString(),
                            "penaMuerte" to pena.selectedItem.toString(),
                            "deuda" to deuda.selectedItem.toString(),
                            "educacion" to edu.selectedItem.toString(),
                            "afp" to afp.selectedItem.toString(),
                            "tierras" to tierras.selectedItem.toString(),
                            "cultos" to cultos.selectedItem.toString(),
                            "militar" to militar.selectedItem.toString(),
                            "castigo" to castigo.selectedItem.toString(),
                            "inmigrante" to inmigrante.selectedItem.toString(),
                            "ambiente" to ambiente.selectedItem.toString(),
                            "terrorismo" to terror.selectedItem.toString(),
                            "agua" to agua.selectedItem.toString(),
                            "violencia" to violencia.selectedItem.toString(),
                            "montajes" to montajes.selectedItem.toString(),
                            "genero" to genero.selectedItem.toString(),
                            "crimen" to crimen.selectedItem.toString(),
                            "edusalud" to eduysalud.selectedItem.toString(),
                            "condicion" to condicion) as Map<String, Any>)
                    showGood()
                }else{
                    var condicion = "No"

                    db.collection("presidentes").document(id.text.toString()).update(
                        hashMapOf(
                            "id" to id.text.toString(),
                            "completado" to complete,
                            "nombre" to nombreCan.text.toString(),
                            "comuna" to comuna.text.toString(),
                            "pacto" to lista.text.toString(),
                            "partido" to partido.text.toString(),
                            "distrito" to distrito.text.toString(),
                            "circunscripcion" to circunscripcion.text.toString(),
                            "titulo" to titulo.text.toString(),
                            "estudios" to estudios.selectedItem.toString(),
                            "religion" to religion.selectedItem.toString(),
                            "practica" to practica.selectedItem.toString(),
                            "transporte" to transporte.selectedItem.toString(),
                            "personaje" to personaje.selectedItem.toString(),
                            "muerte" to muerte.selectedItem.toString(),
                            "drogas" to drogas.selectedItem.toString(),
                            "prostitucion" to prosti.selectedItem.toString(),
                            "homo" to homo.selectedItem.toString(),
                            "adopcion" to adop.selectedItem.toString(),
                            "aborto" to aborto.selectedItem.toString(),
                            "penaMuerte" to pena.selectedItem.toString(),
                            "deuda" to deuda.selectedItem.toString(),
                            "educacion" to edu.selectedItem.toString(),
                            "afp" to afp.selectedItem.toString(),
                            "tierras" to tierras.selectedItem.toString(),
                            "cultos" to cultos.selectedItem.toString(),
                            "militar" to militar.selectedItem.toString(),
                            "castigo" to castigo.selectedItem.toString(),
                            "inmigrante" to inmigrante.selectedItem.toString(),
                            "ambiente" to ambiente.selectedItem.toString(),
                            "terrorismo" to terror.selectedItem.toString(),
                            "agua" to agua.selectedItem.toString(),
                            "violencia" to violencia.selectedItem.toString(),
                            "montajes" to montajes.selectedItem.toString(),
                            "genero" to genero.selectedItem.toString(),
                            "crimen" to crimen.selectedItem.toString(),
                            "edusalud" to eduysalud.selectedItem.toString(),
                            "condicion" to condicion) as Map<String, Any>)
                    showGood()
                }
            }else{
                showError()
            }

        }

        eliminar.setOnClickListener{
            if (id.text.isNotEmpty()) {
                db.collection("presidentes").document(id.text.toString()).delete()
                showGood()
            }else{
                showError()
            }
        }

    }

    private fun showError(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("ID vacio, favor introduzca un ID")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }
    private fun showGood(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Logrado")
        builder.setMessage("Solicitud realizada con exito")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }

}