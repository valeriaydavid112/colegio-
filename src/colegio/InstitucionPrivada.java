
package colegio;

import java.util.Date;

public class InstitucionPrivada extends Colegio{
    private int CantidadDeSillas;
    private boolean BasuraPorSalones;
    private int ConsumoEnergetico;

    public InstitucionPrivada(int CantidadDeSillas, boolean BasuraPorSalones, int ConsumoEnergetico, int numeroDeEstudiantes, Date fechaDeMatriculas, Boolean mixto, String nombre, int nuemroDeProdesores) {
        super(numeroDeEstudiantes, fechaDeMatriculas, mixto, nombre, nuemroDeProdesores);
        this.CantidadDeSillas = CantidadDeSillas;
        this.BasuraPorSalones = BasuraPorSalones;
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    public void limpiarColegio(){
        this.BasuraPorSalones = false;
    }
    
    public void limpiarColegio(int consumo){
        this.BasuraPorSalones = false;
        this.ConsumoEnergetico += consumo;
    }
    
    public int getCantidadDeSillas() {
        return CantidadDeSillas;
    }

    public void setCantidadDeSillas(int CantidadDeSillas) {
        this.CantidadDeSillas = CantidadDeSillas;
    }

    public boolean isBasuraPorSalones() {
        return BasuraPorSalones;
    }

    public void setBasuraPorSalones(boolean BasuraPorSalones) {
        this.BasuraPorSalones = BasuraPorSalones;
    }

    public int getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public void setConsumoEnergetico(int ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    
}
    
    

