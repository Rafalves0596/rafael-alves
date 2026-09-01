public class ProdutoObjetos {
    public static void main(String[] args) {
        Produto produtoUm = new Produto();

        produtoUm.nome = "Caderno Escolar";
        produtoUm.descricao = "Um caderno de 256 folhas com a capa preta com o Símbolo do Justiceiro.";
        produtoUm.preco = 19.99;
        produtoUm.desconto = 5.0;
        System.out.println("produto: "+produtoUm.nome+"\ndescricao: "+produtoUm.descricao);
        System.out.println("Preço: R$"+produtoUm.preco+"\ndesconto: "+produtoUm.desconto+"%");
        System.out.println(" ");

        Produto produtoDois = new Produto();
        produtoDois.nome = "Conjunto de Lápis de colorir";
        produtoDois.descricao = "Uma caixinha de lápis coloridos.";
        produtoDois.preco = 21.99;
        produtoDois.desconto = 15.0;
        System.out.println("produto: "+produtoDois.nome+"\ndescricao: "+produtoDois.descricao);
        System.out.println("Preço: R$"+produtoDois.preco+"\ndesconto: "+produtoDois.desconto+"%");
        System.out.println(" ");

        Produto produtoTres = new Produto();
        produtoTres.nome = "Mochila de Rodinhas";
        produtoTres.descricao = "Mochila de rodinhas com 3 bolsos, com a estampa dos Tartarugas Ninjas.";
        produtoTres.preco = 59.99;
        produtoTres.desconto = 10.0;
        System.out.println("produto: "+produtoTres.nome+"\ndescricao: "+produtoTres.descricao);
        System.out.println("Preço: R$"+produtoTres.preco+"\ndesconto: "+ produtoTres.desconto+"%");

    }
}
