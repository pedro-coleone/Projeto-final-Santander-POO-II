package projetoFinal;

class Aluguel {
    private Cliente cliente;
    private int quantDias;
    private Veiculo veiculo;

    public Aluguel(Veiculo veiculo, Cliente cliente, int quantDias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.quantDias = quantDias;
    }

    public double calculaTotal() {
        double precoBase = veiculo.getPrecoBase() * quantDias;
        if (cliente.isPessoaFisica()) {
            if (quantDias > 5) {
                precoBase = precoBase * 0.95;
            }
        } else {
            if (quantDias > 3) {
                precoBase = precoBase * 0.9;
            }
        }
        return precoBase;
    }
}