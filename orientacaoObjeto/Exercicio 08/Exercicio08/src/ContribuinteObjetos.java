import java.util.Scanner;

public class ContribuinteObjetos {
    public static void main(String[] args) {
        Contribuinte funcionario1 = new Contribuinte("Rafael","12345678910","DF",12000);
        Contribuinte funcionario2 = new Contribuinte("Isabelli","10987654321","SC",7500);
        Contribuinte funcionario3 = new Contribuinte("Jerônimo","23456789101","RS",4200);
        Contribuinte funcionario4 = new Contribuinte("Mateus","34567891011","RJ",3500);
        Contribuinte funcionario5 = new Contribuinte("Sophia","45678910112","MS",10000);

        Contribuinte[] contribuintes = {funcionario1,funcionario2,funcionario3,funcionario4,funcionario5};
        double maiorImposto=0;
        Contribuinte maiorAliquota = null;
        for(int i=0;i<5;i++){
            if(contribuintes[i].calcularAliquota()>maiorImposto){
                maiorImposto = contribuintes[i].calcularAliquota();
                maiorAliquota =contribuintes[i];
            }
        }
        System.out.println(maiorImposto);

        double impostoTotal = 0;
        for(int i=0; i<contribuintes.length; i++){
            impostoTotal += contribuintes[i].calcularAliquota();
        }
        System.out.println("Total de Imposto pago: "+impostoTotal);
    }
}
