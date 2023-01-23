package projetoFinal;

class Veiculo {
    private String tipo;
    private double precoBase;

    public Veiculo(String tipo) {
        this.tipo = tipo;
        if (tipo.equalsIgnoreCase("pequeno")){
            precoBase = 100;
        }
        else if(tipo.equalsIgnoreCase("medio")){
            precoBase = 150;
        }
        else if(tipo.equalsIgnoreCase("SUV")){
            precoBase = 200;
        }
        else{
            System.out.println("Tipo de veiculo invalido!");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}