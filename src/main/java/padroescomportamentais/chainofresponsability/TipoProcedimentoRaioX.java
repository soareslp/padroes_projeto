package padroescomportamentais.chainofresponsability;

public class TipoProcedimentoRaioX implements TipoProcedimento{

    private static TipoProcedimentoRaioX tipoProcedimentoRaioX = new TipoProcedimentoRaioX();

    private TipoProcedimentoRaioX() {};

    public static TipoProcedimentoRaioX getTipoProcedimentoRaioX() {
        return tipoProcedimentoRaioX;
    }
}
