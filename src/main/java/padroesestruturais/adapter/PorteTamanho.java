package padroesestruturais.adapter;

public class PorteTamanho implements IPorte{

    private String tamanho;

    @Override
    public String getPorte() {
        return this.tamanho;
    }

    @Override
    public void setPorte(String tamanho) {
        this.tamanho = tamanho;
    }
}
