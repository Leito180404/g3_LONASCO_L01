import java.util.*;

public class Principal {

    public static Rectangulo rectanguloSobre(Rectangulo A, Rectangulo B) {
        Coordenada a1 = A.getEsquina1();
        Coordenada a2 = A.getEsquina2();
        Coordenada b1 = B.getEsquina1();
        Coordenada b2 = B.getEsquina2();

        double minX = Math.max(Math.min(a1.getX(), a2.getX()), Math.min(b1.getX(), b2.getX()));
        double maxX = Math.min(Math.max(a1.getX(), a2.getX()), Math.max(b1.getX(), b2.getX()));
        double minY = Math.max(Math.min(a1.getY(), a2.getY()), Math.min(b1.getY(), b2.getY()));
        double maxY = Math.min(Math.max(a1.getY(), a2.getY()), Math.max(b1.getY(), b2.getY()));
    }

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
