package Metodos;

public class Persona {
    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("hola, mi nombre es " + getNombre());
    }

}
