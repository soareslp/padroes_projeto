package padroescriacao.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {
    @Test
    public void deveRetornarNomeAnimal(){
        Animal.getInstance().setNomeAnimal("Lunna");
        Assertions.assertEquals("Lunna", Animal.getInstance().getNomeAnimal());
    }

    @Test
    public void deveRetornarPesoAnimal(){
        Animal.getInstance().setPesoAnimal(15);
        Assertions.assertEquals(15, Animal.getInstance().getPesoAnimal());
    }
}