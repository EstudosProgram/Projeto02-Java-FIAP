package br.com.fiap;

public class Operadores {
    public static void main(String[] args) {

        byte idade = 19;
        short codigo = 1343;
        int alunos = 50, classes = 11;
        long brasileiros = 216535748;
        float media = 8.6f;
        double dolar =5.71;

        double multilicacao = idade * alunos;
        double soma = brasileiros + idade;
        int divisao = codigo / alunos;
        double subtracao = media - dolar;

        System.out.println("Multiplicação: " + multilicacao + "\nDivisão: " + divisao + "\nSome: " + soma + "\nSubtração: " + subtracao);

    }
}
