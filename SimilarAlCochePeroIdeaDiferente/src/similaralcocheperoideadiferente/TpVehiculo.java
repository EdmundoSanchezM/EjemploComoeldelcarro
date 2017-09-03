/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similaralcocheperoideadiferente;

/**
 * <h1>TpVehiculo</h1>
 * 
 * <p>Clase abstracta que sirve para cualquier tipo de vehiculo</p>
 * 
 * @author Sanchez Mendez Edmundo Josue
 * @version 1.0.0
 * @since 02-09-2017
 */
public abstract class TpVehiculo {
    /**
    * <h3>Tipo de Vehiculo<h3>
    * 
    * Método abstracto para implementar el tipo de vehiculo
    */
    private String TpV;

    public abstract void tipo(String TpV);

    public String getTpV() {
        return TpV;
    }

    public void setNombrep(String TpV) {
        this.TpV = TpV;
    }
}