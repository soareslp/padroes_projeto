package padroescomportamentais.strategy;

public class Cliente {

    private String nome;
    private String tipoPagamento;

    public Cliente (String nome, String tipoPagamento){
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void pagarBoleto(String tipo) {
        Recebimento recebimento = new Recebimento(tipo);
        this.tipoPagamento = recebimento.pagar(new PagamentoBoleto());
    }

    public void pagarDinheiro(String tipo) {
        Recebimento recebimento = new Recebimento(tipo);
        this.tipoPagamento = recebimento.pagar(new PagamentoDinheiro());
    }

    public void pagarCredito(String tipo) {
        Recebimento recebimento = new Recebimento(tipo);
        this.tipoPagamento = recebimento.pagar(new PagamentoCredito());
    }

    public void pagarDebito(String tipo) {
        Recebimento recebimento = new Recebimento(tipo);
        this.tipoPagamento = recebimento.pagar(new PagamentoDebito());
    }

    public void pagarPix(String tipo) {
        Recebimento recebimento = new Recebimento(tipo);
        this.tipoPagamento = recebimento.pagar(new PagamentoPix());
    }
}
