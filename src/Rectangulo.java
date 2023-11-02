public class Rectangulo extends Forma {
    private double base;
    private double altezza;

    public Rectangulo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcularArea() {
        double area = base * altezza;
        System.out.println(area);
    }
}
