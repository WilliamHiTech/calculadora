import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        String operacao;
        String opcao = "Sim";

        while (opcao.equals("Sim")) {
            System.out.println("Digite um numero:");
            num1 = teclado.nextInt();
            System.out.println("Digite qual a operação voce quer realizar(+,-,/,*):");
            operacao = teclado.next();
            System.out.println("Digite outro numero");
            num2 = teclado.nextInt();

            System.out.println("Resultado " + calcular(num1, num2, operacao));


            System.out.println("Deseja realizar outra operaçao SIM OU NÃO ?");
            opcao = teclado.next();

        }
    }


    public static int calcular(int num1, int num2, String operacao) {
        int resultado = 0;

        switch (operacao) {
            case "/":
                resultado = num1 / num2;
                break;

            case "*":
                resultado = num1 * num2;
                break;

            case "-":
                resultado = num1 - num2;
                break;

            case "+":
                resultado = num1 + num2;
                break;

            default:
                System.out.println("Operação invalida");
        }
                return resultado;
        }



        }






