package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.firebase.firestore.FirebaseFirestore

class CandiDatosConstituyentes : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candi_datos_constituyentes)

        setup()
    }

    private fun setup(){

        val bundle = intent.extras
        val eleccion = bundle?.getInt("datos")

        val id = findViewById<TextView>(R.id.idText)
        val bundle2 = intent.extras
        val id2 = bundle2?.getString("id")
        id.setText(id2)


        val actualizate = findViewById<Button>(R.id.actualizaButton)
        val nombreCandi = findViewById<TextView>(R.id.nombreText)


        val comuna = findViewById<EditText>(R.id.comunaEdit)
        val partido = findViewById<EditText>(R.id.partidoEdit)
        val lista = findViewById<EditText>(R.id.listaEdit2)
        val titulo = findViewById<EditText>(R.id.tituloEdit)
        val distrito = findViewById<EditText>(R.id.distritoEdit)
        val circunscripcion = findViewById<EditText>(R.id.circunsEdit)


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



        when(eleccion){
            1 ->db.collection("constituyentes").document(id.text.toString()).get()
                .addOnSuccessListener {
                    nombreCandi.setText(it.get("nombre") as String?)
                            comuna.setText(it.get("comuna") as String?)
                            partido.setText(it.get("partido") as String?)
                            distrito.setText(it.get("distrito") as String?)
                            circunscripcion.setText(it.get("circunscripcion") as String?)
                            lista.setText(it.get("lista") as String?)
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

            2 ->db.collection("alcaldes").document(id.text.toString()).get()
                .addOnSuccessListener {
                    nombreCandi.setText(it.get("nombre") as String?)
                    comuna.setText(it.get("comuna") as String?)
                    partido.setText(it.get("partido") as String?)
                    distrito.setText(it.get("distrito") as String?)
                    circunscripcion.setText(it.get("circunscripcion") as String?)
                    lista.setText(it.get("lista") as String?)
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

            3 ->db.collection("consejales").document(id.text.toString()).get()
                .addOnSuccessListener {
                    nombreCandi.setText(it.get("nombre") as String?)
                    comuna.setText(it.get("comuna") as String?)
                    partido.setText(it.get("partido") as String?)
                    distrito.setText(it.get("distrito") as String?)
                    circunscripcion.setText(it.get("circunscripcion") as String?)
                    lista.setText(it.get("lista") as String?)
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

            4 ->db.collection("gobernadores").document(id.text.toString()).get()
                .addOnSuccessListener {
                    nombreCandi.setText(it.get("nombre") as String?)
                    comuna.setText(it.get("comuna") as String?)
                    partido.setText(it.get("partido") as String?)
                    distrito.setText(it.get("distrito") as String?)
                    circunscripcion.setText(it.get("circunscripcion") as String?)
                    lista.setText(it.get("lista") as String?)
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

            5 ->db.collection("presidentes").document(id.text.toString()).get()
                .addOnSuccessListener {
                    nombreCandi.setText(it.get("nombre") as String?)
                    comuna.setText(it.get("comuna") as String?)
                    partido.setText(it.get("partido") as String?)
                    distrito.setText(it.get("distrito") as String?)
                    circunscripcion.setText(it.get("circunscripcion") as String?)
                    lista.setText(it.get("lista") as String?)
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

        }


        actualizate.setOnClickListener{

            var complete = "candidato"

            when(eleccion) {
                1 ->
                    if  (comuna.text.toString().isEmpty() || lista.text.toString().isEmpty() || partido.text.toString().isEmpty() ||
                            distrito.text.toString().isEmpty() || circunscripcion.text.toString().isEmpty() || titulo.text.toString().isEmpty() ||
                            estudios.selectedItem.toString() == "Indique nivel de estudio" || religion.selectedItem.toString() == "Seleccione Religión" ||
                            practica.selectedItem.toString() == "Indique si es practicante" || transporte.selectedItem.toString() == "indique medio de transporte" ||
                            personaje.selectedItem.toString() == "Seleccione un personajes historico" || muerte.selectedItem.toString() == "Seleccones una opción" ||
                            drogas.selectedItem.toString() == "Seleccones una opción" || prosti.selectedItem.toString() == "Seleccones una opción" ||
                            homo.selectedItem.toString() == "Seleccones una opción" || adop.selectedItem.toString() == "Seleccones una opción" ||
                            aborto.selectedItem.toString() == "Seleccones una opción" || pena.selectedItem.toString() == "Seleccones una opción" ||
                            deuda.selectedItem.toString() == "Seleccones una opción" || edu.selectedItem.toString() == "Seleccones una opción" ||
                            afp.selectedItem.toString() == "Seleccones una opción" || tierras.selectedItem.toString() == "Seleccones una opción" ||
                            cultos.selectedItem.toString() == "Seleccones una opción" || militar.selectedItem.toString() == "Seleccones una opción" ||
                            castigo.selectedItem.toString() == "Seleccones una opción" || inmigrante.selectedItem.toString() == "Seleccones una opción" ||
                            ambiente.selectedItem.toString() == "Seleccones una opción" || terror.selectedItem.toString() == "Seleccones una opción" ||
                            agua.selectedItem.toString() == "Seleccones una opción" || violencia.selectedItem.toString() == "Seleccones una opción" ||
                            montajes.selectedItem.toString() == "Seleccones una opción" || genero.selectedItem.toString() == "Seleccones una opción" ||
                            crimen.selectedItem.toString() == "Seleccones una opción" || eduysalud.selectedItem.toString() == "Seleccones una opción") {

                        showVacio()

                    }else {

                            db.collection("constituyentes").document(id.text.toString()).update(
                                hashMapOf(
                                    "completado" to complete,
                                    "comuna" to comuna.text.toString(),
                                    "lista" to lista.text.toString(),
                                    "partido" to partido.text.toString(),
                                    "distrito" to distrito.text.toString(),
                                    "circunscripcion" to distrito.text.toString(),
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
                                    "edusalud" to eduysalud.selectedItem.toString()) as Map<String, Any>)


                        var goEncuesta1 = Intent(this,Preguntas1Candidatos::class.java)
                        goEncuesta1.putExtra("datos", eleccion)
                        goEncuesta1.putExtra("id", id.text.toString())
                        startActivity(goEncuesta1)
                        }

                2 ->
                    if  (comuna.text.toString().isEmpty() || lista.text.toString().isEmpty() || partido.text.toString().isEmpty() ||
                        distrito.text.toString().isEmpty() || circunscripcion.text.toString().isEmpty() || titulo.text.toString().isEmpty() ||
                        estudios.selectedItem.toString() == "Indique nivel de estudio" || religion.selectedItem.toString() == "Seleccione Religión" ||
                        practica.selectedItem.toString() == "Indique si es practicante" || transporte.selectedItem.toString() == "indique medio de transporte" ||
                        personaje.selectedItem.toString() == "Seleccione un personajes historico" || muerte.selectedItem.toString() == "Seleccones una opción" ||
                        drogas.selectedItem.toString() == "Seleccones una opción" || prosti.selectedItem.toString() == "Seleccones una opción" ||
                        homo.selectedItem.toString() == "Seleccones una opción" || adop.selectedItem.toString() == "Seleccones una opción" ||
                        aborto.selectedItem.toString() == "Seleccones una opción" || pena.selectedItem.toString() == "Seleccones una opción" ||
                        deuda.selectedItem.toString() == "Seleccones una opción" || edu.selectedItem.toString() == "Seleccones una opción" ||
                        afp.selectedItem.toString() == "Seleccones una opción" || tierras.selectedItem.toString() == "Seleccones una opción" ||
                        cultos.selectedItem.toString() == "Seleccones una opción" || militar.selectedItem.toString() == "Seleccones una opción" ||
                        castigo.selectedItem.toString() == "Seleccones una opción" || inmigrante.selectedItem.toString() == "Seleccones una opción" ||
                        ambiente.selectedItem.toString() == "Seleccones una opción" || terror.selectedItem.toString() == "Seleccones una opción" ||
                        agua.selectedItem.toString() == "Seleccones una opción" || violencia.selectedItem.toString() == "Seleccones una opción" ||
                        montajes.selectedItem.toString() == "Seleccones una opción" || genero.selectedItem.toString() == "Seleccones una opción" ||
                        crimen.selectedItem.toString() == "Seleccones una opción" || eduysalud.selectedItem.toString() == "Seleccones una opción") {

                        showVacio()

                    }else {

                        db.collection("alcaldes").document(id.text.toString()).update(
                            hashMapOf(
                                "completado" to complete,
                                "comuna" to comuna.text.toString(),
                                "lista" to lista.text.toString(),
                                "partido" to partido.text.toString(),
                                "distrito" to distrito.text.toString(),
                                "circunscripcion" to distrito.text.toString(),
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
                                "edusalud" to eduysalud.selectedItem.toString()) as Map<String, Any>)


                        var goEncuesta2 = Intent(this,Preguntas1Candidatos::class.java)
                        goEncuesta2.putExtra("datos", eleccion)
                        goEncuesta2.putExtra("id", id.text.toString())
                        startActivity(goEncuesta2)
                    }

                3 ->
                    if  (comuna.text.toString().isEmpty() || lista.text.toString().isEmpty() || partido.text.toString().isEmpty() ||
                        distrito.text.toString().isEmpty() || circunscripcion.text.toString().isEmpty() || titulo.text.toString().isEmpty() ||
                        estudios.selectedItem.toString() == "Indique nivel de estudio" || religion.selectedItem.toString() == "Seleccione Religión" ||
                        practica.selectedItem.toString() == "Indique si es practicante" || transporte.selectedItem.toString() == "indique medio de transporte" ||
                        personaje.selectedItem.toString() == "Seleccione un personajes historico" || muerte.selectedItem.toString() == "Seleccones una opción" ||
                        drogas.selectedItem.toString() == "Seleccones una opción" || prosti.selectedItem.toString() == "Seleccones una opción" ||
                        homo.selectedItem.toString() == "Seleccones una opción" || adop.selectedItem.toString() == "Seleccones una opción" ||
                        aborto.selectedItem.toString() == "Seleccones una opción" || pena.selectedItem.toString() == "Seleccones una opción" ||
                        deuda.selectedItem.toString() == "Seleccones una opción" || edu.selectedItem.toString() == "Seleccones una opción" ||
                        afp.selectedItem.toString() == "Seleccones una opción" || tierras.selectedItem.toString() == "Seleccones una opción" ||
                        cultos.selectedItem.toString() == "Seleccones una opción" || militar.selectedItem.toString() == "Seleccones una opción" ||
                        castigo.selectedItem.toString() == "Seleccones una opción" || inmigrante.selectedItem.toString() == "Seleccones una opción" ||
                        ambiente.selectedItem.toString() == "Seleccones una opción" || terror.selectedItem.toString() == "Seleccones una opción" ||
                        agua.selectedItem.toString() == "Seleccones una opción" || violencia.selectedItem.toString() == "Seleccones una opción" ||
                        montajes.selectedItem.toString() == "Seleccones una opción" || genero.selectedItem.toString() == "Seleccones una opción" ||
                        crimen.selectedItem.toString() == "Seleccones una opción" || eduysalud.selectedItem.toString() == "Seleccones una opción") {

                        showVacio()

                    }else {

                        db.collection("consejales").document(id.text.toString()).update(
                            hashMapOf(
                                "completado" to complete,
                                "comuna" to comuna.text.toString(),
                                "lista" to lista.text.toString(),
                                "partido" to partido.text.toString(),
                                "distrito" to distrito.text.toString(),
                                "circunscripcion" to distrito.text.toString(),
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
                                "edusalud" to eduysalud.selectedItem.toString()) as Map<String, Any>)

                        var goEncuesta3 = Intent(this,Preguntas1Candidatos::class.java)
                        goEncuesta3.putExtra("datos", eleccion)
                        goEncuesta3.putExtra("id", id.text.toString())
                        startActivity(goEncuesta3)

                    }

                4 ->
                    if  (comuna.text.toString().isEmpty() || lista.text.toString().isEmpty() || partido.text.toString().isEmpty() ||
                        distrito.text.toString().isEmpty() || circunscripcion.text.toString().isEmpty() || titulo.text.toString().isEmpty() ||
                        estudios.selectedItem.toString() == "Indique nivel de estudio" || religion.selectedItem.toString() == "Seleccione Religión" ||
                        practica.selectedItem.toString() == "Indique si es practicante" || transporte.selectedItem.toString() == "indique medio de transporte" ||
                        personaje.selectedItem.toString() == "Seleccione un personajes historico" || muerte.selectedItem.toString() == "Seleccones una opción" ||
                        drogas.selectedItem.toString() == "Seleccones una opción" || prosti.selectedItem.toString() == "Seleccones una opción" ||
                        homo.selectedItem.toString() == "Seleccones una opción" || adop.selectedItem.toString() == "Seleccones una opción" ||
                        aborto.selectedItem.toString() == "Seleccones una opción" || pena.selectedItem.toString() == "Seleccones una opción" ||
                        deuda.selectedItem.toString() == "Seleccones una opción" || edu.selectedItem.toString() == "Seleccones una opción" ||
                        afp.selectedItem.toString() == "Seleccones una opción" || tierras.selectedItem.toString() == "Seleccones una opción" ||
                        cultos.selectedItem.toString() == "Seleccones una opción" || militar.selectedItem.toString() == "Seleccones una opción" ||
                        castigo.selectedItem.toString() == "Seleccones una opción" || inmigrante.selectedItem.toString() == "Seleccones una opción" ||
                        ambiente.selectedItem.toString() == "Seleccones una opción" || terror.selectedItem.toString() == "Seleccones una opción" ||
                        agua.selectedItem.toString() == "Seleccones una opción" || violencia.selectedItem.toString() == "Seleccones una opción" ||
                        montajes.selectedItem.toString() == "Seleccones una opción" || genero.selectedItem.toString() == "Seleccones una opción" ||
                        crimen.selectedItem.toString() == "Seleccones una opción" || eduysalud.selectedItem.toString() == "Seleccones una opción") {

                        showVacio()

                    }else {

                        db.collection("gobernadores").document(id.text.toString()).update(
                            hashMapOf(
                                "completado" to complete,
                                "comuna" to comuna.text.toString(),
                                "lista" to lista.text.toString(),
                                "partido" to partido.text.toString(),
                                "distrito" to distrito.text.toString(),
                                "circunscripcion" to distrito.text.toString(),
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
                                "edusalud" to eduysalud.selectedItem.toString()) as Map<String, Any>)

                        var goEncuesta4 = Intent(this,Preguntas1Candidatos::class.java)
                        goEncuesta4.putExtra("datos", eleccion)
                        goEncuesta4.putExtra("id", id.text.toString())
                        startActivity(goEncuesta4)
                    }


                5 ->
                    if  (comuna.text.toString().isEmpty() || lista.text.toString().isEmpty() || partido.text.toString().isEmpty() ||
                        distrito.text.toString().isEmpty() || circunscripcion.text.toString().isEmpty() || titulo.text.toString().isEmpty() ||
                        estudios.selectedItem.toString() == "Indique nivel de estudio" || religion.selectedItem.toString() == "Seleccione Religión" ||
                        practica.selectedItem.toString() == "Indique si es practicante" || transporte.selectedItem.toString() == "indique medio de transporte" ||
                        personaje.selectedItem.toString() == "Seleccione un personajes historico" || muerte.selectedItem.toString() == "Seleccones una opción" ||
                        drogas.selectedItem.toString() == "Seleccones una opción" || prosti.selectedItem.toString() == "Seleccones una opción" ||
                        homo.selectedItem.toString() == "Seleccones una opción" || adop.selectedItem.toString() == "Seleccones una opción" ||
                        aborto.selectedItem.toString() == "Seleccones una opción" || pena.selectedItem.toString() == "Seleccones una opción" ||
                        deuda.selectedItem.toString() == "Seleccones una opción" || edu.selectedItem.toString() == "Seleccones una opción" ||
                        afp.selectedItem.toString() == "Seleccones una opción" || tierras.selectedItem.toString() == "Seleccones una opción" ||
                        cultos.selectedItem.toString() == "Seleccones una opción" || militar.selectedItem.toString() == "Seleccones una opción" ||
                        castigo.selectedItem.toString() == "Seleccones una opción" || inmigrante.selectedItem.toString() == "Seleccones una opción" ||
                        ambiente.selectedItem.toString() == "Seleccones una opción" || terror.selectedItem.toString() == "Seleccones una opción" ||
                        agua.selectedItem.toString() == "Seleccones una opción" || violencia.selectedItem.toString() == "Seleccones una opción" ||
                        montajes.selectedItem.toString() == "Seleccones una opción" || genero.selectedItem.toString() == "Seleccones una opción" ||
                        crimen.selectedItem.toString() == "Seleccones una opción" || eduysalud.selectedItem.toString() == "Seleccones una opción") {

                        showVacio()

                    }else {

                        db.collection("presidentes").document(id.text.toString()).update(
                            hashMapOf(
                                "completado" to complete,
                                "comuna" to comuna.text.toString(),
                                "lista" to lista.text.toString(),
                                "partido" to partido.text.toString(),
                                "distrito" to distrito.text.toString(),
                                "circunscripcion" to distrito.text.toString(),
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
                                "edusalud" to eduysalud.selectedItem.toString()) as Map<String, Any>)

                        var goEncuesta5 = Intent(this,Preguntas1Candidatos::class.java)
                        goEncuesta5.putExtra("datos", eleccion)
                        goEncuesta5.putExtra("id", id.text.toString())
                        startActivity(goEncuesta5)


                    }


                    }
            }



    }


    private fun showVacio(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error de datos")
        builder.setMessage("No ha respondido a todas las preguntas")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }
}