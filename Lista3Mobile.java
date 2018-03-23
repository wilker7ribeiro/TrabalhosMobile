/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listamobile3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Lista3Mobile {
    static Scanner sc = new Scanner(System.in);
    
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

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Integer numeroExercicio = escanearInteger("Digite o nÃºmero do exercÃ­cio: ");
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
            case 6:
                executarExercicioSeis();
                break;
            case 7:
                executarExercicioSete();
                break;
            case 8:
                executarExercicioOito();
                break;
            case 9:
                executarExercicioNove();
                break;
            case 10:
                executarExercicioDez();
                break;
            default:
                System.err.println("ExercÃ­cio nÃ£o encontrado!");
        }
    }

    private static void executarExercicioUm() {

        List<Double> listValores = new ArrayList<>();
        Double maiorValor = null;
        Double menorValor = null;

        for (int i = 0; i < 15; i++) {
            listValores.add(escanearDouble(("Digite o valor "+ (i+1)+": ")));
        }
        for (int i = 0; i < listValores.size(); i++) {
            if(maiorValor == null || listValores.get(i) > maiorValor){
                maiorValor = listValores.get(i);
            }
            if(menorValor == null || listValores.get(i) < menorValor){
                menorValor = listValores.get(i);
            }
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor " + menorValor);
    }

    private static void executarExercicioDois() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d x %d = %d\t", j, i, i*j);
            }
            System.out.println("");
        }
    }

    private static void executarExercicioTres() {
        int soma = 0;
        for (int i = 1, j = 1; i < 51; i++, j+=2) {
            soma += (j/i);
        }
        System.out.println("Soma total: " + soma);
    }

    private static void executarExercicioQuatro() {
        for (int i = 1000; i < 2000; i++) {
            if(i % 11 == 5){
                System.out.println(i);
            }
        }
    }

    private static void executarExercicioCinco() {
            int somaTotal = 0;
            do {
                somaTotal+= escanearInteger("Digite um número: ");
            } while (somaTotal < 1000);
            System.out.println("Soma final: " + somaTotal);
    }

    private static void executarExercicioSeis() {
        boolean isCrescente = true;
        do {
            Double valorUm = escanearDouble("Digite o primeiro valor: ");
            Double valorDois = escanearDouble("Digite o segundo valor: ");
            Double valorTres = escanearDouble("Digite o terceiro valor: ");
            
            System.out.println("Soma: " + (valorUm + valorDois + valorTres));
            System.out.println("Produto: " + (valorUm * valorDois * valorTres));
            System.out.println("Média: " + ((valorUm + valorDois + valorTres) / 3));
            
            if(valorUm > valorDois || valorDois > valorTres || valorUm == valorDois || valorDois == valorTres) {
                isCrescente = false;
            }
        } while(isCrescente);
    }
    
    private static void executarExercicioSete() {
        List<Double> mediaAlunos = new ArrayList<>();
        Double mediaDigitada;
        do {
            mediaDigitada = escanearDouble("Digite a média do aluno: ");
            if(mediaDigitada >= 0){
                mediaAlunos.add(mediaDigitada);
            }
        } while (mediaDigitada >= 0);
        
        Double maiorMedia = null;
        Double menorMedia = null;
        Double somaMedias = 0d;
        for (int i = 0; i < mediaAlunos.size(); i++) {
            if(maiorMedia == null || mediaAlunos.get(i) > maiorMedia){
                maiorMedia = mediaAlunos.get(i);
            }
            if(menorMedia == null || mediaAlunos.get(i) < menorMedia){
                menorMedia = mediaAlunos.get(i);
            }
            somaMedias+= mediaAlunos.get(i);
        }
        System.out.println("Maior valor: " + maiorMedia);
        System.out.println("Menor valor " + menorMedia);
        System.out.println("Média aritmética " + (somaMedias / mediaAlunos.size())); 
    }

    private static void executarExercicioOito() {
        int numero = escanearInteger("Digite um número: ");
        int numerosParesMostrados = 0;
        int numerosImparesMostrados = 0;
        int numeroAtual = 1;
        
        System.out.println("Numeros Pares:");
        do {
            if(numeroAtual % 2 == 0){
                System.out.print(numeroAtual +"\t");
                numerosParesMostrados++;
            }
            numeroAtual++;
        } while (numerosParesMostrados < numero);
        System.out.println("");
        numeroAtual = 1;
        System.out.println("Numeros Ímpares:");
        do {
            if(numeroAtual % 2 == 1){
                System.out.print(numeroAtual +"\t");
                numerosImparesMostrados++;
            }
             numeroAtual++;
        } while (numerosImparesMostrados < numero);
    }

    private static boolean ehPrimo(Integer numero){
            if(numero <= 1){
		return false;
            }
            for(int divisor = 2; divisor <= numero / 2; divisor++) {
		if (numero % divisor == 0) {
		    return false; 
                }
            }
        return true;
    }
    
    private static void executarExercicioNove() {
        int numero = escanearInteger("Digite um número: ");
        if(ehPrimo(numero)){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }

    private static void executarExercicioDez() {
        int quantidadeNumeros = escanearInteger("Digite a quantidade de números primos: ");
        int numerosAchados = 0;
        int numeroAtual = 0;
        do {
            if(ehPrimo(numeroAtual)){
                System.out.println(numeroAtual);
                numerosAchados++;
            }
            numeroAtual++;
        } while(numerosAchados < quantidadeNumeros);
    }  
}
