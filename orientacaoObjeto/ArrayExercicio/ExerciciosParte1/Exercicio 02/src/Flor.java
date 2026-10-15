public class Flor {
    private String nomeFlor;
    private double preco;
    private String nomeCliente;

    public Flor(String nomeFlor, double precoFlor, String nomeCliente) {
       setNomeFlor(nomeFlor);
       setPrecoFlor(preco);
       setNomeCliente(nomeCliente);
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        if(nomeFlor == null || nomeFlor.isBlank()){
            throw new IllegalArgumentException("Nome da flor inválido");
        }
        this.nomeFlor = nomeFlor;
    }

    public double getPrecoFlor() {
        return preco;
    }

    public void setPrecoFlor(double precoFlor) {
        this.preco = precoFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if(nomeCliente == null || nomeCliente.isBlank()){
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Flor{" + "nomeFlor='" + nomeFlor + ", precoFlor=" + preco + ", nomeCliente='" + nomeCliente + '}';
    }
}