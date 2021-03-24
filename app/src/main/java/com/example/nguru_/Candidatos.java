package com.example.nguru_;

public class Candidatos {
    
    private String nombre;
    private  String distrito;
    private String partido;

    public Candidatos(){

    }

    public Candidatos(String nombre, String distrito, String partido){
            this.nombre = nombre;
            this.distrito = distrito;
            this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
