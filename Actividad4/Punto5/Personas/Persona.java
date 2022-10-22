package Personas;
/**
* Esta clase denominada Persona modela una persona que cuenta con 
* los atributos: nombre, apellidos, teléfono y dirección.
* @version 1.2/2020
*/
public class Persona {
    String nombre; 
    String apellidos; 
    String teléfono; 
    String dirección; 
    
    public Persona(String nombre, String apellidos, String teléfono, 
    String dirección) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.teléfono = teléfono;
        this.dirección = dirección;
    }
}
