package padroesestruturais.facade;

public class Financeiro extends Area {

    private static Financeiro financeiro = new Financeiro();

    private Financeiro() {};
    public static Financeiro getInstancia(){
        return financeiro;
    }
}
