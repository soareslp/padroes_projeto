package padroesestruturais.adapter;

public class Animal {

    IPorte porte;
    PorteAdapter persistencia;

    public Animal(){
        porte = new PorteTamanho();
        persistencia = new PorteAdapter(porte);
    }

    public void setPorte(String tamanho) {
        porte.setPorte(tamanho);
        persistencia.salvarPorte();
    }

    public String getPorte(){
        return persistencia.recuperarPorte();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getPeso() {
        return persistencia.getPeso();
    }
}
