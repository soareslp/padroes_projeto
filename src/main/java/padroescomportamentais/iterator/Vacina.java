package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Vacina implements Iterable<Animal>{

    private List<Animal> animais = new ArrayList<Animal>();

    public Vacina(Animal ... animais) {
        this.animais = Arrays.asList(animais);
    }

    @Override
    public Iterator<Animal> iterator() {
        return animais.iterator();
    }
}
