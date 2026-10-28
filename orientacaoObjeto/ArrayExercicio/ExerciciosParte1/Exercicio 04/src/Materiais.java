public class Materiais {
    private String Marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public Materiais(String marca, String modelo, double preco, int quantidade) {
       setMarca(marca);
       setModelo(modelo);
       setPreco(preco);
       setQuantidade(quantidade);
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
    public void adicionarProdutoEstoque(int adicionarEstoque){
        if(adicionarEstoque <= 0){
            throw new IllegalArgumentException("Adição inválida.");
        }
        quantidade = quantidade + adicionarEstoque;
    }
    public void venderProduto(int vender){
        if (vender > quantidade){
            throw new IllegalArgumentException("Quantidade de produtos a ser vendida maior que no estoque.");
        }
        quantidade = quantidade - vender;
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
