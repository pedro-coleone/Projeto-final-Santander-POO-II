package projetoFinal;

public class Aplicacao {
    public static void main(String[] args) {
        Veiculo veiculoPequeno = new Veiculo("pequeno");
        Veiculo veiculoMedio = new Veiculo("medio");
        Veiculo veiculoSUV = new Veiculo("SUV");

        Cliente pessoaFisica = new Cliente(true);
        Cliente pessoaJuridica = new Cliente(false);

        Aluguel aluguel1 = new Aluguel(veiculoPequeno, pessoaFisica, 6);
        System.out.println(String.format(
                "Aluguel de um veiculo pequeno por 6 dias realizado por uma pessoa fisica: TOTAL = R$%.2f",
                aluguel1.calculaTotal()));
        Aluguel aluguel2 = new Aluguel(veiculoMedio, pessoaJuridica, 4);
        System.out.println(String.format(
                "Aluguel de um veiculo medio por 4 dias realizado por uma pessoa juridica: TOTAL = R$%.2f",
                aluguel2.calculaTotal()));
        Aluguel aluguel3 = new Aluguel(veiculoSUV, pessoaFisica, 2);
        System.out.println(
                String.format("Aluguel de um veiculo SUV por 2 dias realizado por uma pessoa fisica: TOTAL = R$%.2f",
                        aluguel3.calculaTotal()));
        Aluguel aluguel4 = new Aluguel(veiculoPequeno, pessoaJuridica, 1);
        System.out.println(String.format(
                "Aluguel de um veiculo pequeno por 1 dia realizado por uma pessoa juridica: TOTAL = R$%.2f",
                aluguel4.calculaTotal()));
    }
}
