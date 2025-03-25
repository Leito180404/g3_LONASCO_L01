public class Verificador {
    public static String verificarRectangulos(Rectangulo A, Rectangulo B){
        Coordenada a1 = A.getEsquina1();
        Coordenada a2 = A.getEsquina2();
        Coordenada b1 = B.getEsquina1();
        Coordenada b2 = B.getEsquina2();

        double minrecAx = Math.min(a1.getX(), a2.getX());
        double maxrecAx = Math.max(a1.getX(), a2.getX());
        double minrecAy = Math.min(a1.getY(), a2.getY());
        double maxrecAy = Math.max(a1.getY(), a2.getY());
        
        double minrecBx = Math.min(b1.getX(), b2.getX());
        double maxrecBx = Math.max(b1.getX(), b2.getX());
        double minrecBy = Math.min(b1.getY(), b2.getY());
        double maxrecBy = Math.max(b1.getY(), b2.getY());

        if ((maxrecAx > minrecBx && maxrecBx > minrecAx && maxrecAy > minrecBy && maxrecBy > minrecAy)){
            return "Rectangulos A y B se sobreponen";
        }

        if ((maxrecAx == minrecBx || maxrecBx == minrecAx) && (maxrecAy > minrecBy && maxrecBy > minrecAy)
         || (maxrecAy == minrecBy || maxrecBy == minrecAy) && (maxrecAx > minrecBx && maxrecBx > minrecAx)){
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
