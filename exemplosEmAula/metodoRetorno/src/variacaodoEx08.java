import java.util.Scanner;

public class variacaodoEx08 {
    public static double calcularMedia(double notaUm,double notaDois, double notaTres){
        double media = (notaUm+notaDois+notaTres)/3;
        if(notaUm<0 || notaUm>10 || notaDois<0 || notaDois>10 || notaTres<0 || notaTres>10){
            return  0;
        }

        return media;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        double notaUm = input.nextDouble();
        System.out.println("Informe sua segunda nota: ");
        double notaDois = input.nextDouble();
        System.out.println("Informe sua terceira nota: ");
        double notaTres = input.nextDouble();

        double media = calcularMedia (notaUm,notaDois,notaTres);
        System.out.println(media);
    }
}
