package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {
    @Test
    void deveRetornarTamanhoAnimal() {
        Animal animal = new Animal();
        animal.setPorte("Mini");

        assertEquals("Mini", animal.getPorte());
    }

    @Test
    void deveRetornarPesoAnimal() {
        Animal animal = new Animal();
        animal.setPorte("Mini");

        assertEquals(4.0f, animal.getPeso());
    }
}