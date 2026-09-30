public class LivroClasse {
    public static void main(String[] args) {
        Livro l1 = new Livro("Star Wars: Aprendiz.",false);
        Livro l2 = new Livro("História da China",true);

        l1.emprestar();
        System.out.println(l1);

        l2.emprestar();
        System.out.println(l2);
    }
}
