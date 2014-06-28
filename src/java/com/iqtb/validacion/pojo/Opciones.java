package com.iqtb.validacion.pojo;
// Generated 23-jun-2014 17:36:10 by Hibernate Tools 3.6.0



/**
 * Opciones generated by hbm2java
 */
public class Opciones  implements java.io.Serializable {


     private Integer idOpcion;
     private int idPestania;
     private String opcion;
     private String href;
     private String descripcion;
     private String tipo;

    public Opciones() {
    }

	
    public Opciones(int idPestania, String opcion) {
        this.idPestania = idPestania;
        this.opcion = opcion;
    }
    public Opciones(int idPestania, String opcion, String href, String descripcion, String tipo) {
       this.idPestania = idPestania;
       this.opcion = opcion;
       this.href = href;
       this.descripcion = descripcion;
       this.tipo = tipo;
    }
   
    public Integer getIdOpcion() {
        return this.idOpcion;
    }
    
    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }
    public int getIdPestania() {
        return this.idPestania;
    }
    
    public void setIdPestania(int idPestania) {
        this.idPestania = idPestania;
    }
    public String getOpcion() {
        return this.opcion;
    }
    
    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    public String getHref() {
        return this.href;
    }
    
    public void setHref(String href) {
        this.href = href;
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


