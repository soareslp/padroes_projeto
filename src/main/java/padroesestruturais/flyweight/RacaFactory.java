package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RacaFactory {

    private static Map<String, Raca> racas = new HashMap<>();

    public static Raca getRaca(String nomeRaca, String porte) {
        Raca raca = racas.get(nomeRaca);
        if (raca == null) {
            raca = new Raca(nomeRaca, porte);
            racas.put(nomeRaca, raca);
        }
        return raca;
    }

    public static int getTotalRacas() {
        return racas.size();
    }
}
