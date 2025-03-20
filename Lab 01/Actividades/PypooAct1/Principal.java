import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera coordenada de una esquina del rectangulo ");
        double x1a = sc.nextDouble();
        double y1a = sc.nextDouble();

        System.out.println("Ingrese la segunda coordenada de la segunnda esquina del rectangulo ");
        double x2a = sc.nextDouble();
        double y2a = sc.nextDouble();
        
        Coordenada c1a = new Coordenada(x1a,y1a);
        Coordenada c2a = new Coordenada(x2a,y2a);
        Rectangulo A = new Rectangulo(c1a, c2a);

        
    }

}
