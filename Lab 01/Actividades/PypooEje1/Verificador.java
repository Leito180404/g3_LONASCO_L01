public class Verificador {
    public static double[] calcularLimites(Coordenada c1, Coordenada c2) {
        double minX = Math.min(c1.getX(), c2.getX());
        double maxX = Math.max(c1.getX(), c2.getX());
        double minY = Math.min(c1.getY(), c2.getY());
        double maxY = Math.max(c1.getY(), c2.getY());

        return new double[] {minX, maxX, minY, maxY};
    }

    public static boolean esSobrePos(Rectangulo A, Rectangulo B){
        Coordenada a1 = A.getEsquina1();
        Coordenada a2 = A.getEsquina2();
        Coordenada b1 = B.getEsquina1();
        Coordenada b2 = B.getEsquina2();

        double[] limitesA = calcularLimites(a1, a2);
        double[] limitesB = calcularLimites(b1, b2);

        return limitesA[1] > limitesB[0] && limitesB[1] > limitesA[0] && limitesA[3] > limitesB[2] 
        && limitesB[3] > limitesA[2];
    }

    public static boolean esJunto(Rectangulo A, Rectangulo B){
        Coordenada a1 = A.getEsquina1();
        Coordenada a2 = A.getEsquina2();
        Coordenada b1 = B.getEsquina1();
        Coordenada b2 = B.getEsquina2();
        
        double[] limitesA = calcularLimites(a1, a2);
        double[] limitesB = calcularLimites(b1, b2);

        return (limitesA[1] == limitesB[0] || limitesB[1] == limitesA[0]) 
        && (limitesA[3] > limitesB[2] && limitesB[3] > limitesA[2]) || (limitesA[3] == limitesB[2] 
        || limitesB[3] == limitesA[2]) && (limitesA[1] > limitesB[0] && limitesB[1] > limitesA[0]);   
    }

    public static boolean esDisjunto(Rectangulo A, Rectangulo B){
        Coordenada a1 = A.getEsquina1();
        Coordenada a2 = A.getEsquina2();
        Coordenada b1 = B.getEsquina1();
        Coordenada b2 = B.getEsquina2();

        double[] limitesA = calcularLimites(a1, a2);
        double[] limitesB = calcularLimites(b1, b2);

        return limitesA[1] <= limitesB[0] || limitesB[1] <= limitesA[0] || 
        limitesA[3] <= limitesB[2] || limitesB[3] <= limitesA[2];
    }
}
