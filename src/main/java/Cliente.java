public class Cliente {
    private double valorReais;
    private double cotacao;

    public double getValorReais() {
        return valorReais;
    }

    public void setValorReais(double valorReais) {
        this.valorReais = valorReais;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public double calcularConversao(){
        return CasaDeCambio.calcularConversao(this.valorReais, this.cotacao);
    }
}
