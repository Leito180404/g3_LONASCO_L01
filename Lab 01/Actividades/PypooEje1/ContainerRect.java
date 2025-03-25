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
   
}
