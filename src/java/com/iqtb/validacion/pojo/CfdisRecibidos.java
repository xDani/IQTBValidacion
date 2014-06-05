package com.iqtb.validacion.pojo;
// Generated 05-jun-2014 10:57:16 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * CfdisRecibidos generated by hbm2java
 */
public class CfdisRecibidos  implements java.io.Serializable {


     private Integer idCfdiRecibido;
     private int idSocioComercial;
     private int idEmpresa;
     private String serie;
     private Integer folio;
     private String uuid;
     private Date fecha;
     private BigDecimal total;
     private String xmlSat;
     private Date fechaRecepcion;
     private String estado;
     private String error;
     private Byte reportado;

    public CfdisRecibidos() {
    }

	
    public CfdisRecibidos(int idSocioComercial, int idEmpresa, String uuid, Date fecha, BigDecimal total, String xmlSat, Date fechaRecepcion, String estado) {
        this.idSocioComercial = idSocioComercial;
        this.idEmpresa = idEmpresa;
        this.uuid = uuid;
        this.fecha = fecha;
        this.total = total;
        this.xmlSat = xmlSat;
        this.fechaRecepcion = fechaRecepcion;
        this.estado = estado;
    }
    public CfdisRecibidos(int idSocioComercial, int idEmpresa, String serie, Integer folio, String uuid, Date fecha, BigDecimal total, String xmlSat, Date fechaRecepcion, String estado, String error, Byte reportado) {
       this.idSocioComercial = idSocioComercial;
       this.idEmpresa = idEmpresa;
       this.serie = serie;
       this.folio = folio;
       this.uuid = uuid;
       this.fecha = fecha;
       this.total = total;
       this.xmlSat = xmlSat;
       this.fechaRecepcion = fechaRecepcion;
       this.estado = estado;
       this.error = error;
       this.reportado = reportado;
    }
   
    public Integer getIdCfdiRecibido() {
        return this.idCfdiRecibido;
    }
    
    public void setIdCfdiRecibido(Integer idCfdiRecibido) {
        this.idCfdiRecibido = idCfdiRecibido;
    }
    public int getIdSocioComercial() {
        return this.idSocioComercial;
    }
    
    public void setIdSocioComercial(int idSocioComercial) {
        this.idSocioComercial = idSocioComercial;
    }
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public Integer getFolio() {
        return this.folio;
    }
    
    public void setFolio(Integer folio) {
        this.folio = folio;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public String getXmlSat() {
        return this.xmlSat;
    }
    
    public void setXmlSat(String xmlSat) {
        this.xmlSat = xmlSat;
    }
    public Date getFechaRecepcion() {
        return this.fechaRecepcion;
    }
    
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getError() {
        return this.error;
    }
    
    public void setError(String error) {
        this.error = error;
    }
    public Byte getReportado() {
        return this.reportado;
    }
    
    public void setReportado(Byte reportado) {
        this.reportado = reportado;
    }




}


