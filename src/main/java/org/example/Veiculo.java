package org.example;

import java.util.Scanner;

public class Veiculo {

    String carro;
    double valorBase;

    public Veiculo (Scanner scanner){
        carro = getVeiculo(scanner);
        valorBase = getValorBase(carro);
    }

    private double getValorBase(String carro){
        if (carro.equalsIgnoreCase("pequeno")){
            return 100.0;
        } else if (carro.equalsIgnoreCase("medio")){
            return 150.0;
        } else if(carro.equalsIgnoreCase("suv")){
            return 200.0;
        }
        return 0;
    }

    public double getValorDiaria(){
        return this.valorBase;
    }

    private static String getVeiculo(Scanner scanner){
        String veiculo;
        while (true) {
            try {
                System.out.println("Qual tipo de veículo deseja alugar? \nPequeno | Medio | SUV");
                String entrada = scanner.next();
                if (!entrada.equalsIgnoreCase("pequeno")&&
                        !entrada.equalsIgnoreCase("medio")&&
                        !entrada.equalsIgnoreCase("suv")){
                    throw new Exception();
                }
                veiculo = (entrada);
                break;
            } catch (Exception ex) {
                System.out.println("Erro. Digite um veículo válido\n");
                continue;
            }
        }
        return veiculo;
    }
}
