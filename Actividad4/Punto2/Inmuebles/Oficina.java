package Inmuebles;
/**
* Esta clase denominada Oficina modela un tipo específico de local 
* con atributos como el valor por área y un valor booleano para 
* determinar si pertenece o no al gobierno.
* @version 1.2/2020
*/
public class Oficina extends Local {
    
    protected static double valorArea = 3500000;    
    protected boolean esGobierno;
   
    public Oficina(int identificadorInmobiliario, int área, String 
    dirección, tipo tipoLocal, boolean esGobierno) {
        
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.esGobierno = esGobierno;
    }

    void imprimir() {
        super.imprimir(); 
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
