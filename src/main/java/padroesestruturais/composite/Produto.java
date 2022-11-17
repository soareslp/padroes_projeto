package padroesestruturais.composite;

public class Produto extends Item {

    private int qtd;

    public Produto(String descricao, int qtd) {
        super(descricao);
        this.qtd = qtd;
    }

    public int getQtd(){
        return qtd;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public String getItem() {
        return "Produto: " + this.getDescricao() + " - quantidade: " + this.qtd + "\n";
    }
}
