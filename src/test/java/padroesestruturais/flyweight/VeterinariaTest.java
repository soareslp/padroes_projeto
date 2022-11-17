package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VeterinariaTest {

    @Test
    void deveRetornarAnimais() {
        Veterinaria veterinaria = new Veterinaria();
        veterinaria.cadastrar("Lunna", "Bulldog", "Pequeno");
        veterinaria.cadastrar("Den", "Bulldog", "Pequeno");
        veterinaria.cadastrar("Rá", "Bulldog", "Pequeno");
        veterinaria.cadastrar("Hayate", "Vira-lata", "Grande");

        List<String> saida = Arrays.asList(
                "Animal{nome='Lunna', raca='Bulldog', porte='Pequeno'}",
                "Animal{nome='Den', raca='Bulldog', porte='Pequeno'}",
                "Animal{nome='Rá', raca='Bulldog', porte='Pequeno'}",
                "Animal{nome='Hayate', raca='Vira-lata', porte='Grande'}");

        assertEquals(saida, veterinaria.obterAnimais());
    }

    @Test
    void deveRetornarTotalCidades() {
        Veterinaria veterinaria = new Veterinaria();
        veterinaria.cadastrar("Lunna", "Bulldog", "Pequeno");
        veterinaria.cadastrar("Den", "Bulldog", "Pequeno");
        veterinaria.cadastrar("Rá", "Bulldog", "Pequeno");
        veterinaria.cadastrar("Hayate", "Vira-lata", "Grande");

        assertEquals(2, RacaFactory.getTotalRacas());
    }

}