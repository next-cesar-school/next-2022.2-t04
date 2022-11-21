package com.NExT.Projeto.TranscricaoDeAudio.service;

import java.util.Scanner;

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
}
