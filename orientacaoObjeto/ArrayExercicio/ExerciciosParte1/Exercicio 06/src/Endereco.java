public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String numero_residencia;

    public Endereco(String uf, String cidade, String cep, String logradouro, String numero_residencia) {
        setUf(uf);
        setCidade(cidade);
        setCep(cep);
        setLogradouro(logradouro);
        setNumero_residencia(numero_residencia);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if(uf == null|| uf.isBlank()){
            throw new IllegalArgumentException("Preencha os dados corretamente.");
        }
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade == null|| cidade.isBlank()){
            throw new IllegalArgumentException("Preencha os dados corretamente.");
        }
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep == null|| cep.isBlank()){
            throw new IllegalArgumentException("Preencha os dados corretamente.");
        }
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if(logradouro == null|| logradouro.isBlank()){
            throw new IllegalArgumentException("Preencha os dados corretamente.");
        }
        this.logradouro = logradouro;
    }

    public String getNumero_residencia() {
        return numero_residencia;
    }

    public void setNumero_residencia(String numero_residencia) {
        if(numero_residencia == null|| numero_residencia.isBlank()){
            throw new IllegalArgumentException("Preencha os dados corretamente.");
        }
        this.numero_residencia = numero_residencia;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero_residencia='" + numero_residencia + '\'' +
                '}';
    }
}
