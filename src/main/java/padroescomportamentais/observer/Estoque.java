package padroescomportamentais.observer;

import java.util.Observable;

public class Estoque extends Observable {

    private String nomeEstoque;
    private String tipoProduto;
    private Integer capacidade;


    public Estoque(String nomeEstoque, String tipoProduto, Integer capacidade) {
        this.nomeEstoque = nomeEstoque;
        this.tipoProduto = tipoProduto;
        this.capacidade = capacidade;
    }

    public void cadastrarVacina(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "nomeEstoque='" + nomeEstoque + '\'' +
                ", tipoProduto='" + tipoProduto + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }

}
