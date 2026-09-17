public class Contribuinte {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;
    double aliquota;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.isBlank()){
            System.out.println("Erro, insira um nome.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        if(cpf == null || cpf.isBlank() || cpf.length()!=11){
            System.out.println("Erro,CPF inválido.");
        } else {
        this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf){
        if(uf == null || uf.isBlank()||uf.length()!=2){
            System.out.println("Erro, informe sua Unidade Federal.");
        }
        this.uf = uf;
    }

    public double getRendaAnual(){
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual){
        this.rendaAnual = rendaAnual;
    }

    public double CalculaImposto(){
        if(rendaAnual>=0 || rendaAnual<=4000){
            aliquota = 0;
        } else if(rendaAnual>=4001 || rendaAnual<=9000){
            aliquota = 0.058;
        } else if(rendaAnual>=9001 || rendaAnual<=25000){
            aliquota = 0.15;
        } else if(rendaAnual>=25001 || rendaAnual<=35000){
            aliquota = 0.27;
        } else {
            aliquota = 0.3;
        }

        return rendaAnual*aliquota;
    }

}
