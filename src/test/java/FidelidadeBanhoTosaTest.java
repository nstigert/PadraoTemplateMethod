import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FidelidadeBanhoTosaTest {
    @Test
    void deveRetonarFidelidadeCompleta() {
        FidelidadeBanhoTosa fidelidade = new FidelidadeBanhoTosa();
        fidelidade.setValorServico1(30.0f);
        fidelidade.setValorServico2(25.0f);
        assertEquals("Você ganhou um banho e tosa!", fidelidade.verificarFidelidade());
    }

    @Test
    void deveRetonarFidelidadeIncompleta() {
        FidelidadeBanhoTosa fidelidade = new FidelidadeBanhoTosa();
        fidelidade.setValorServico1(20.0f);
        fidelidade.setValorServico2(25.0f);
        assertEquals("Quase lá.", fidelidade.verificarFidelidade());
    }

    @Test
    void deveRetornarInformacoes() {
        FidelidadeBanhoTosa fidelidade = new FidelidadeBanhoTosa();
        fidelidade.setValorServico1(25.0f);
        fidelidade.setValorServico2(30.f);
        fidelidade.setCliente("Nathalia");
        assertEquals("FidelidadeBanhoTosa{" +
                "nome = 'Nathalia', resultado = Você ganhou um banho e tosa!}", fidelidade.getInfo());
    }

}