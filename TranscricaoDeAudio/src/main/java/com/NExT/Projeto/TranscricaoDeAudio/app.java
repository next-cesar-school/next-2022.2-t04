package com.NExT.Projeto.TranscricaoDeAudio;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import com.NExT.Projeto.TranscricaoDeAudio.service.Audiotranslate;
import com.NExT.Projeto.TranscricaoDeAudio.service.Traduzir;

public class app {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        Scanner sc = new Scanner (System.in);
        //Traduzir text = new Traduzir();
        Audiotranslate audio = new Audiotranslate();
        //System.out.println("Digite seu texto: ");
        //String phrase = sc.nextLine();
        //System.out.println("Para qual idioma você quer traduzir? ");
        //String target = sc.nextLine();
        
        //String funciona = audio.audioToEnglish();
        System.out.println("Passei aqui!");
        //System.out.println(funciona);
        System.out.println("Agora aqui!");

        //text.Translation(phrase, target);
        
    /*    switch (choice) {
        
        case "Pt":

            text.Translation(phrase, "Pt");
            break;

        case "En":
        
            text.Translation(phrase, "En");
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

        case "DetectaIt":
        
            System.out.println("Digite o texto em qualquer idioma para traduzir em Italiano: ");
            text.DetectaToIt();
            break;

        case "Audio":
            audio.audioToEnglish(); 
        } */

        sc.close(); 
    }
}