package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacinaTest {

    @Test
    void deveNotificarCadastroUmaVacina() {
        Estoque estoque = new Estoque("A", "Vacina", 3);
        Vacina vacina = new Vacina("Antitétano");
        vacina.cadastrar(estoque);
        estoque.cadastrarVacina();
        assertEquals("Antitétano, vacina cadastrada no Estoque{nomeEstoque='A', tipoProduto='Vacina', capacidade=3}", vacina.getUltimaNotificacao());
    }

    @Test
    void deveNotificarCadastroVacinas(){
        Estoque estoque = new Estoque("A", "Vacina", 3);
        Vacina vacina1 = new Vacina("Antitétano");
        Vacina vacina2 = new Vacina ("Anestesia");
        vacina1.cadastrar(estoque);
        vacina2.cadastrar(estoque);
        estoque.cadastrarVacina();
        assertEquals("Antitétano, vacina cadastrada no Estoque{nomeEstoque='A', tipoProduto='Vacina', capacidade=3}", vacina1.getUltimaNotificacao());
        assertEquals("Anestesia, vacina cadastrada no Estoque{nomeEstoque='A', tipoProduto='Vacina', capacidade=3}", vacina2.getUltimaNotificacao());
    }

    @Test
    void deveNotificarEstoqueAVacina1(){
        Estoque estoqueA = new Estoque("A", "Antitétano", 3);
        Estoque estoque1 = new Estoque("B", "Anestesia", 6);
        Vacina vacina1 = new Vacina("Antitétano");
        Vacina vacina2 = new Vacina("Anestesia");
        vacina1.cadastrar(estoqueA);
        vacina2.cadastrar(estoque1);
        estoqueA.cadastrarVacina();
        assertEquals("Antitétano, vacina cadastrada no Estoque{nomeEstoque='A', tipoProduto='Antitétano', capacidade=3}", vacina1.getUltimaNotificacao());
        assertEquals(null, vacina2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarEstoque() {
        Estoque estoque = new Estoque("A", "Vacina", 5);
        Vacina vacina = new Vacina("Antitétano");
        estoque.cadastrarVacina();
        assertEquals(null, vacina.getUltimaNotificacao());
    }

    @Test
    void deveNotificarVacinaEstoqueA() {
        Estoque estoqueA = new Estoque("A", "Antitétano", 3);
        Estoque estoqueB = new Estoque("B", "Anestesia", 6);
        Vacina vacina1 = new Vacina("Antitétano");
        Vacina vacina2 = new Vacina("Anestesia");
        vacina1.cadastrar(estoqueA);
        vacina2.cadastrar(estoqueB);
        estoqueA.cadastrarVacina();
        assertEquals("Antitétano, vacina cadastrada no Estoque{nomeEstoque='A', tipoProduto='Antitétano', capacidade=3}", vacina1.getUltimaNotificacao());
        assertEquals(null, vacina2.getUltimaNotificacao());
    }

}