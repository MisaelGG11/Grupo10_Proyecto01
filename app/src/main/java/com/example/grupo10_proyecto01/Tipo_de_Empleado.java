package com.example.grupo10_proyecto01;

public class Tipo_de_Empleado  {
    private int id_tipo_empleado;
    private String ocupacion;

    public Tipo_de_Empleado(){
    }

    //Constructor
    public Tipo_de_Empleado(int id_tipo_empleado, String ocupacion) {
        this.id_tipo_empleado = id_tipo_empleado;
        this.ocupacion = ocupacion;
    }

    //Getter y Setter

    public int getId_tipo_empleado() {
        return id_tipo_empleado;
    }

    public void setId_tipo_empleado(int id_tipo_empleado) {
        this.id_tipo_empleado = id_tipo_empleado;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}