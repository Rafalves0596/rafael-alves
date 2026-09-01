// Classe principal do programa.
// É nela que vamos criar os objetos da classe Mercado
// e preencher seus dados.
public class Ex2 {

// O método main é o ponto de início da execução do programa.
	public static void main(String[] args) {

		// Criando um objeto chamado unidadeJoinville.
		// O "new Mercado()" cria uma nova instância da classe Mercado.
		Mercado unidadeJoinville = new Mercado();

		// Definindo os valores dos atributos do objeto unidadeJoinville.
		unidadeJoinville.nomeMercado = "Giassi";
		unidadeJoinville.macasVendidas = 500;
		unidadeJoinville.precoMaca = 2;
		unidadeJoinville.laranjasVendidas = 400;
		unidadeJoinville.precoLaranja = 2.5;

		// Criando outro objeto da classe Mercado.
		// Agora estamos representando uma unidade localizada em Blumenau.
		Mercado unidadeBlumenau = new Mercado();

		// Cada objeto possui seus próprios valores.
		// Por isso, podemos ter informações diferentes para cada unidade.
		unidadeBlumenau.nomeMercado = "Angeloni";
		unidadeBlumenau.macasVendidas = 450;
		unidadeBlumenau.precoMaca = 1.8;
		unidadeBlumenau.laranjasVendidas = 420;
		unidadeBlumenau.precoLaranja = 2.2;

		// Criando um terceiro objeto da classe Mercado.
		// Esse objeto representa uma unidade em Florianópolis.
		Mercado unidadeFlorianopolis = new Mercado();

		// Definindo os valores dos atributos dessa unidade.
		unidadeFlorianopolis.nomeMercado = "Fort";
		unidadeFlorianopolis.macasVendidas = 500;
		unidadeFlorianopolis.precoMaca = 2;
		unidadeFlorianopolis.laranjasVendidas = 470;
		unidadeFlorianopolis.precoLaranja = 2.4;

		// Exibindo algumas informações da unidade de Blumenau.
		//
		// unidadeBlumenau.nomeMercado
		// → acessa o nome do mercado.
		//
		// unidadeBlumenau.macasVendidas
		// → acessa a quantidade de maçãs vendidas.
		//
		// unidadeBlumenau.precoMaca
		// → acessa o preço da maçã.
		//
		// O operador + é utilizado para juntar textos e valores.
		System.out.println(unidadeBlumenau.nomeMercado + " vendeu " + unidadeBlumenau.macasVendidas + " maçãs a R$"
				+ unidadeBlumenau.precoMaca);

	}
}