package padroescomportamentais.mediator;

public class RH implements Setor{

    private static RH instancia = new RH();

    private RH() {}

    public static RH getInstancia(){
        return instancia;
    }

    public String receberElogio(String msg) {
        return "O setor de RH agradece o recebimento do elogio. " +
                "Agradecemos o seu contato: " + msg;
    }

    public String receberReclamacao(String msg) {
        return "O setor de RH procurará melhorar o seus serviços. " +
                "Agradecemos o seu contato: " + msg;
    }

    public String receberSugestao(String msg) {
        return "O setor de RH irá analizar a sugestão proposta. " +
                "Agradecemos o seu contato: " + msg;
    }

    public String receberDenuncia(String msg) {
        return "O setor de RH dará toda atenção à sua denúncia. " +
                "Agradecemos o seu contato: " + msg;
    }
}
