package padroesestruturais.flyweight;

public class Raca {

    private String nomeRaca;
    private String porte;

    public Raca(String nomeRaca, String porte) {
        this.nomeRaca = nomeRaca;
        this.porte = porte;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public String getPorte() {
        return porte;
    }
}
