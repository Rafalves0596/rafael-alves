//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double somaDeNumeros(double numero1, double numero2){
        double soma = numero1 + numero2;

        return soma;
    }
    public static void main(String[] args) {
        double soma = somaDeNumeros(5,2);

        System.out.println(soma);
        // ou poderia ser System.out.println(somaDeNumeros(5,2));

    }
}