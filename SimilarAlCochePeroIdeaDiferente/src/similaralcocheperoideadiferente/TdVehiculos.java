/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similaralcocheperoideadiferente;

/**
 *
 * @author edmundo
 */
public class TdVehiculos  extends TpVehiculo{
    
    private String tve;
    private String Medio;
    private int gas;
    
    /**
    * <h3>Constructor</h3>
    * Este constructor inicializa la clase con solo el tipo de vehiculo
    * 
    * @param tve String del tipo de vehiculo
    */
    //Ejemplo de clase vacia
    public TdVehiculos (String tve){
        this.tve=tve;
        this.Medio="Tierra";
        this.gas=0;
    }
    
    /**
    * <h3>Constructor</h3>
    * Este constructor inicializa la clase con el tipo, la gasolina que tiene y el medio por donde se mueve
    * Regularmente un tanque puede ser llenado hasta los 20 lts;
    * 
    * @param tve Tipo vehiculo
    * @param gas Número que señala cuantos litros tiene el tanque 
    * @param Medio Como se transporta
    * @throws java.lang.Exception
    */
    
    public TdVehiculos(String tve,String Medio,int gas) throws Exception{
        if(gas<0||gas>20){
            throw new Exception();
        }
        this.tve=tve;
        this.Medio=Medio;
        this.gas=gas;
    }
    //Ejemplo de sobreescritura de método abstracto
    
    /**
    * <h3>Ver Tipo de vehiculo</h3>
    * Implementacion del método abstracto tipo de TpVehiculo, reasigna al tipo de vehiculo
    * e imprime la el vehiculo en pantalla
    * 
    * @param TpV Tipo del vehiculo
    */
   @Override
    public void tipo(String TpV) {
        this.setNombrep(TpV);
        System.out.println("Usted tiene un"+TpV);
    }
    
    /**
    * <h3>Ver el medio donde se mueve</h3>
    * Imprime que tipo de vehiculo es
    */
    public void Inicio(){
        if(this.Medio.equalsIgnoreCase("carro")||this.Medio.equalsIgnoreCase("camion")||this.Medio.equalsIgnoreCase("trailer")){
            this.Medio="Tierra";
            System.out.println("Se mueve por" + this.Medio);
        }else{
            if(this.Medio.equalsIgnoreCase("barco")||this.Medio.equalsIgnoreCase("yate")||this.Medio.equalsIgnoreCase("bote")){
            this.Medio="Mar/agua";
            System.out.println("Se mueve por" + this.Medio);
            }else{
               this.Medio="Aire";
            System.out.println("Se mueve por" + this.Medio); 
            }
        }
    }
    
    //Getterz y Setters
    public String getMedio() {
        return Medio;
    }
    public void setMedio(String Medio) {
        this.Medio = Medio;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}
