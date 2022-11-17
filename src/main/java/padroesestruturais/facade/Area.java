package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Area {

    private List<Cliente> clientesComPendencia = new ArrayList<Cliente>();

        public void addClienteComPendencia(Cliente cliente) {
            this.clientesComPendencia.add(cliente);
        }

        public boolean verificarClienteComPendencia (Cliente cliente) {
            return clientesComPendencia.contains(cliente);
        }
    }
