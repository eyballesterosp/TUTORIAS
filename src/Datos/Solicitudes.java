package Datos;

import java.io.Serializable;

public class Solicitudes implements Serializable {

    private String nombreRemitente, nombreDestinatario, solicitud, respuesta;
    private long idSolicitud;

    public Solicitudes(String nombreRemitente, String nombreDestinatario, String solicitud, String respuesta, long idSolicitud) {
        this.nombreRemitente = nombreRemitente;
        this.nombreDestinatario = nombreDestinatario;
        this.solicitud = solicitud;
        this.respuesta = respuesta;
        this.idSolicitud = idSolicitud;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
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

    public long getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

}
