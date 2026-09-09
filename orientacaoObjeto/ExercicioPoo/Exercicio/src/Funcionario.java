public class Funcionario {

    String identidade;
    String nome;
    String sobrenome;
    double salario;


    public double calcularSalarioAnual() {

        return salario * 12;
    }
    public String obterNomeCompleto(){

        return nome+" "+sobrenome;
    }
    public void modificaSalario(double percentualAumento){
        double aumento = salario * percentualAumento/100;
        double salarioFinal = salario + aumento;
        salario = salarioFinal;
    }

}


