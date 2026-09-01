public class MercadoObjetos {
    public static void main(String[] args) {
        Mercado  unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nome = "Giassi";
        unidadeDeBlumenau.macasVendidas = 300;
        unidadeDeBlumenau.precoMacas = 2.57;
        unidadeDeBlumenau.laranjasVendidas = 200;
        unidadeDeBlumenau.precoLaranjas = 3.65;
        System.out.println("Mercado: "+ unidadeDeBlumenau.nome);
        System.out.println("Maçãs Vendidas: "+unidadeDeBlumenau.macasVendidas+"\nLaranjasVendidas "+ unidadeDeBlumenau.laranjasVendidas);
        System.out.println("Preço das Maçã: R$"+unidadeDeBlumenau.precoMacas+"\nPreço da Laranja: R$"+unidadeDeBlumenau.precoLaranjas);
        System.out.println(" ");

        Mercado  unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nome = "Superville";
        unidadeDeJoinville.macasVendidas = 200;
        unidadeDeJoinville.precoMacas = 3.53;
        unidadeDeJoinville.laranjasVendidas = 400;
        unidadeDeJoinville.precoLaranjas = 2.00;
        System.out.println("Mercado: "+ unidadeDeJoinville.nome);
        System.out.println("Maçãs Vendidas: "+unidadeDeJoinville.macasVendidas+"\nLaranjasVendidas "+ unidadeDeJoinville.laranjasVendidas);
        System.out.println("Preço das Maçã: R$"+unidadeDeJoinville.precoMacas+"\nPreço da Laranja: R$"+unidadeDeJoinville.precoLaranjas);
        System.out.println(" ");

        Mercado  unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nome = "Angeloni";
        unidadeDeFlorianopolis.macasVendidas = 500;
        unidadeDeFlorianopolis.precoMacas = 4.52;
        unidadeDeFlorianopolis.laranjasVendidas = 500;
        unidadeDeFlorianopolis.precoLaranjas = 3.78;
        System.out.println("Mercado: "+ unidadeDeFlorianopolis.nome);
        System.out.println("Maçãs Vendidas: "+unidadeDeFlorianopolis.macasVendidas+"\nLaranjasVendidas "+ unidadeDeFlorianopolis.laranjasVendidas);
        System.out.println("Preço das Maçã: R$"+unidadeDeFlorianopolis.precoMacas+"\nPreço da Laranja: R$"+unidadeDeFlorianopolis.precoLaranjas);

    }
}
