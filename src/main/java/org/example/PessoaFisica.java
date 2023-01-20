package org.example;

public class PessoaFisica implements Cliente {

    @Override
    public double getDesconto(int qtDias){
        if (qtDias > 5){
            return 0.05;
        }
        return 0;
    }

}
