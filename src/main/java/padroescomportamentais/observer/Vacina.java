package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Vacina implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Vacina (String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(Estoque estoque) {
        estoque.addObserver(this);
    }

    @Override
    public void update(Observable estoque, Object arg) {
        this.ultimaNotificacao = this.nome + ", vacina cadastrada no " + estoque.toString();
    }
}
