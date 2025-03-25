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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRec; i++) {
            sb.append("Rectángulo ").append(i + 1).append(": ")
              .append(rectangulos[i].toString()).append("   ")
              .append("Distancia: ").append(String.format("%.3f", distancias[i])).append("   ")
              .append("Área: ").append(String.format("%.2f", areas[i])).append("\n");
        }
        return sb.toString();
    }

    public int getNumRec() {
        return numRec;
    }

    public int getMaxRectangulos() {
        return n;
    }

}
