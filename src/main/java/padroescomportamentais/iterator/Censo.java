package padroescomportamentais.iterator;

import java.util.Iterator;

public class Censo {

    public static Integer contarTotalAnimaisVacinados(Vacina vacina) {
        int quantidade = 0;
        for (Animal animal : vacina) {
            if (animal.isCadastrado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarAnimaisCadastrados(Vacina vacina) {
        int quantidade = 0;
        for (Iterator a = vacina.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
