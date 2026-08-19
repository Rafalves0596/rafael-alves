import java.util.Scanner;
//5)
//Faça um método que receba três números inseridos pelo usuário, esses números
//serão: um número "base" e mais dois outros números que o usuário inseriu
//Imprima qual dos dois últimos números está mais perto do primeiro número "base"

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor base: ");
        int valorBase = input.nextInt();
        System.out.println("Insira outro valor: ");
        int valor1 = input.nextInt();
        System.out.println("Insira mais um valor: ");
        int valor2 = input.nextInt();

        comparaValores(valorBase,valor1,valor2);
    }
    public static void comparaValores(int valorBase, int valor1, int valor2){
        int comparacao = valor1 - valorBase;
        int comparacao2 = valor2 - valorBase;

        if(comparacao>comparacao2){
            System.out.println(valor1+" está mais próximdo do valor base.");
        } else if(comparacao2>comparacao){
            System.out.println(valor2+" é mais próximo do valor base.");
        }

        }
    }

