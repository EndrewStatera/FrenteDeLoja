package FrenteDeLoja.src;
public class ItemVenda {
    static int contador;
    int numero;
    Produto produto;
    double precoUnitario;
    int quantidade;
    public ItemVenda( int numero, Produto produto, int quantidade){
        this.numero = numero;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPrecoUnitario();
        
    }
    public int getNumero() {
        return numero;
    }
   
    public Produto getProduto() {
        return produto;
    }
   
    public double getPrecoUnitario() {
        return precoUnitario;
    }
   
    public int getQuantidade() {
        return quantidade;
    }
    
}
