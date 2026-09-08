public class CirculoCalculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        Circulo c4 = new Circulo();

        c1.raio = 1;
        c2.raio = 2.5;
        c3.raio = 5;
        c4.raio = 6.7;

        System.out.println("Área do círculo 1: "+c1.calcularArea());
        System.out.println("Área do círculo 2: "+c2.calcularArea());
        System.out.println("Área do círculo 3: "+c3.calcularArea());
        System.out.println("Área do círculo 4: "+c4.calcularArea());
    }
}
