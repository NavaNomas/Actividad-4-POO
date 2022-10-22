package Inmuebles;

public class Apartaestudio extends Apartamento {
   
    protected static double valorArea = 1500000;
    
    public Apartaestudio(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {
        super(identificadorInmobiliario, área, dirección, 1, 1);
    }
    /**
    * Método que muestra en pantalla los datos de un apartaestudio
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}

