package padroescomportamentais.mediator;

public interface Setor {

    String receberElogio(String msg);
    String receberReclamacao(String msg);
    String receberSugestao (String msg);
    String receberDenuncia (String msg);
}
