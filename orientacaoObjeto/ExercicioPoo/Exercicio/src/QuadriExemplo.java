public class QuadriExemplo {
    public static void main(String[] args) {
        Quadrilatero q1 = new Quadrilatero();
        q1.altura = 3;
        q1.largura = 2.5;
        System.out.println(q1.obterPerimetro());
        System.out.println(" ");

        Quadrilatero q2 = new Quadrilatero();
        q2.altura = 6;
        q2.largura = 7;
        System.out.println(q2.obterPerimetro());
    }
}
