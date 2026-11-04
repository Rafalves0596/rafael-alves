public class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
       setNomeTitular(nomeTitular);
       setSaldo(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if(nomeTitular == null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Nome de titular errado.");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacarDinheiro(double valorSaque){
        if (valorSaque <= 0 || valorSaque > saldo ){
            throw new IllegalArgumentException("Não é possível sacar este valor.");
        }
        saldo -= valorSaque;
    }

    public void depositarDinheiro (double valorDeposito){
        if(valorDeposito <=0){
            throw new IllegalArgumentException("Valor Inválido.");
        }
        saldo+=valorDeposito;
    }

    public void transferirDinheiro (double valorTrans, Conta contaDestino){
        if(valorTrans <=0 || contaDestino == null){
            throw new IllegalArgumentException("Valor ou usuário inválidos.");
        }
        saldo -= valorTrans;
        contaDestino.depositarDinheiro(valorTrans);
    }



    public double simularInvestimento(double valorInvestido, int tempo){
        if(tempo <=0 || valorInvestido<=0){
            throw new IllegalArgumentException("Valor ou tempo investidos inválidos.");
        }
        return valorInvestido*Math.pow(1.01, tempo);


    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
