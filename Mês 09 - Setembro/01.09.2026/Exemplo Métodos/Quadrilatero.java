public class Quadrilatero {

// Atributos que representam as dimensões do quadrilátero.

// Altura do quadrilátero.
	double altura;

// Largura do quadrilátero.
	double largura;

	/**
	 * Calcula e retorna o perímetro do quadrilátero.
	 *
	 * O perímetro é calculado somando todos os lados. Como estamos considerando um
	 * quadrilátero com lados correspondentes, podemos utilizar a fórmula:
	 *
	 * (largura + altura) * 2
	 *
	 * @return o perímetro do quadrilátero
	 */
	public double obterPerimetro() {

		// Soma a largura com a altura e multiplica o resultado por 2.
		return (largura + altura) * 2;
	}

}