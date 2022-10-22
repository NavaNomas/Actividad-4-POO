package Inmuebles;
/**
* Esta clase denominada LocalComercial modela un tipo específico de 
* Local destinado para un uso comercial con atributos como el valor 
* por área y el centro comercial al cual pertenece.
* @version 1.2/2020
*/
public class LocalComercial extends Local {
   
    protected static double valorArea = 3000000;
    protected String centroComercial;
    
    public LocalComercial(int identificadorInmobiliario, int área, String 
    dirección, tipo tipoLocal, String centroComercial) {
       
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.centroComercial = centroComercial;
    }
    
    void imprimir() {
        super.imprimir(); 
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}

