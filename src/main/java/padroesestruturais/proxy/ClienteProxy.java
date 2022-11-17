package padroesestruturais.proxy;

import java.util.List;

public class ClienteProxy implements ICliente {

    private Cliente cliente;

    private Integer cpf;

    public ClienteProxy(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.cliente == null) {
            this.cliente = new Cliente(this.cpf);
        }
        return this.cliente.obterDadosPessoais();
    }

    @Override
    public List<Float> obterValorConsultas(Funcionario funcionario){
        if(!funcionario.isAdministrador()){
            throw new IllegalArgumentException("Funcionário não é administrado. Acesso recusado!");
        }
        if(this.cliente == null) {
            this.cliente = new Cliente(this.cpf);
        }
        return this.cliente.obterValorConsultas(funcionario);
    }
}
