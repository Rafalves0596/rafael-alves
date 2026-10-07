public class RetanguloClasse {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(10.0,5.0);
        Retangulo r2 = new Retangulo(6.0,9.0);

        RetanguloLista l1 = new RetanguloLista();
        l1.AdicionarRetangulo(r1);
        l1.AdicionarRetangulo(r2);
        System.out.println(l1.obterMaiorAreaRetangulo());
        System.out.println(l1.obterMaiorPerimetroRetangulo());

    }
}
