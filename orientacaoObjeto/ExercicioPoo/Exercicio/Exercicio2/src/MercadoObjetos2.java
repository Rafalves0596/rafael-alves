public class MercadoObjetos2 {
    public static void main(String[] args) {

        Mercado2  unidadeDeBlumenau = new Mercado2("Giassi",300,2.57,200,3.65);
        unidadeDeBlumenau.nome = "Giassi";
        unidadeDeBlumenau.macasVendidas = 300;
        unidadeDeBlumenau.precoMacas = 2.57;
        unidadeDeBlumenau.laranjasVendidas = 200;
        unidadeDeBlumenau.precoLaranjas = 3.65;

        Mercado2  unidadeDeJoinville = new Mercado2("Superville",200,3.53,400,2.00);
        unidadeDeJoinville.nome = "Superville";
        unidadeDeJoinville.macasVendidas = 200;
        unidadeDeJoinville.precoMacas = 3.53;
        unidadeDeJoinville.laranjasVendidas = 400;
        unidadeDeJoinville.precoLaranjas = 2.00;


        Mercado2  unidadeDeFlorianopolis = new Mercado2("Angeloni",500,4.52,500,3.78);
        unidadeDeFlorianopolis.nome = "Angeloni";
        unidadeDeFlorianopolis.macasVendidas = 500;
        unidadeDeFlorianopolis.precoMacas = 4.52;
        unidadeDeFlorianopolis.laranjasVendidas = 500;
        unidadeDeFlorianopolis.precoLaranjas = 3.78;

        Mercado2 mercados[] = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};
        Mercado2 mercadoMaiorReceitaMacas = null;

        double maiorReceitaMacas = 0;
        for(int i=0; i<mercados.length; i++){
            if(mercados[i].calcularReceitaMaca()>maiorReceitaMacas) {
                maiorReceitaMacas = mercados[i].calcularReceitaMaca();
                mercadoMaiorReceitaMacas = mercados[i];
            }
        }
        System.out.println("Maior receita de maças: R$"+maiorReceitaMacas +" do mercado "+mercadoMaiorReceitaMacas.nome);

        double menorReceitaLaranjas = Double.MAX_VALUE;
        Mercado2 mercadorMenorReceitaLaranja = null;
        for(int i=0; i<mercados.length; i++){
            if(mercados[i].calcularReceitaLaranjas()<menorReceitaLaranjas) {
                menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();
                mercadorMenorReceitaLaranja = mercados[i];
            }
        }
        System.out.println("Menor receita de laranjas: R$"+menorReceitaLaranjas +" do mercado "+mercadorMenorReceitaLaranja.nome);
    }
}
