package padroescomportamentais.chainofresponsability;

public class TipoProcedimentoAnestesia implements TipoProcedimento{

    private static TipoProcedimentoAnestesia tipoProcedimentoAnestesia = new TipoProcedimentoAnestesia();

    private TipoProcedimentoAnestesia() {};

    public static TipoProcedimentoAnestesia getTipoProcedimentoAnestesia() {
        return tipoProcedimentoAnestesia;
    }
}
