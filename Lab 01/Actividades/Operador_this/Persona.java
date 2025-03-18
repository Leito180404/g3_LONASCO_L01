package Operador_this;

public class Persona {
    private String nombre;

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void mostrarNombre(){
        System.out.println("Mi nombre es " + this.nombre);
    }
}
