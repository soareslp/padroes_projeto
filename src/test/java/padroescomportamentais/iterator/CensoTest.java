package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CensoTest {

    @Test
    void deveContarAnimalsVacinados() {
        Vacina vacina = new Vacina(
                new Animal("Lunna", true),
                new Animal("Charlotte", true),
                new Animal("Den", false),
                new Animal("Tigrinha", true)
        );
        assertEquals(3, Censo.contarTotalAnimaisVacinados(vacina));
    }

    @Test
    void deveContarTotalAnimaisCadastrados() {
        Vacina vacina = new Vacina(
                new Animal("Lunna", true),
                new Animal("Charlotte", true),
                new Animal("Den", false),
                new Animal("Tigrinha", true)
        );
        assertEquals(4, Censo.contarAnimaisCadastrados(vacina));
    }

}