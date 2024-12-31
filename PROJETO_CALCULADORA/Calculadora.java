package PROJETO_CALCULADORA;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Exbibir todas as opções para o usuário
        // e pedir para ele escolher

        int opcao;

        do {
        
            System.out.println("Calculadora Java");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
        
            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <= 4){

                //Resgatar o numero do usuário
                System.out.println("Digite o primeiro número 0");
                double num1 = scanner.nextDouble();

                System.out.println("Digite o segundo número");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;

                System.out.println(num1 + " " + num2);

                //Encontrar o resultado
                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;
                
                     case 2:
                        resultado = subtrair(num1, num2);
                        break;

                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;

                    case 4:
                        if (num2 != 0) {   
                            resultado = dividir(num1, num2);
                            
                        } else {

                            System.out.println("Divisão por 0!");
                            operacaoValida = false;
                        }
                        break;
                    default:
                    operacaoValida = false;
                        break;
                }
                

                //Mostrar o resultado
                if (operacaoValida) {
                    System.out.println("Resultado: " + resultado);
                }
                

            } else if (opcao != 0) {
                System.out.println("Opção inválida");
                
            }

        } while (opcao != 0);

        //Liberar recursos da memória
        System.out.println("Calculadora encerrada!");
        scanner.close();

    
    }

     //operações

     public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    
    }

}
