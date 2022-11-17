package padroescomportamentais.strategy;

public class Recebimento {

    private String tipo;

    public Recebimento (String tipo){
        this.tipo = tipo;
    }

    public String pagar(Pagamento pagamento) {
        return pagamento.pagar(tipo);
    }
}
