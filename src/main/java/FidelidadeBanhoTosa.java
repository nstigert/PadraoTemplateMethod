public class FidelidadeBanhoTosa extends Fidelidade {
    public String verificarFidelidade() {
        if (this.calcularGastoTotal() >= 50.0f) {
            return "Você ganhou um banho e tosa!";
        }
        else {
            return "Quase lá.";
        }
    }
    @Override
    public String getTipo() {
        return "FidelidadeBanhoTosa";
    }
}
