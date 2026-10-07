import java.util.Scanner;

//1)
//Faça um programa em que o usuário entre com um número de 1 a 4
//Com o número 1 sendo verão, 2 sendo outono...
//Dependendo de o que o usuário informa, imprima:
//É verão
//E o tempo está quente
//Ou
//É inverno
//E está frio
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a estação do ano: ");
        int estacao = input.nextInt();

        if(estacao == 1 ){
            imprimirVerao();
        } else if(estacao == 2){
            imprimirOutono();
        } else if(estacao == 3){
            imprimirPrimavera();
        } else if(estacao == 4){
            imprimirInverno();
        }

        }
    public static void imprimirVerao(){
        System.out.println(" É verão \n E está Quente.");
    }
    public static void imprimirOutono(){
        System.out.println(" É Outono \n As folhas tão caindo.");
    }
    public static void imprimirPrimavera(){
        System.out.println(" É primavera \n E óia as florzinha ai.");
    }
    public static void imprimirInverno(){
        System.out.println(" É inverno \n E tá gelado.");
    }

    }
