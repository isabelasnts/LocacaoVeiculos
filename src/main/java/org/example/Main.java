package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PessoaFisica clienteF = new PessoaFisica();
        PessoaJuridica clienteJ = new PessoaJuridica();
        Veiculo veiculo = new Veiculo(scanner);
        String tipoCliente = getCliente(scanner);
        Aluguel aluguel;
        int dias = getDias(scanner);

        if(Objects.equals(tipoCliente, "fisica") || Objects.equals(tipoCliente, "física")){
            aluguel = new Aluguel(veiculo, clienteF, dias);
        }else{
            aluguel = new Aluguel(veiculo, clienteJ, dias);
        }

        double valorFinal = aluguel.getValor();
        System.out.printf("\nO valor total do aluguel é: R$ %.2f\n", valorFinal);
    }

    private static String getCliente(Scanner scanner){
        String cliente;
        while (true) {
            try {
                System.out.println("\nQual tipo de cliente?\nFísica | Jurídica");
                String entrada = scanner.next();
                if (!entrada.equalsIgnoreCase("fisica")&&
                        !entrada.equalsIgnoreCase("física")&&
                        !entrada.equalsIgnoreCase("juridica")&&
                        !entrada.equalsIgnoreCase("jurídica")){
                    throw new Exception();
                }
                cliente = (entrada);
                break;
            } catch (Exception ex) {
                System.out.println("Erro. Digite um cliente válido\n");
                continue;
            }
        }
        return cliente;
    }

    private static int getDias(Scanner scanner){
        int dias;
        while (true) {
            try {
                System.out.println("\nPor quantos dias deseja alugar?");
                String entrada = scanner.next();
                if (!entrada.matches("^[0-9]*$")&&(entrada != "0") ){
                    throw new Exception();
                }
                dias = Integer.parseInt(entrada);
                break;

            } catch (Exception ex) {
                System.out.println("Erro. Digite um número inteiro e positivo");
                continue;
            }
        }
        return dias;
    }
}