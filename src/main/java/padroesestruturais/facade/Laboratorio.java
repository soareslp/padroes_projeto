package padroesestruturais.facade;

public class Laboratorio extends Area{

    private static Laboratorio laboratorio = new Laboratorio();

    private Laboratorio() {};
    public static Laboratorio getInstancia(){
        return laboratorio;
    }
}
