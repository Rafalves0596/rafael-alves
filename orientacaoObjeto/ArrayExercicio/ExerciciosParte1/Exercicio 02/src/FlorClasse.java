public class FlorClasse {
    public static void main(String[] args) {
        Flor f1 = new Flor("Rosa",15.50,"Reinaldo");
        Flor f2 = new Flor("Orquídea",6.70,"Maria");
        Flor f3 = new Flor("Margarida",10.00,"João");
        Flor f4 = new Flor("Lírio",7.60,"Reinaldo");

        FlorLista floricultura = new FlorLista();

        floricultura.adicionarFlores(f1);
        floricultura.adicionarFlores(f2);
        floricultura.adicionarFlores(f3);
        floricultura.adicionarFlores(f4);

        System.out.println(floricultura.pesquisarFlores("Reinaldo"));

    }
}
