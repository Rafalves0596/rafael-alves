/*2)
 Crie uma classe denominada Mercado.
 Essa classe terá 5 atributos, as informações que deverão ser guardadas são:
 • Nome do mercado
 • Número de maçãs vendidas por ano.
 • Preço de venda das maçãs.
 • Número de laranjas vendidas por ano.
 • Preço de venda das laranja
 Crie 3 objetos de Mercado chamados:
 unidadeDeBlumenau
 unidadeDeJoinville
 unidadeDeFlorianopolis
 Atribua valores a esses objetos e mostre suas informações
*/

public class Mercado2 {
    String nome;
    int macasVendidas;
    double precoMacas;
    int laranjasVendidas;

    @Override
    public String toString() {
        return "Mercado2{" +
                "nome='" + nome + '\'' +
                ", macasVendidas=" + macasVendidas +
                ", precoMacas=" + precoMacas +
                ", laranjasVendidas=" + laranjasVendidas +
                ", precoLaranjas=" + precoLaranjas +
                '}';
    }

    public Mercado2(String nome, int macasVendidas, double precoMacas, int laranjasVendidas, double precoLaranjas) {
        this.nome = nome;
        this.macasVendidas = macasVendidas;
        this.precoMacas = precoMacas;
        this.laranjasVendidas = laranjasVendidas;
        this.precoLaranjas = precoLaranjas;
    }

    double precoLaranjas;

    public double calcularReceitaMaca(){
        return macasVendidas*precoMacas;
    }
    public double calcularReceitaLaranjas(){
        return laranjasVendidas*precoLaranjas;
    }
    public double calcularReceitaGeral(){
        return calcularReceitaMaca()+calcularReceitaLaranjas();
    }

}