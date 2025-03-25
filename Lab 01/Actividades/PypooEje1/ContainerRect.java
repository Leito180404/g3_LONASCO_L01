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

    
   
}
