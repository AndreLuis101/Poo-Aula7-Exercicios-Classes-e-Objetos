package retangulos;

public class App {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(4.5, 2.5, 5, 3);
        double x1 = 2.05;
        double y1 = 3.93474;

        double x2 = 6.92599;
        double y2 = 1.07156;

        double x3 = 4.5;
        double y3 = 2;

        System.out.printf("A area do retangulo é: %.2f", r1.area());
        System.out.println();
        System.out.printf("O perimetro do retangulo é: %.2f", r1.perimetro());
        System.out.println();

        System.out.println(r1.pontoContido(x1, y1));
        System.out.println(r1.pontoContido(x2, y2));
        System.out.println(r1.pontoContido(x3, y3));
    }
}
