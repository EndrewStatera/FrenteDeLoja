public class App {
    public static void main(String args[]) {
        CatalogoProdutos catalogo = new CatalogoProdutos();
        catalogo.cadastraProduto(new Produto(10, "Notebook", 5000));
        catalogo.cadastraProduto(new Produto(20, "Smart TV", 2000));
        catalogo.cadastraProduto(new Produto(30, "Smartphone", 3000));
        catalogo.cadastraProduto(new Produto(40, "Video game", 2000));

        // System.out.println(catalogo.getProduto(20));
        // System.out.println(catalogo.getProduto(30));

        Estoque estoque = new Estoque();
        estoque.adicionaProduto(catalogo.getProduto(10), 5);
        estoque.adicionaProduto(catalogo.getProduto(20), 15);
        estoque.adicionaProduto(catalogo.getProduto(30), 10);

        System.out.println(estoque.getQuantidadeDisponivel(20));
        System.out.println(estoque.getQuantidadeDisponivel(40));

        System.out.println("\n\nEstoque");
        estoque.printEstoque();
        boolean removido = estoque.removeProduto(10);
        System.out.println("\n\nEstoque delete:");
        System.out.println(removido);
        estoque.printEstoque();

        System.out.println("Smart TV disponiveis : "+estoque.getQuantidadeDisponivel(20));
        System.out.println(estoque.repoemEstoque(20, 20));
        System.out.println("Smart TV disponiveis pós reposicao : "+estoque.getQuantidadeDisponivel(20));

    }
}
