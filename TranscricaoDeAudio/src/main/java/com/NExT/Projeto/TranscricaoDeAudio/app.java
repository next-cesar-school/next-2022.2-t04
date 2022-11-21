package com.NExT.Projeto.TranscricaoDeAudio;

import java.util.Scanner;

import com.NExT.Projeto.TranscricaoDeAudio.service.Traduzir;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escolha o Idioma: PT = Português, EN = Inglês");
        String escolha = sc.next();

        if (escolha.equals(escolha)) {
            Traduzir texto = new Traduzir();
            System.out.println("Digite o texto que você quer traduzir do Português para o Inglês: ");
            texto.PtToEn();
        }

        sc.close();
    }
}
