public class Main {

    public static void main(String[] args) {

        // retornos
        double areaQuadrado = QuadrilateroRetorno.area(2);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(2, 3);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(5, 2, 3);
        System.out.println("Área do trapezio: " + areaTrapezio);

        ;

    }

}