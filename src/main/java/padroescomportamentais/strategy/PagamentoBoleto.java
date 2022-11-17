package padroescomportamentais.strategy;

public class PagamentoBoleto implements Pagamento{


    @Override
    public String pagar(String tipo) {
        if (tipo.isEmpty()){
            throw new IllegalArgumentException("Forma de pagamento não selecionada!");
        }
        else {
            return "Pagamento por boleto";
        }
    }
}
