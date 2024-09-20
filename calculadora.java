import java.util.Scanner;

public class calculadora {
    public static void main (String[] args) {// a execução principal
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Qual comando você quer?\nSoma[1]\nSubtração[2]\nMultiplicação[3]\nDivisão[4]");
            int numero = input.nextInt();
            
            double[] numeros = scan(input);
            double primeiro = numeros[0];
            double segundo = numeros[1];
            
            switch (numero) {
                case 1 ->                     {
                        double resultado = soma(primeiro, segundo);
                        System.out.println("A soma é: " + resultado);
                    }
                case 2 ->                     {
                        double resultado = subtracao(primeiro, segundo);
                        System.out.println("A subtração é: " + resultado);
                    }
                case 3 ->                     {
                        double resultado = multiplicacao(primeiro, segundo);
                        System.out.println("A multiplicação é: " + resultado);
                    }
                case 4 ->                     {
                        double resultado = divisao(primeiro, segundo);
                        if (segundo != 0) { // Verifica se o segundo número é diferente de zero
                            System.out.println("A divisão é: " + resultado);
                        }                          }
                default -> System.out.println("Comando inválido!");
            }
        }
    }

    public static double[] scan(Scanner input) {// vai scanear valores :)
        System.out.println("Digite o primeiro número");
        double primeiro = input.nextDouble();
        System.out.println("Digite o segundo número");
        double segundo = input.nextDouble();
        return new double[]{primeiro, segundo};
    }

    public static double soma(double primeiro, double segundo) {// aqui vai estar somando :)
        return primeiro + segundo;
    }

    public static double subtracao(double primeiro, double segundo) {// aqui subtrae :)
        return primeiro - segundo;
    }

    public static double multiplicacao(double primeiro, double segundo) {// aqui multiplica :)
        return primeiro * segundo;
    }

    public static double divisao(double primeiro, double segundo) {//aqui divide :)
        return primeiro / segundo;
    }
}
