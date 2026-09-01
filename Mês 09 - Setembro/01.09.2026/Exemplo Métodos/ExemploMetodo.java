public class ExemploMetodo {

// O método main é o ponto de início da execução do programa.
	public static void main(String[] args) {

		// Criando um objeto chamado q1 a partir da classe Quadrilatero.
		//
		// "new Quadrilatero()" cria uma nova instância da classe.
		Quadrilatero q1 = new Quadrilatero();

		// Definindo a altura do quadrilátero q1.
		q1.altura = 5;

		// Definindo a largura do quadrilátero q1.
		q1.largura = 4.5;

		// Criando um segundo objeto da classe Quadrilatero.
		//
		// q1 e q2 são objetos diferentes e possuem
		// seus próprios valores de altura e largura.
		Quadrilatero q2 = new Quadrilatero();

		// Definindo a altura do quadrilátero q2.
		q2.altura = 8;

		// Definindo a largura do quadrilátero q2.
		q2.largura = 6;

		// Chamando o método obterPerimetro() do objeto q2.
		//
		// O método utiliza os valores de altura e largura
		// que foram definidos dentro do próprio objeto q2.
		//
		// Como o método retorna um valor do tipo double,
		// podemos passar o resultado diretamente para o println.
		System.out.println(q2.obterPerimetro());

	}

}