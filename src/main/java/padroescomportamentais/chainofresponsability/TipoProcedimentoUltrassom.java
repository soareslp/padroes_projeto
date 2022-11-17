package padroescomportamentais.chainofresponsability;

public class TipoProcedimentoUltrassom implements TipoProcedimento{

    private static TipoProcedimentoUltrassom tipoProcedimentoUltrassom = new TipoProcedimentoUltrassom();

    private TipoProcedimentoUltrassom() {};

    public static TipoProcedimentoUltrassom getTipoProcedimentoUltrassom() {
        return tipoProcedimentoUltrassom;
    }
}
