package com.mycompany.folhapagamento;
import java.util.Scanner;

public class Folhapagamento {

    public static void main(String[] args) {
        Folhapagamento2 folha = new Folhapagamento2();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o valor da sua hora trabalhada?");
        folha.valorhora = (ler.nextFloat());
        
        System.out.println("Quantas horas você trabalhou neste mês?");
        folha.qtdhora = (ler.nextFloat());
  
        folha.saida();
    }
}
