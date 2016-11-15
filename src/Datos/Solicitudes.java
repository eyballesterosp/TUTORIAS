/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;

public class Solicitudes implements Serializable{
    
        private String nombreDe;
	private String nombrePara;
	private String solicitud;
	private String respuesta;
	private long codigoSolicitud;
        
	public Solicitudes(String nombreDe,String nombrePara,long codigoSolicitud, String solicitud, String respuesta) {
		this.nombreDe=nombreDe;
		this.nombrePara=nombrePara;
		this.solicitud=solicitud;
		this.respuesta=respuesta;
		this.codigoSolicitud=codigoSolicitud;
	}

    public String getNombreDe() {
        return nombreDe;
    }

    public void setNombreDe(String nombreDe) {
        this.nombreDe = nombreDe;
    }

    public String getNombrePara() {
        return nombrePara;
    }

    public void setNombrePara(String nombrePara) {
        this.nombrePara = nombrePara;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public long getCodigoSolicitud() {
        return codigoSolicitud;
    }

    public void setCodigoSolicitud(long codigoSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
    }
}
	
	