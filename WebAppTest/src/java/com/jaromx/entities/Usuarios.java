/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaromx.entities;

/**
 *
 * @author AROQUE
 */
public class Usuarios {
    private int IdUsuario;
    private String Usuario;
    private String Clave;
    private String RFC;
    private String Nombre;
    private String ApellidoPat;
    private String ApellidoMat;
    private String Calle;
    private String NumeroExt;
    private String NumeroInt;
    private String Colonia;
    private String Poblacion;
    private String Estado;
    private String Pais;
    private String Telefono;
    private String Telefono2;
    private String Correo;
    private String Habilitado;
    private String Sesiones;
    private String permisos;
    private String centro;
    private String fin_validez;
    private String inicio_validez;
    private String codigo_postal;
    private String clave_pais;
    private String usuario_sap;
    private String almacen;
    
    public Usuarios(int IdUsuario, String Usuario, String Nombre, String ApellidoPat, String Estado, String Pais,String centro){
        this.IdUsuario = IdUsuario;
        this.Usuario = Usuario; 
        this.Nombre = Nombre;
        this.ApellidoPat = ApellidoPat;
        this.Estado = Estado;
        this.Pais = Pais;
        this.centro = centro;  
    }
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPat() {
        return ApellidoPat;
    }

    public void setApellidoPat(String ApellidoPat) {
        this.ApellidoPat = ApellidoPat;
    }

    public String getApellidoMat() {
        return ApellidoMat;
    }

    public void setApellidoMat(String ApellidoMat) {
        this.ApellidoMat = ApellidoMat;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNumeroExt() {
        return NumeroExt;
    }

    public void setNumeroExt(String NumeroExt) {
        this.NumeroExt = NumeroExt;
    }

    public String getNumeroInt() {
        return NumeroInt;
    }

    public void setNumeroInt(String NumeroInt) {
        this.NumeroInt = NumeroInt;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTelefono2() {
        return Telefono2;
    }

    public void setTelefono2(String Telefono2) {
        this.Telefono2 = Telefono2;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getHabilitado() {
        return Habilitado;
    }

    public void setHabilitado(String Habilitado) {
        this.Habilitado = Habilitado;
    }

    public String getSesiones() {
        return Sesiones;
    }

    public void setSesiones(String Sesiones) {
        this.Sesiones = Sesiones;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getFin_validez() {
        return fin_validez;
    }

    public void setFin_validez(String fin_validez) {
        this.fin_validez = fin_validez;
    }

    public String getInicio_validez() {
        return inicio_validez;
    }

    public void setInicio_validez(String inicio_validez) {
        this.inicio_validez = inicio_validez;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getClave_pais() {
        return clave_pais;
    }

    public void setClave_pais(String clave_pais) {
        this.clave_pais = clave_pais;
    }

    public String getUsuario_sap() {
        return usuario_sap;
    }

    public void setUsuario_sap(String usuario_sap) {
        this.usuario_sap = usuario_sap;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }
}
