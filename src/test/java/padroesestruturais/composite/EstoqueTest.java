package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class EstoqueTest {

    @Test
    void deveRetornarProdutosEstoque() {
        Secao secao1 = new Secao("Equipamentos");

        Secao secao2 = new Secao("Vacinas");
        Produto produto21 = new Produto("Vacina Antirrábica", 6);
        secao2.addItem(produto21);

        Secao secao3 = new Secao("Remédios");
        Produto produto31 = new Produto("Dramin", 3);
        Produto produto32 = new Produto("Clindamicina", 2);
        Produto produto33 = new Produto("Metrozinadazol",5);
        secao3.addItem(produto31);
        secao3.addItem(produto32);
        secao3.addItem(produto33);

        Secao catalogo = new Secao("Estoque Veterinário");
        catalogo.addItem(secao1);
        catalogo.addItem(secao2);
        catalogo.addItem(secao3);

        Estoque estoque = new Estoque();
        estoque.setCatalogo(catalogo);

        assertEquals("Secao: Estoque Veterinário\n" +
                "Secao: Equipamentos\n" +
                "Secao: Vacinas\n" +
                "Produto: Vacina Antirrábica - quantidade: 6\n" +
                "Secao: Remédios\n" +
                "Produto: Dramin - quantidade: 3\n" +
                "Produto: Clindamicina - quantidade: 2\n" +
                "Produto: Metrozinadazol - quantidade: 5\n", estoque.getCatalogo());
    }

    @Test
    void deveRetornarExecacaoEstoqueSemProdutos() {
        try {
            Estoque estoque = new Estoque();
            estoque.getCatalogo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Estoque sem produtos!", e.getMessage());
        }
    }

}