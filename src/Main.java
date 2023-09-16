import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para iniciar a calculadora escolha a operação: + , -, * ou /; para respectivamente soma, subtração, multiplicação e divisão.");
        String operacao = sc.nextLine();
        System.out.print("Agora digite os números, vou pedir um de cada vez: ");
        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        double resultado =0;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2!=0) {
                    resultado = numero1 / numero2;
                }else{
                    System.out.print("Zero não é um divisor válido. Não é possível calcular. ");
                };
                break;
        }
        System.out.print("Resultado " + resultado);
        sc.close();
    }
}