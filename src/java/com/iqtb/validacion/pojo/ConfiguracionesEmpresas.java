package com.iqtb.validacion.pojo;
// Generated 23-jun-2014 17:36:10 by Hibernate Tools 3.6.0



/**
 * ConfiguracionesEmpresas generated by hbm2java
 */
public class ConfiguracionesEmpresas  implements java.io.Serializable {


     private Integer idConfiguracionEmpresa;
     private int idEmpresa;
     private String propiedad;
     private String valor;
     private String descripcion;
     private String tipo;

    public ConfiguracionesEmpresas() {
    }

    public ConfiguracionesEmpresas(int idEmpresa, String propiedad, String valor, String descripcion, String tipo) {
       this.idEmpresa = idEmpresa;
       this.propiedad = propiedad;
       this.valor = valor;
       this.descripcion = descripcion;
       this.tipo = tipo;
    }
   
    public Integer getIdConfiguracionEmpresa() {
        return this.idConfiguracionEmpresa;
    }
    
    public void setIdConfiguracionEmpresa(Integer idConfiguracionEmpresa) {
        this.idConfiguracionEmpresa = idConfiguracionEmpresa;
    }
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getPropiedad() {
        return this.propiedad;
    }
    
    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}


