package com.NExT.Projeto.TranscricaoDeAudio.service;

import java.util.Scanner;

import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import com.google.cloud.translate.Translate.TranslateOption;

public class Traduzir  {
    
    public void PtToEn() {
        Scanner sc = new Scanner(System.in);
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        
        String texto = sc.nextLine();
        Translation translation = 
        translate.translate(texto, 
        TranslateOption.sourceLanguage("pt"),
        TranslateOption.targetLanguage("en"));

        System.out.println(translation.getTranslatedText());
        
        sc.close();
        
    }
    
    public void EnToPt() {
        Scanner sc = new Scanner(System.in);
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        
        String texto = sc.nextLine();
        Translation translation = 
        translate.translate(texto, 
        TranslateOption.sourceLanguage("en"),
        TranslateOption.targetLanguage("pt"));

        System.out.println(translation.getTranslatedText());
        
        sc.close();
    }

    public void DetectaToPt() {
        Scanner sc = new Scanner(System.in);
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        String texto = sc.nextLine();
        Detection detection = translate.detect(texto);
        String idiomaDetectado = detection.getLanguage();
        Translation translation = 
        translate.translate(texto, 
        TranslateOption.sourceLanguage(idiomaDetectado),
        TranslateOption.targetLanguage("pt"));

        System.out.println(translation.getTranslatedText());
        
        sc.close();
    }
    
    public void DetectaToFr() {
        Scanner sc = new Scanner(System.in);
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        String texto = sc.nextLine();
        Detection detection = translate.detect(texto);
        String idiomaDetectado = detection.getLanguage();
        Translation translation = 
        translate.translate(texto, 
        TranslateOption.sourceLanguage(idiomaDetectado),
        TranslateOption.targetLanguage("fr"));

        System.out.println(translation.getTranslatedText());
        
        sc.close();
    }

    public void DetectaToEn() {
        Scanner sc = new Scanner(System.in);
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        String texto = sc.nextLine();
        Detection detection = translate.detect(texto);
        String idiomaDetectado = detection.getLanguage();
        Translation translation = 
        translate.translate(texto, 
        TranslateOption.sourceLanguage(idiomaDetectado),
        TranslateOption.targetLanguage("en"));

        System.out.println(translation.getTranslatedText());
        
        sc.close();
    }

    public void DetectaToEs() {
        Scanner sc = new Scanner(System.in);
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        String texto = sc.nextLine();
        Detection detection = translate.detect(texto);
        String idiomaDetectado = detection.getLanguage();
        Translation translation = 
        translate.translate(texto, 
        TranslateOption.sourceLanguage(idiomaDetectado),
        TranslateOption.targetLanguage("es"));

        System.out.println(translation.getTranslatedText());
        
        sc.close();
    }

    public void DetectaToIt() { 
        Scanner sc = new Scanner(System.in);
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        String texto = sc.nextLine();
        Detection detection = translate.detect(texto);
        String idiomaDetectado = detection.getLanguage();
        Translation translation = 
        translate.translate(texto, 
        TranslateOption.sourceLanguage(idiomaDetectado),
        TranslateOption.targetLanguage("it"));

        System.out.println(translation.getTranslatedText());
        
        sc.close();
    }
}
