public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private int numRec;
    
    public ContainerRect(int maxRectangulos) {
        this.n = maxRectangulos;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
        this.numRec = 0;
    }

    public void addRectangulo(Rectangulo rectangulo) {
        if (numRec < n) {
            rectangulos[numRec] = rectangulo;
            distancias[numRec] = Coordenada.distancia(rectangulo.getEsquina1(), rectangulo.getEsquina2());

            areas[numRec] = rectangulo.calculoArea();
            numRec++;
        } else {
            System.out.println("limite alcanzado");
        }
    }

    public void mostrarResultados() {
        System.out.println("rectangulos almacenados:");
        for (int i = 0; i < numRec; i++) {
            System.out.println("rectangulo " + (i + 1) + ": " + rectangulos[i].toString());
            System.out.println("distancia Euclidiana: " + distancias[i]);
            System.out.println("area: " + areas[i]);
        }
    }

    public int getNumRec() {
        return numRec;
    }

    public int getMaxRectangulos() {
        return n;
    }
   
}
