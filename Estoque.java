package FrenteDeLoja.src;
import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> itens;

    public Estoque() {
        itens = new ArrayList<ItemEstoque>();
    }

    public boolean adicionaProduto(Produto produto, int quantidadeInicial) {
        if (produto == null)
            return false;

        if (quantidadeInicial < 0)
            return false;

        return itens.add(new ItemEstoque(produto, quantidadeInicial));
    }

    private ItemEstoque getItem(int codigo) {
        for (ItemEstoque item : itens) {
            if (item.getProduto().getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }

    public int getQuantidadeDisponivel(int codigo) {
        ItemEstoque item = getItem(codigo);
        if (item == null)
            return -1;

        return item.getQuantidadeDisponivel();
    }

    public boolean baixaEstoque(int codigo, int quantidade) {
        ItemEstoque item = getItem(codigo);
        if (item == null)
            return false;

        return item.baixaEstoque(quantidade);
    }

    public boolean repoemEstoque(int codigo, int quantidade) {
        if (quantidade < 0) {
            return false;
        }
        ItemEstoque item = getItem(codigo);
        if (item == null)
            return false;
        else {
            item.reposicaoEstoque(quantidade);
            return true;
        }

    }

    public boolean removeProduto(int codigo) {
        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).getProduto().getCodigo() == codigo){
                itens.remove(i);
                return true;
            }
        }
        return false;
        // ItemEstoque item = getItem(codigo);
        // if (item == null)
        //     return false;
        // itens.remove(codigo);
        // return true;
    }

    public void printEstoque(){
        for(ItemEstoque itemEstoque : itens){
            System.out.println(itemEstoque.getProduto().getCodigo());
        }
    }

}
