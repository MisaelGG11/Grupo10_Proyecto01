package com.example.grupo10_proyecto01;

public class Tipo_evento{

    private int id_tipo_evento;
    private String nombre_tipo_evento;

    public Tipo_evento(){
    }

//Constructor
    public Tipo_evento(int id_tipo_evento, String nombre_tipo_evento) {
        this.id_tipo_evento = id_tipo_evento;
        this.nombre_tipo_evento = nombre_tipo_evento;
    }

//Getter y Setter
    public int getId_tipo_evento() {
        return id_tipo_evento;
    }

    public void setId_tipo_evento(int id_tipo_evento) {
        this.id_tipo_evento = id_tipo_evento;
    }

    public String getNombre_tipo_evento() {
        return nombre_tipo_evento;
    }

    public void setNombre_tipo_evento(String nombre_tipo_evento) {
        this.nombre_tipo_evento = nombre_tipo_evento;
    }
}