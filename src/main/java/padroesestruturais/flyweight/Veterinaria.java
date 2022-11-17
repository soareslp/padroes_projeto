package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    private List<Animal> animais = new ArrayList<>();

    public void cadastrar(String nomeAnimal, String nomeRaca, String porte) {
        Raca raca = RacaFactory.getRaca(nomeRaca, porte);
        Animal animal = new Animal(nomeAnimal, raca);
        animais.add(animal);
    }

    public List<String> obterAnimais() {
        List<String> saida = new ArrayList<String>();
        for (Animal animal : this.animais) {
            saida.add(animal.obterAnimal());
        }
        return saida;
    }
}
