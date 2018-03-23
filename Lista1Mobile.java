/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1mobile;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Lista1Mobile {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer numeroExercicio = escanearInteger("Digite o número do exercício: ");
        switch (numeroExercicio) {
            case 1:
                executarExercicioUm();
                break;
            case 2:
                executarExercicioDois();
                break;
            case 3:
                executarExercicioTres();
                break;
            case 4:
                executarExercicioQuatro();
                break;
            case 5:
                executarExercicioCinco();
                break;
            default:
                System.err.println("Exercício não encontrado!");
        }
    }

    public static Integer escanearInteger(String mensagem) {
        System.out.print(mensagem);
        return sc.nextInt();
    }
    public static Double escanearDouble(String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }

    private static void executarExercicioUm() {
        Double primeiroNumero = escanearDouble("Entre como primeiro número: ");
        Double segundoNumero = escanearDouble("Entre como segundo número: ");
        System.out.println("Soma: "+ (primeiroNumero + segundoNumero));
        System.out.println("Diferenca: "+ (primeiroNumero - segundoNumero));
        System.out.println("Produto: "+ (primeiroNumero * segundoNumero));
        System.out.println("Média: "+ ((primeiroNumero + segundoNumero)/2));
    }

    private static void executarExercicioDois() {
        Double temperaturaEmGrausCentigrados = escanearDouble("Digite a temperatura em graus centígrados: ");
        Double temperaturaEmGrausFahrenheit = (9*temperaturaEmGrausCentigrados + 160)/5;
        System.out.println("Temperatura em graus Fahrenheit: "+ temperaturaEmGrausFahrenheit);
    }

    private static void executarExercicioTres() {
        Double alturaLata = escanearDouble("Digite a altura da lata de óleo: ");
        Double raioLata = escanearDouble("Digite o raio da lata de óleo: ");
        Double volume = Math.PI * Math.pow(raioLata, 2) * alturaLata;
        System.out.printf("O volúme da lata de óleo é: %.2f\n", volume);
    }

    private static void executarExercicioQuatro() {
        Integer variavelA = escanearInteger("Digite o valor da variável A: ");
        Integer variavelB = escanearInteger("Digite o valor da variável B: ");
        Integer backupVariavelA = variavelA;
        variavelA = variavelB;
        variavelB = backupVariavelA;
        System.out.printf("Valor da variável 'A': %d; Valor da variável B: %d \n", variavelA, variavelB);
    }

    private static void executarExercicioCinco() {
        Integer numeroDigitado = escanearInteger("Digite o valor do número inteiro: ");
        System.out.printf("Valor do número ao quadrado: %d\n", Math.round(Math.pow(numeroDigitado.doubleValue(), 2)));
    }
}
