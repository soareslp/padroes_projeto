package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioRH(String msg){
        return "A Ouvidoria agradece seu contato. \n" +
                "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                RH.getInstancia().receberElogio(msg);
    }

    public String receberReclamacaoRH(String msg){
        return "A Ouvidoria agradece seu contato. \n" +
                "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                RH.getInstancia().receberReclamacao(msg);
    }

    public String receberSugestaoRH(String msg){
        return "A Ouvidoria agradece seu contato. \n" +
                "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                RH.getInstancia().receberSugestao(msg);
    }

    public String receberDenunciaRH(String msg){
        return "A Ouvidoria agradece seu contato. \n" +
                "O setor de RH respondeu sua seguinte mensagem descrita abaixo: \n" +
                RH.getInstancia().receberDenuncia(msg);
    }
}
