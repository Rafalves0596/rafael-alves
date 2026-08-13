import java.util.Scanner;

//3)
//Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20
//números que vem após esse número
//(O parâmetro do método deve ser o número inserido pelo usuário)
public class Ex03 {
    public static void  imprimirNumeros(int numero){
        for(int i=0; i<20;i++){
            numero = numero+1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
         int numero = input.nextInt();

    }


}
