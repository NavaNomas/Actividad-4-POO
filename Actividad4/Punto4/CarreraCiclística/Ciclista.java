package CarreraCiclística;

public abstract class Ciclista {
    private int identificador; 
    private String nombre; 
    private int tiempoAcumulado = 0; 

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    
    abstract String imprimirTipo();
    
    protected int getIdentificador() {
        return identificador;
    }
    
    protected void setIdentificador() {
        this.identificador = identificador;
    }
   
    protected String getNombre() {
        return nombre;
    }
   
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    protected int getPosiciónGeneral(int posiciónGeneral) {
        return posiciónGeneral;
    }
   
    protected void setPosiciónGeneral(int posiciónGeneral) {
        posiciónGeneral = posiciónGeneral;
    }
  
    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    
    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
   
    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }
}