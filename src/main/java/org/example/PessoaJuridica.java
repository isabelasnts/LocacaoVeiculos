package org.example;

public class PessoaJuridica implements Cliente {

    @Override
    public double getDesconto(int qtDias) {
        if (qtDias > 3){
            return 0.10;
        }
        return 0;
    }

}
