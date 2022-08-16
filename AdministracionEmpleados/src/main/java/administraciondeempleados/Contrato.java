package administraciondeempleados;

import java.util.Date;

public class Contrato {
    
    private Boolean tieneContrato;
    private Double tiempoContrato;
    private Date fechaLimite;


    public Contrato(Boolean tieneContrato) {
        this.tieneContrato = tieneContrato;
    }
    
    public Contrato(Boolean tieneContrato, Date fechaLimite) {
        this(tieneContrato);
         this.fechaLimite = fechaLimite;
    }
    
    public Contrato(Boolean tieneContrato, Double tiempoContrato, Date fechaLimite) {
        this(tieneContrato, fechaLimite);
        this.tiempoContrato = tiempoContrato;
    }

    
    //TODO hacer metodo para el calculo del metodo
    
    public Boolean getTieneContrato() {
        return tieneContrato;
    }

    public void setTieneContrato(Boolean tieneContrato) {
        this.tieneContrato = tieneContrato;
    }

    public Double getTiempoContrato() {
        return tiempoContrato;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
    public String tieneContrato(boolean tieneContrato){
        String validacion;
        if(tieneContrato){
            validacion = "SI";
        }else{
            validacion = "NO";
        }
        return validacion;
    }
    
    @Override
    public String toString() {
        return "" + tieneContrato(this.tieneContrato);
    }
    
    
}
