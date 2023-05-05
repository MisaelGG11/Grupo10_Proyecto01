package com.example.grupo10_proyecto01;


public class Docente {
    private int id_docente;
    private Empleado_UES nombre_docente;
    private Empleado_UES apellido_docente;
    private Empleado_UES email_docente;
    private Empleado_UES telefono_docente;
    private String nip_docente;
    private String categoria_docente;

    public Docente(){
    }

    //Constructor

    public Docente(int id_docente, Empleado_UES nombre_docente, Empleado_UES apellido_docente, Empleado_UES email_docente, Empleado_UES telefono_docente, String nip_docente, String categoria_docente) {
        this.id_docente = id_docente;
        this.nombre_docente = nombre_docente;
        this.apellido_docente = apellido_docente;
        this.email_docente = email_docente;
        this.telefono_docente = telefono_docente;
        this.nip_docente = nip_docente;
        this.categoria_docente = categoria_docente;
    }

    //Getter y Setter

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public Empleado_UES getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(Empleado_UES nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public Empleado_UES getApellido_docente() {
        return apellido_docente;
    }

    public void setApellido_docente(Empleado_UES apellido_docente) {
        this.apellido_docente = apellido_docente;
    }

    public Empleado_UES getEmail_docente() {
        return email_docente;
    }

    public void setEmail_docente(Empleado_UES email_docente) {
        this.email_docente = email_docente;
    }

    public Empleado_UES getTelefono_docente() {
        return telefono_docente;
    }

    public void setTelefono_docente(Empleado_UES telefono_docente) {
        this.telefono_docente = telefono_docente;
    }

    public String getNip_docente() {
        return nip_docente;
    }

    public void setNip_docente(String nip_docente) {
        this.nip_docente = nip_docente;
    }

    public String getCategoria_docente() {
        return categoria_docente;
    }

    public void setCategoria_docente(String categoria_docente) {
        this.categoria_docente = categoria_docente;
    }
}