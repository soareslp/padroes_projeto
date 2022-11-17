package padroesestruturais.facade;

public class ClienteFacade {

    public static boolean verificarPendenciasDeAlta(Cliente cliente) {
        if (Laboratorio.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }

        if (Consultorio.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }

        if (Financeiro.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
