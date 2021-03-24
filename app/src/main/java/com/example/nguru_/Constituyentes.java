package com.example.nguru_;

public class Constituyentes {

    private String nombre;
    private String partido;
    private String distrito;

    public Constituyentes(){

    }

    public Constituyentes(String nombre, String partido, String distrito){
        this.nombre = nombre;
        this.partido = partido;
        this.distrito = distrito;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
