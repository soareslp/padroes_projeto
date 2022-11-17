package padroesestruturais.facade;

public class Consultorio extends Area {

    private static Consultorio consultorio = new Consultorio();

    private Consultorio() {};
    public static Consultorio getInstancia(){
        return consultorio;
    }
}
