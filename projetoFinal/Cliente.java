package projetoFinal;

class Cliente {
    private boolean pessoaFisica;

    // TRUE = pessoa fisica / FALSE = pessoa juridica
    public Cliente(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }
}