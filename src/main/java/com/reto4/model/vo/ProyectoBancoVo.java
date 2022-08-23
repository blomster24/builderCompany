package com.reto4.model.vo;

public class ProyectoBancoVo {
    // ATRIBUTOS
    private int IDProyecto;
    private String constructora;
    private String ciudad;
    private String clasificacion;
    private int estrato;
    private String lider;
    private String banco;

    // Constructor
    public ProyectoBancoVo() {

    }

    public ProyectoBancoVo(int IDProyecto, String constructora, String ciudad, String clasificacion, int estrato,
            String lider, String fechaInicio, String banco) {
        this.IDProyecto = IDProyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.estrato = estrato;
        this.lider = lider;
        this.banco = banco;
    }

    // GETTERS
    
    public String getBanco() {
        return banco;
    }

    public int getIDProyecto() {
        return IDProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getEstrato() {
        return estrato;
    }

    public String getLider() {
        return lider;
    }

    // SETTERS
    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public void setIDProyecto(int iDProyecto) {
        IDProyecto = iDProyecto;
    }

}
