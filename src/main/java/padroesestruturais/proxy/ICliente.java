package padroesestruturais.proxy;

import java.util.List;

public interface ICliente {

    List<String> obterDadosPessoais();
    List<Float> obterValorConsultas(Funcionario funcionario);
}
