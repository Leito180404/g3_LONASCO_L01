import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de rectangulos que ingresara: ");
        int cantrec = sc.nextInt();
        ContainerRect container = new ContainerRect(cantrec);

        for (int i = 0; i < cantrec; i++) {
            System.out.println("Ingrese las coordenadas para el rectangulo " + (i + 1));
        
            System.out.println("Ingrese la primera coordenada de una esquina del rectangulo:");
            double x1a = sc.nextDouble();
            double y1a = sc.nextDouble();
            System.out.println("Ingrese la segunda coordenada de la segunda esquina del rectangulo:");
            double x2a = sc.nextDouble();
            double y2a = sc.nextDouble();

            Coordenada c1a = new Coordenada(x1a, y1a);
            Coordenada c2a = new Coordenada(x2a, y2a);
            Rectangulo A = new Rectangulo(c1a, c2a);

            boolean sobrepuso = false;
            boolean junto = false;
            boolean disjunto = false;

            for (int j = 0; j < container.getNumRec(); j++) {
                Rectangulo B = container.getRectangulo(j);
                if (Verificador.esSobrePos(A, B)) {
                    sobrepuso = true;
                } else if (Verificador.esJunto(A, B)) {
                    junto = true;
                } else if (Verificador.esDisjunto(A, B)) {
                    disjunto = true;
                }
            }

            if (sobrepuso==true) {
                System.out.println("El rectangulo " + (i + 1) + " se sobrepone con un rectangulo ya almacenado.");
            } else if (junto==true) {
                System.out.println("El rectangulo " + (i + 1) + " esta junto con un rectangulo ya almacenado.");
            } else if (disjunto==true) {
                System.out.println("El rectangulo " + (i + 1) + " es disjunto de un rectangulo ya almacenado.");
            }

            container.addRectangulo(A);

            System.out.println("Rectangulo " + (i + 1) + " agregado correctamente.");
    }
        System.out.println("\nContenido del contenedor de rectangulos:");
        System.out.println(container.toString());
        sc.close();
    }

}
