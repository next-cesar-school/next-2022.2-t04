package com.NExT.Projeto.TranscricaoDeAudio;

import java.util.Scanner;

import com.NExT.Projeto.TranscricaoDeAudio.service.Traduzir;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Traduzir text = new Traduzir();
        System.out.println("Escolha o Idioma: PT = Português, EN = Inglês");
        String choice = sc.next();

        switch (choice) {
        
        case "Pt":
        
            System.out.println("Digite o texto que você quer traduzir do Português para o Inglês: ");
            text.PtToEn();
            break;

        case "En":
        
            System.out.println("Digite o texto que você quer traduzir do Inglês para o Português: ");
            text.EnToPt();
            break;

        case "DetectaPt":
        
            System.out.println("Digite o texto em qualquer idioma para traduzir em Português: ");
            text.DetectaToPt();
            break;

        case "DetectaEn":
        
            System.out.println("Digite o texto em qualquer idioma para traduzir em Inglês: ");
            text.DetectaToEn();
            break;

        case "DetectaEs":
        
            System.out.println("Digite o texto em qualquer idioma para traduzir em Espanhol: ");
            text.DetectaToEs();
            break;
        }

        sc.close();
    }
}
