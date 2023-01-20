package org.example;

public class Aluguel {

    double valorBase;
    double desconto;
    int numDias;
    public Aluguel (Veiculo veiculo, Cliente cliente, int dias){
        valorBase = veiculo.valorBase;
        desconto = cliente.getDesconto(dias);
        numDias = dias;
    }
    public double getValor(){
        return valorBase*(1-desconto)*numDias;
    }
}

