package FrenteDeLoja.src;

import java.util.ArrayList;

public class Venda {

    private final float IMPOSTO = 0.25f;
    int numero;
    ArrayList<ItemVenda> itens;

    public Venda(int numero) {
        itens = new ArrayList<>();
        this.numero = numero;
    }

    public boolean insereItem(Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            itens.add(new ItemVenda(numero, produto, quantidade));
            return true;
        }
        return false;
    }

    public boolean removeItem(int numero) {
        for(int i = 0; i< itens.size(); i++){
            if(itens.get(i).getNumero() == numero){
                itens.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean conclui() {
        return false;
    }

    public void imprimeRecibo() {

    }

    public double getTotal() {

    }

    public double getImposto() {

    }

    public double getDesconto() {

    }

    public double getValorVenda() {

    }
}
