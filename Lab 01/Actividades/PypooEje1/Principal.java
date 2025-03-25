import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ContainerRect container = new ContainerRect(10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las coordenadas para el rectángulo " + (i + 1));
        
            System.out.println("Ingrese la primera coordenada de una esquina del rectángulo:");
            double x1a = sc.nextDouble();
            double y1a = sc.nextDouble();
            System.out.println("Ingrese la segunda coordenada de la segunda esquina del rectángulo:");
            double x2a = sc.nextDouble();
            double y2a = sc.nextDouble();

            Coordenada c1a = new Coordenada(x1a, y1a);
            Coordenada c2a = new Coordenada(x2a, y2a);
            Rectangulo A = new Rectangulo(c1a, c2a);

            container.addRectangulo(A);

            System.out.println("Rectángulo agregado. ¡Puede seguir agregando rectángulos!");
    }
    container.toString();

        System.out.println("Informacion del rectangulo A: " + A.toString());
        System.out.println("Informacion del rectangulo B: " + B.toString());

        if (Verificador.esSobrePos(A, B)) {
            System.out.println("Los rectangulos estans sobrepuestos.");
            Rectangulo sobreposicion = rectanguloSobre(A, B);
            System.out.println("area de la sobreposicion: " + sobreposicion.calculoArea());
        } else if (Verificador.esJunto(A, B)) {
            System.out.println("Los rectangulos A y B estan juntos.");
        } else if (Verificador.esDisjunto(A, B)) {
            System.out.println("Los rectangulos estan separados");
        }
        sc.close();
    }

}
