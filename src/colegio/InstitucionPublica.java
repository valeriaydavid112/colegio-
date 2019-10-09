
package colegio;

import java.util.Date;

public class InstitucionPublica extends Colegio{
    private int numeroDePersonalTecnico;
    private Date fechaDeIncripcion;
    private String nombreDelColegio;

    public InstitucionPublica(int numeroDePersonalTecnico, Date fechaDeIncripcion, String nombreDelColegio, int numeroDeEstudiantes, Date fechaDeMatriculas, Boolean mixto, String nombre, int nuemroDeProdesores) {
        super(numeroDeEstudiantes, fechaDeMatriculas, mixto, nombre, nuemroDeProdesores);
        this.numeroDePersonalTecnico = numeroDePersonalTecnico;
        this.fechaDeIncripcion = fechaDeIncripcion;
        this.nombreDelColegio = nombreDelColegio;
    }

    public void renombrarColegio(String nuevoNombre){
    this.nombreDelColegio = nuevoNombre;
    }
    
    public void renombrarColegio(String nuevoNombre, String especialidad){
    this.nombreDelColegio = nuevoNombre " de " + especialidad;
    }
   
    public int getNumeroDePersonalTecnico(){
        return numeroDePersonalTecnico;
    }
     public void setNumeroDePersonalTecnico(int NumeroDePersonalTecnico){
         this.numeroDePersonalTecnico = numeroDePersonalTecnico;  
    }

    public Date getFechaDeIncripcion() {
        return fechaDeIncripcion;
    }

    public void setFechaDeIncripcion(Date fechaDeIncripcion) {
        this.fechaDeIncripcion = fechaDeIncripcion;
    }

    public String getNombreDelColegio() {
        return nombreDelColegio;
    }

    public void setNombreDelColegio(String nombreDelColegio) {
        this.nombreDelColegio = nombreDelColegio;
    }
     
}
