/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2mobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Lista2Mobile {

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

    public static String escanearString(String mensagem) {
        System.out.print(mensagem);
        sc.nextLine();
        return sc.nextLine();
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
        Double numeroDigitado = escanearDouble("Digite o número: ");
        if (numeroDigitado % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }

    private static void executarExercicioDois() {
        Double lado1 = escanearDouble("Digite o primeiro lado do triângulo: ");
        Double lado2 = escanearDouble("Digite o segundo lado do triângulo: ");
        Double lado3 = escanearDouble("Digite o terceiro lado do triângulo: ");
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            if (lado1.equals(lado2) && lado2.equals(lado3)) {
                System.out.println("É um triângulo Equilátero");
            } else if (lado1.equals(lado2) || lado2.equals(lado3) || lado1.equals(lado3)) {
                System.out.println("É um triângulo Isósceles");
            } else {
                System.out.println("É um triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }

    private static void executarExercicioTres() {
        Double primeiraNota = escanearDouble("Digite a primeira nota: ");
        Double segundaNota = escanearDouble("Digite a segunda nota: ");
        Double terceiraNota = escanearDouble("Digite a terçeira nota: ");
        List<Double> listaNotas = new ArrayList<>();
        listaNotas.add(primeiraNota);
        listaNotas.add(segundaNota);
        listaNotas.add(terceiraNota);
        Double maiorNota = null;
        Double somaNotas = 0d;
        for (int i = 0; i < listaNotas.size(); i++) {
            Double notaAtual = listaNotas.get(i);
            if (maiorNota == null || maiorNota < notaAtual) {
                maiorNota = notaAtual;
            }
            somaNotas += notaAtual;
        }
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Média das notas: " + somaNotas / listaNotas.size());
    }

    private static void executarExercicioQuatro() {
        Double primeiraNota = escanearDouble("Digite a primeira nota: ");
        Double segundaNota = escanearDouble("Digite a segunda nota: ");
        Double terceiraNota = escanearDouble("Digite a terçeira nota: ");
        List<Double> listaNotas = new ArrayList<>();
        listaNotas.add(primeiraNota);
        listaNotas.add(segundaNota);
        listaNotas.add(terceiraNota);
        String codigo = escanearString("Digite 'c' para crescente ou 'd' para decrescente: ");
        Collections.sort(listaNotas);
        if (codigo.equals("c")) {
            System.out.println(listaNotas.get(0) + ", " + listaNotas.get(1) + ", " + listaNotas.get(2));
        } else if (codigo.equals("d")) {
            Collections.reverse(listaNotas);
            System.out.println(listaNotas.get(0) + ", " + listaNotas.get(1) + ", " + listaNotas.get(2));
        } else {
            System.err.println("Código inválido");
        }
    }

    private static void executarExercicioCinco() {
        Double primeiraNota = escanearDouble("Digite o primeiro número: ");
        Double segundaNota = escanearDouble("Digite o segundo número: ");
        Double terceiraNota = escanearDouble("Digite o terceiro número: ");
        System.out.println("Escolha:");
        System.out.println("1 - média \t 2 - soma \t 3 - multiplição");
        Integer escolha = escanearInteger("");
        switch (escolha) {
            case 1:
                System.out.println((primeiraNota + segundaNota + terceiraNota) / 3);
                break;
            case 2:
                System.out.println(primeiraNota + segundaNota + terceiraNota);
                break;
            case 3:
                System.out.println(primeiraNota * segundaNota * terceiraNota);
                break;
            default:
                System.err.println("Escolha inválida");
        }

    }
}
