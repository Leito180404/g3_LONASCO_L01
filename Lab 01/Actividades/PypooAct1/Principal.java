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

        System.out.println("Ingrese la primera coordenada de una esquina del segundo rectangulo ");
        double x1b = sc.nextDouble();
        double y1b = sc.nextDouble();

        System.out.println("Ingrese la segunda coordenada de la segunda esquina del segundo rectangulo ");
        double x2b = sc.nextDouble();
        double y2b = sc.nextDouble();

        Coordenada c1b = new Coordenada(x1b,y1b);
        Coordenada c2b = new Coordenada(x2b,y2b);
        Rectangulo B = new Rectangulo(c1b, c2b);

        System.out.println("Informacion del rectangulo A: " + A.toString());
        System.out.println("Informacion del rectangulo B: " + B.toString());

        String resultado = Verificador.verificarRectangulos(A, B);
        System.out.println(resultado);

        if (resultado.equals("rectangilos A y B se sobreponen")){
        }
    }

}
