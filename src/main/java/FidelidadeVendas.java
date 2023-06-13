public class FidelidadeVendas extends Fidelidade {
    public String verificarFidelidade() {
        if (this.calcularGastoTotal() >= 250.0f) {
            return "Você ganhou um desconto de 20% para a próxima compra!";
        }
        else {
            return "Quase lá.";
        }
    }

    @Override
    public String getTipo() {
        return "FidelidadeVendas";
    }
}
