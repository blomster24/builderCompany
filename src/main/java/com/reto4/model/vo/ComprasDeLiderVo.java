package com.reto4.model.vo;

public class ComprasDeLiderVo {
    public int iDLider;
    public int idProyecto;
    public int idMaterialConstruccion;
    public String nombreLider;
    public double valor;

    // Constructor
    public ComprasDeLiderVo() {

    }

    public ComprasDeLiderVo(int iDLider, int idProyecto, int idMaterialConstruccion, String nombreLider, double valor) {
        this.iDLider = iDLider;
        this.idProyecto = idProyecto;
        this.idMaterialConstruccion = idMaterialConstruccion;
        this.nombreLider = nombreLider;
        this.valor = valor;

    }

    public int getiDLider() {
        return iDLider;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public double getValor() {
        return valor;
    }

    public int getIdMaterialConstruccion() {
        return idMaterialConstruccion;
    }

    public String getNombreLider() {
        return nombreLider;
    }

    // setters

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }

    public void setiDLider(int iDLider) {
        this.iDLider = iDLider;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setIdMaterialConstruccion(int idMaterialConstruccion) {
        this.idMaterialConstruccion = idMaterialConstruccion;
    }

}
