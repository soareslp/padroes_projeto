package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Secao extends Item {

    private List<Item> itens;

    public Secao(String descricao) {
        super(descricao);
        this.itens = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public String getItem() {
        String saida = "";
        saida = "Secao: " + this.getDescricao() + "\n";
        for (Item item : itens) {
            saida += item.getItem();
        }
        return saida;
    }
}
