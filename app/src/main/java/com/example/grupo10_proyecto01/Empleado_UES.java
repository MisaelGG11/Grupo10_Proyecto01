package com.example.grupo10_proyecto01;

public class Empleado_UES {
    private int id_empleado;
    private String nombre_empleado;
    private String apellido_empleado;
    private Tipo_de_Empleado ocupacionE;
    private String email_empleado;
    private int telefono_empleado;

    public Empleado_UES(){
    }

    //Constructor

    public Empleado_UES(int id_empleado, String nombre_empleado, String apellido_empleado, Tipo_de_Empleado ocupacionE, String email_empleado, int telefono_empleado) {
        this.id_empleado = id_empleado;
        this.nombre_empleado = nombre_empleado;
        this.apellido_empleado = apellido_empleado;
        this.ocupacionE = ocupacionE;
        this.email_empleado = email_empleado;
        this.telefono_empleado = telefono_empleado;
    }

    //Getter y Setter
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public Tipo_de_Empleado getOcupacionE() {
        return ocupacionE;
    }

    public void setOcupacionE(Tipo_de_Empleado ocupacionE) {
        this.ocupacionE = ocupacionE;
    }

    public String getEmail_empleado() {
        return email_empleado;
    }

    public void setEmail_empleado(String email_empleado) {
        this.email_empleado = email_empleado;
    }

    public int getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(int telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }
}