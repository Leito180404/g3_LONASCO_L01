public class Verificador {
    public static double[] calcularLimites(Coordenada c1, Coordenada c2) {
        double minX = Math.min(c1.getX(), c2.getX());
        double maxX = Math.max(c1.getX(), c2.getX());
        double minY = Math.min(c1.getY(), c2.getY());
        double maxY = Math.max(c1.getY(), c2.getY());

        return new double[] {minX, maxX, minY, maxY};

        if ((maxrecAx > minrecBx && maxrecBx > minrecAx && maxrecAy > minrecBy && 
        maxrecBy > minrecAy)){
            return "Rectangulos A y B se sobreponen";
        }

        if ((maxrecAx == minrecBx || maxrecBx == minrecAx) && (maxrecAy > minrecBy && 
        maxrecBy > minrecAy)
         || (maxrecAy == minrecBy || maxrecBy == minrecAy) && (maxrecAx > minrecBx && 
         maxrecBx > minrecAx)){
            return "Estan juntos los rectangulos";
         }

         else{
            return "rectangulso disjuntos";
         } 
    }

    public static boolean esSobrePos(Rectangulo A, Rectangulo B){
        
    }

    public static boolean esJunto(Rectangulo A, Rectangulo B){
        
    }

    public static boolean esDisjunto(Rectangulo A, Rectangulo B){

    }
}
