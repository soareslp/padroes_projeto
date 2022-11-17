package padroesestruturais.composite;

public class Estoque {

    private Item catalogo;

    public void setCatalogo(Item catalogo) {
        this.catalogo = catalogo;
    }

    public String getCatalogo(){
        if (this.catalogo == null) {
            throw new NullPointerException("Estoque sem produtos!");
        }
        return this.catalogo.getItem();
    }
}
