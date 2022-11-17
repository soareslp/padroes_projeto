package padroesestruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Cliente implements ICliente {

    private Integer cpf;
    private String nome;
    private String animal;
    private String nomeAnimal;
    private float vlConsulta;


    public Cliente(int cpf){
        this.cpf = cpf;
        Cliente objeto = BD.getCliente(cpf);
        this.nome = objeto.nome;
        this.animal = objeto.animal;
        this.nomeAnimal = objeto.nomeAnimal;
        this.vlConsulta = objeto.vlConsulta;
    }

    public Cliente(Integer cpf, String nome, String animal, String nomeAnimal, float vlConsulta){
        this.cpf = cpf;
        this.nome = nome;
        this.animal = animal;
        this.nomeAnimal = nomeAnimal;
        this.vlConsulta = vlConsulta;
    }

    public Integer getCpf(){
        return cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.animal, this.nomeAnimal);
    }

    @Override
    public List<Float> obterValorConsultas(Funcionario funcionario){
        return Arrays.asList(this.vlConsulta);
    }

}
