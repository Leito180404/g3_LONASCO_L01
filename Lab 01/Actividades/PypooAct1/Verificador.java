public class Verificador {
    public static String verificarRectangulos(Rectangulo A, Rectangulo B){
        Coordenada a1 = A.getEsquina1();
        Coordenada a2 = A.getEsquina2();
        Coordenada b1 = B.getEsquina1();
        Coordenada b2 = B.getEsquina2();

        double minrecAx = Math.min(a1.getX(), a2.getX());
        double maxrecAx = Math.max(a1.getX(), a2.getX());
        double minrecAy = Math.min(a1.getY(), a2.getY());
        double maxrecAy = Math.min(a1.getY(), a2.getY());
        
    }
}
