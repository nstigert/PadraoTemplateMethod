public abstract class Fidelidade {
    protected String cliente;
    private float valorServico1;
    private float valorServico2;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getValorServico1() {
        return valorServico1;
    }

    public void setValorServico1(float valorServico1) {
        this.valorServico1 = valorServico1;
    }

    public float getValorServico2() {
        return valorServico2;
    }

    public void setValorServico2(float valorServico2) {
        this.valorServico2 = valorServico2;
    }

    public float calcularGastoTotal() {
        return (this.valorServico1 + this.valorServico2);
    }

    public abstract String verificarFidelidade();

    public abstract String getTipo();

    public String getInfo() {
        return getTipo() + "{" +
                "nome = '" + this.cliente + '\'' +
                ", resultado = " + this.verificarFidelidade() +
                '}';
    }
}
