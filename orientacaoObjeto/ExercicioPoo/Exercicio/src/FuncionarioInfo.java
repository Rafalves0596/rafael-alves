public class FuncionarioInfo {
    public static void main(String[] args) {
        Funcionario info = new Funcionario();

       info.identidade = "1123";
       info.nome = "Rafael";
       info.sobrenome = "Alves";
       info.salario = 2100.00;
        System.out.println(info.calcularSalarioAnual());
        System.out.println(info.obterNomeCompleto());
        info.modificaSalario(10);
    }
}
