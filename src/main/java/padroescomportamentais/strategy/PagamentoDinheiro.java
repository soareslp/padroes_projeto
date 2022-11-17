package padroescomportamentais.strategy;

public class PagamentoDinheiro implements Pagamento{


    @Override
    public String pagar(String tipo) {
        if (tipo.isEmpty()){
            throw new IllegalArgumentException("Forma de pagamento não selecionada!");
        }
        else {
            return "Pagamento por dinheiro";
        }
    }
}
