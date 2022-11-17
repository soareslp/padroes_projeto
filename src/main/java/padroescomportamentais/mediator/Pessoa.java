package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarRH (String msg) {
        return Ouvidoria.getInstancia().receberElogioRH(msg);
    }

    public String reclamarRH(String msg) {
        return Ouvidoria.getInstancia().receberReclamacaoRH(msg);
    }

    public String sugerirRH(String msg) {
        return Ouvidoria.getInstancia().receberSugestaoRH(msg);
    }

    public String denunciarRH(String msg) {
        return Ouvidoria.getInstancia().receberDenunciaRH(msg);
    }
}
