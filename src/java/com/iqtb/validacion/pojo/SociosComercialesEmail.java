package com.iqtb.validacion.pojo;
// Generated 18-jul-2014 19:02:45 by Hibernate Tools 3.6.0



/**
 * SociosComercialesEmail generated by hbm2java
 */
public class SociosComercialesEmail  implements java.io.Serializable {


     private int idSocioComercial;
     private String email;
     private String asunto;
     private String mensaje;

    public SociosComercialesEmail() {
    }

	
    public SociosComercialesEmail(int idSocioComercial) {
        this.idSocioComercial = idSocioComercial;
    }
    public SociosComercialesEmail(int idSocioComercial, String email, String asunto, String mensaje) {
       this.idSocioComercial = idSocioComercial;
       this.email = email;
       this.asunto = asunto;
       this.mensaje = mensaje;
    }
   
    public int getIdSocioComercial() {
        return this.idSocioComercial;
    }
    
    public void setIdSocioComercial(int idSocioComercial) {
        this.idSocioComercial = idSocioComercial;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAsunto() {
        return this.asunto;
    }
    
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public String getMensaje() {
        return this.mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }




}


