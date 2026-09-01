// Classe principal do programa.
// É aqui que vamos criar e utilizar um objeto da classe Produto.
public class Ex3 {

// O método main é o ponto de início da execução do programa.
	public static void main(String[] args) {

		// Criando um objeto chamado produto1 a partir da classe Produto.
		//
		// "Produto" → é o tipo do objeto.
		// "produto1" → é o nome da variável que referencia o objeto.
		// "new Produto()" → cria uma nova instância da classe Produto.
		Produto produto1 = new Produto();

		// Definindo o nome do produto.
		produto1.nome = "Caneta ESF";

		// Definindo a descrição do produto.
		produto1.descricao = "Caneta esferográfica 5mm";

		// Definindo o preço unitário do produto.
		produto1.precoUnitario = 1.2;

		// Definindo o desconto do produto.
		produto1.desconto = 2;

	}
}