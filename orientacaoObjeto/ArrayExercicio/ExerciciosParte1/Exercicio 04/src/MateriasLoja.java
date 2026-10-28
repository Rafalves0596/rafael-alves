public class MateriasLoja {
    public static void main(String[] args) {
        Materiais m1 = new Materiais("Larfarge","Argamassa",36.99,300);
        Materiais m2 = new Materiais("Atlas","Tijolo",49.99,500);
        Materiais m3 = new Materiais("Multilaser","Telhas",56.99,200);
        Materiais m4 = new Materiais("Tigre","Sacos de Areia",36.99,250);
        Materiais m5 = new Materiais("DeWalt","Tinta",56.00,350);

        MateriaisLista Produto = new MateriaisLista();
        Produto.adicionarMateriais(m1);
        Produto.adicionarMateriais(m2);
        Produto.adicionarMateriais(m3);
        Produto.adicionarMateriais(m4);
        Produto.adicionarMateriais(m5);

        System.out.println(Produto.produtoMaisCaro("Atlas"));
        System.out.println(Produto.buscarNoEstoque(36.99,47.99,"Tigre"));
    }
}
