package co.edu.unicauca.distribuidos.core.models;

import java.util.Date;

public class Compra {
    String Identifiacion;
    String TipoIdentifiacion;
    double ValorCompra;
    String LugarCompra;
    Date FechaHora;
    String MedioPago;
    String NitEmpresa;

    public Compra() {
    }

    public Compra(String identifiacion, String tipoIdentifiacion, double valorCompra, String lugarCompra,
            Date fechaHora, String medioPago, String nitEmpresa) {
        Identifiacion = identifiacion;
        TipoIdentifiacion = tipoIdentifiacion;
        ValorCompra = valorCompra;
        LugarCompra = lugarCompra;
        FechaHora = fechaHora;
        MedioPago = medioPago;
        NitEmpresa = nitEmpresa;
    }

    public String getIdentifiacion() {
        return Identifiacion;
    }

    public void setIdentifiacion(String identifiacion) {
        Identifiacion = identifiacion;
    }

    public String getTipoIdentifiacion() {
        return TipoIdentifiacion;
    }

    public void setTipoIdentifiacion(String tipoIdentifiacion) {
        TipoIdentifiacion = tipoIdentifiacion;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double valorCompra) {
        ValorCompra = valorCompra;
    }

    public String getLugarCompra() {
        return LugarCompra;
    }

    public void setLugarCompra(String lugarCompra) {
        LugarCompra = lugarCompra;
    }

    public Date getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        FechaHora = fechaHora;
    }

    public String getMedioPago() {
        return MedioPago;
    }

    public void setMedioPago(String medioPago) {
        MedioPago = medioPago;
    }

    public String getNitEmpresa() {
        return NitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        NitEmpresa = nitEmpresa;
    }

}
