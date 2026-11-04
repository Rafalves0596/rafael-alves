public class ContaMain {
    public static void main(String[] args) {
        Conta c1 = new Conta ("Rafael",2341.00);
        Conta c2 = new Conta ("Vitor", 5352.00);
        Conta c3 = new Conta ("Mateus", 7569.00);
        Conta c4 = new Conta ("Eduardo", 6254.00);
        Conta c5 = new Conta ("Zyank", 6423.00);
        Conta c6 = new Conta ("Luiz", 10451.00);

        ContaLista Banco = new ContaLista();
        Banco.adicionarConta(c1);
        Banco.adicionarConta(c2);
        Banco.adicionarConta(c3);
        Banco.adicionarConta(c4);
        Banco.adicionarConta(c5);
        Banco.adicionarConta(c6);
    }
}
