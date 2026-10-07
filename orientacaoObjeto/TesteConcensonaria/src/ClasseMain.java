public class ClasseMain {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Honda","Civic","Qad1234",2010,45000);
        Veiculo v2 = new Veiculo("Ford","EcoSport","Lsd1944",2015,62000);
        Veiculo v3 = new Veiculo("Volkswagen","Gol","Bal3769",2021,67000);
        Veiculo v4 = new Veiculo("Fiat","Argo-Drive","EUA7672",2017,20000);
        Veiculo v5 = new Veiculo("Volkswagen","Fusca","Nig3769",2000,10000);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println(c1.obterMenorPrecoVeiculo());
        Concessionaria c2 = new Concessionaria();
        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);
        c2.adicionarVeiculo(v5);
        System.out.println(c2.obterMenorPrecoVeiculo());
    }
}
