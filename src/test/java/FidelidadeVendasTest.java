import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FidelidadeVendasTest {
    @Test
    void deveRetonarFidelidadeCompleta() {
        FidelidadeVendas fidelidade = new FidelidadeVendas();
        fidelidade.setValorServico1(130.0f);
        fidelidade.setValorServico2(200.0f);
        assertEquals("Você ganhou um desconto de 20% para a próxima compra!", fidelidade.verificarFidelidade());
    }

    @Test
    void deveRetonarFidelidadeIncompleta() {
        FidelidadeVendas fidelidade = new FidelidadeVendas();
        fidelidade.setValorServico1(120.0f);
        fidelidade.setValorServico2(125.0f);
        assertEquals("Quase lá.", fidelidade.verificarFidelidade());
    }

    @Test
    void deveRetornarInformacoes() {
        FidelidadeVendas fidelidade = new FidelidadeVendas();
        fidelidade.setValorServico1(125.0f);
        fidelidade.setValorServico2(110.f);
        fidelidade.setCliente("Nathalia");
        assertEquals("FidelidadeVendas{" +
                "nome = 'Nathalia', resultado = Quase lá.}", fidelidade.getInfo());
    }

}