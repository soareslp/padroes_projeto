package padroesestruturais.flyweight;

public class Animal {
    private String nome;
    private Raca raca;

    public Animal(String nome, Raca raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String obterAnimal() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca.getNomeRaca() + '\'' +
                ", porte='" + raca.getPorte() + '\'' +
                '}';
    }
}
