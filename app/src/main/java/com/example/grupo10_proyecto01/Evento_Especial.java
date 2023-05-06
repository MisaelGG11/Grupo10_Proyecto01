package com.example.grupo10_proyecto01;


public class Evento_Especial  {
    private int id_evento;
    private String organizador;
    private String nombre_evento;
    private Tipo_evento nombre_tipo_evento;
    private Localidad Edificio;
    private Localidad nombre_localidad;
    private String fecha_evento;
    private Horario horainicio;
    private Horario horafinalizacion;

    public Evento_Especial(){
    }

    //Constructor
    public Evento_Especial(int id_evento, String organizador, String nombre_evento, Tipo_evento nombre_tipo_evento, Localidad edificio, Localidad nombre_localidad, String fecha_evento, Horario horainicio, Horario horafinalizacion) {
        this.id_evento = id_evento;
        this.organizador = organizador;
        this.nombre_evento = nombre_evento;
        this.nombre_tipo_evento = nombre_tipo_evento;
        Edificio = edificio;
        this.nombre_localidad = nombre_localidad;
        this.fecha_evento = fecha_evento;
        this.horainicio = horainicio;
        this.horafinalizacion = horafinalizacion;
    }

    //Getter y Setter

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public Tipo_evento getNombre_tipo_evento() {
        return nombre_tipo_evento;
    }

    public void setNombre_tipo_evento(Tipo_evento nombre_tipo_evento) {
        this.nombre_tipo_evento = nombre_tipo_evento;
    }

    public Localidad getEdificio() {
        return Edificio;
    }

    public void setEdificio(Localidad edificio) {
        Edificio = edificio;
    }

    public Localidad getNombre_localidad() {
        return nombre_localidad;
    }

    public void setNombre_localidad(Localidad nombre_localidad) {
        this.nombre_localidad = nombre_localidad;
    }

    public String getFecha_evento() {
        return fecha_evento;
    }

    public void setFecha_evento(String fecha_evento) {
        this.fecha_evento = fecha_evento;
    }

    public Horario getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Horario horainicio) {
        this.horainicio = horainicio;
    }

    public Horario getHorafinalizacion() {
        return horafinalizacion;
    }

    public void setHorafinalizacion(Horario horafinalizacion) {
        this.horafinalizacion = horafinalizacion;
    }
}