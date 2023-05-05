package com.example.grupo10_proyecto01;

public class Grupo {

    private int id_grupo;
    private int num_grupo;
    private String tipo_grupo;
    private int cupo;
    private OfertaAcademica ofertaAcademica;

    public Grupo(int id_grupo, int num_grupo, String tipo_grupo, int cupo, OfertaAcademica ofertaAcademica) {
        this.id_grupo = id_grupo;
        this.num_grupo = num_grupo;
        this.tipo_grupo = tipo_grupo;
        this.cupo = cupo;
        this.ofertaAcademica = ofertaAcademica;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getNum_grupo() {
        return num_grupo;
    }

    public void setNum_grupo(int num_grupo) {
        this.num_grupo = num_grupo;
    }

    public String getTipo_grupo() {
        return tipo_grupo;
    }

    public void setTipo_grupo(String tipo_grupo) {
        this.tipo_grupo = tipo_grupo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public OfertaAcademica getOfertaAcademica() {
        return ofertaAcademica;
    }

    public void setOfertaAcademica(OfertaAcademica ofertaAcademica) {
        this.ofertaAcademica = ofertaAcademica;
    }
}
