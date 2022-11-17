package padroescomportamentais.state;

public interface ClienteEstado {

    String getEstado();

    String cadastrar(Cliente cliente);

    String agendarHorario(Cliente cliente);

    String remarcarHorario(Cliente cliente);

    String cancelarHorario(Cliente cliente);
}
