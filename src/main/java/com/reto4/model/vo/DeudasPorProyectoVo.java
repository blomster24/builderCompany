package com.reto4.model.vo;

public class DeudasPorProyectoVo {
    private int IDProyecto;
    private int cantidad;
    private int precioUnidad;
    private double valor;
    private String pagado;

    public DeudasPorProyectoVo() {

    }

    public DeudasPorProyectoVo(int iDProyecto, int cantidad, int precioUnidad) {
        IDProyecto = iDProyecto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    // GETTERS
    public int getIDProyecto() {
        return IDProyecto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    // SETTERS
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIDProyecto(int iDProyecto) {
        IDProyecto = iDProyecto;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
