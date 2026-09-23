public class Contribuinte {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Erro, insira um nome.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        if(cpf == null || cpf.isBlank() || cpf.length()!=11){
            throw new IllegalArgumentException("Erro,CPF inválido.");
        } else {
        this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf){
        if(uf == null || uf.isBlank()||uf.length()!=2){
            throw new IllegalArgumentException("Erro, informe sua Unidade Federal.");
        }
        this.uf = uf;
    }

    public double getRendaAnual(){
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual){
        if(rendaAnual<0){
            throw new IllegalArgumentException("Erro, valor inválido.");

        }
        this.rendaAnual = rendaAnual;
    }

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf); ;
        setUf(uf);
        setRendaAnual(rendaAnual);

    }
    public double calcularImposto(){
        return rendaAnual*calcularAliquota();
    }

    public double calcularAliquota(){
        if(rendaAnual<=4000){
            return 0;

        } else if(rendaAnual<=9000){
            return rendaAnual*0.0058;

        } else if(rendaAnual<=25000){
            return rendaAnual*0.15;

        } else if(rendaAnual<=35000){
            return rendaAnual*0.275;

        } else {
            return rendaAnual*0.3;
        }
    }

}
