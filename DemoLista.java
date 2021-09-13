import java.util.ArrayList;

public class DemoLista {
    public static void main(String args[]) {
        ArrayList<String> lista = new ArrayList<String>();

        // insercao
        lista.add("Maria");
        lista.add("Joao");
        lista.add("Pedro");
        System.out.println("First");
        for(String str: lista){
            System.out.println(str);
        }
        // remocao
        lista.remove("Joao");
        for(String str: lista){
            System.out.println(str);
        }
        lista.remove(1);

        // substituicao
        //lista.set(0, "Marilha");
        
        String aux = lista.get(0);
        lista.set(0, lista.get(1));
        lista.set(1, aux);

        // itercao
        // for (int i = 0; i < lista.size(); i++) {
        //     System.out.println(i + ": " + lista.get(i));
        // }

        for (String item: lista) {
            System.out.println(item);
        }

        //lista.forEach(x -> System.out.println(x));
    }
} 