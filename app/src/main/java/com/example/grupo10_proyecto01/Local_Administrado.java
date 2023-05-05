package com.example.grupo10_proyecto01;

public class Local_Administrado {

    private int id_local_admin;
    private Localidad Edificioa;
    private Localidad nombrelocalidad;
    private Empleado_UES nombreempleado;
    private Empleado_UES apellidoempleado;

    public Local_Administrado(){
    }

    //Constructor
    public Local_Administrado(int id_local_admin, Localidad edificioa, Localidad nombrelocalidad, Empleado_UES nombreempleado, Empleado_UES apellidoempleado) {
        this.id_local_admin = id_local_admin;
        Edificioa = edificioa;
        this.nombrelocalidad = nombrelocalidad;
        this.nombreempleado = nombreempleado;
        this.apellidoempleado = apellidoempleado;
    }

    //Getter y Setter

    public int getId_local_admin() {
        return id_local_admin;
    }

    public void setId_local_admin(int id_local_admin) {
        this.id_local_admin = id_local_admin;
    }

    public Localidad getEdificioa() {
        return Edificioa;
    }

    public void setEdificioa(Localidad edificioa) {
        Edificioa = edificioa;
    }

    public Localidad getNombrelocalidad() {
        return nombrelocalidad;
    }

    public void setNombrelocalidad(Localidad nombrelocalidad) {
        this.nombrelocalidad = nombrelocalidad;
    }

    public Empleado_UES getNombreempleado() {
        return nombreempleado;
    }

    public void setNombreempleado(Empleado_UES nombreempleado) {
        this.nombreempleado = nombreempleado;
    }

    public Empleado_UES getApellidoempleado() {
        return apellidoempleado;
    }

    public void setApellidoempleado(Empleado_UES apellidoempleado) {
        this.apellidoempleado = apellidoempleado;
    }
}