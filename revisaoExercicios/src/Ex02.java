import java.util.Scanner;

public class Ex02 {
    //2)
    //Faça um método para seus colegas mais próximos
    //O método deve imprimir:
    //O nome dele(a) é [nome]
    //Ele(a) tem [idade] anos
    //Ele(a) é estudante de desenvolvimento de sistemas
    //(Em prints separados)
    //Faça com que o método seja uma expressão verbal com o nome do seu colega.
    //O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
    //executado.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do seu colega: ");
        String colega = input.next();
        if(colega.equals("Isabelli")) {
            imprimirIsabelli();
        } else if (colega.equals("Hercules")){
            imprimirHercules();
        } else if (colega.equals("Daniela")){
            imprimirDaniela();
        }
    }
    public static void imprimirIsabelli(){
        System.out.println("O nome dela é Isabelli.");
        System.out.println("Ela tem 19 anos.");
        System.out.println("Ela é estudante de Desenvolvimento de Sistemas");
    }
    public static void  imprimirHercules(){
        System.out.println("O nome dele é Hércules.");
        System.out.println("Ele tem 18 anos.");
        System.out.println("Ele é estudante de Desenvolvimento de Sistemas");
    }
    public static void  imprimirDaniela(){
        System.out.println("O nome dela é Daniela.");
        System.out.println("Ela tem 37 anos.");
        System.out.println("Ela é estudante de Desenvolvimento de Sistemas");
    }
}
