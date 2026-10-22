public class MateriaisConstrucao {
    private String Marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public MateriaisConstrucao(String marca, String modelo, double preco, int quantidade) {
        Marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Marca não inserida.");
        }
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Modelo não inserido.");
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <=0){
            throw new IllegalArgumentException("Não é possível inserir esse valor.");
        }
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "MateriaisConstrucao{" +
                "Marca='" + Marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
