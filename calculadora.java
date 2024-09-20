import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Qual comando você quer?\nSoma[1]\nSubtração[2]\nMultiplicação[3]\nDivisão[4]");
            int numero = input.nextInt();
            
            double[] numeros = scan(input);
            double primeiro = numeros[0];
            double segundo = numeros[1];
            double resultado;
            
            switch (numero) {
                case 1 -> {
                    resultado = soma(primeiro, segundo);
                    System.out.println("A soma é: " + resultado);
                }
                case 2 -> {
                    resultado = subtracao(primeiro, segundo);
                    System.out.println("A subtração é: " + resultado);
                }
                case 3 -> {
                    resultado = multiplicacao(primeiro, segundo);
                    System.out.println("A multiplicação é: " + resultado);
                }
                case 4 -> {
                    if (segundo != 0) {
                        resultado = divisao(primeiro, segundo);
                        System.out.println("A divisão é: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                }
                default -> System.out.println("Comando inválido!");
            }
        }
    }

    public static double[] scan(Scanner input) {
        System.out.println("Digite o primeiro número");
        double primeiro = input.nextDouble();
        System.out.println("Digite o segundo número");
        double segundo = input.nextDouble();
        return new double[]{primeiro, segundo};
    }

    public static double soma(double primeiro, double segundo) {
        return primeiro + segundo;
    }

    public static double subtracao(double primeiro, double segundo) {
        return primeiro - segundo;
    }

    public static double multiplicacao(double primeiro, double segundo) {
        return primeiro * segundo;
    }

    public static double divisao(double primeiro, double segundo) {
        return primeiro / segundo;
    }
}
