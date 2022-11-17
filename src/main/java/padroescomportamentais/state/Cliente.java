package padroescomportamentais.state;

public class Cliente {

    private String nome;
    private ClienteEstado estado;

    public Cliente() {
        this.estado = ClienteEstadoCadastrado.getInstance();
    }

    public String cadastrar() {
        return estado.cadastrar(this);
    }

    public String agendarHorario() {
        return estado.agendarHorario(this);
    }

    public String remarcarHorario() {
        return estado.remarcarHorario(this);
    }

    public String cancelarHorario() {
        estado.cancelarHorario(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public ClienteEstado getEstado() {

        return estado;
    }

    public void setEstado(ClienteEstado estado) {

        this.estado = estado;
    }
}
