package com.NExT.Projeto.TranscricaoDeAudio.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.speech.v1.LongRunningRecognizeMetadata;
import com.google.cloud.speech.v1.LongRunningRecognizeResponse;
import com.google.cloud.speech.v1.RecognitionAudio;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.SpeechRecognitionAlternative;
import com.google.cloud.speech.v1.SpeechRecognitionResult;
import com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding;
import com.google.protobuf.ByteString;


public class Audiotranslate {
    
    public String audioToEnglish() throws IOException, InterruptedException, ExecutionException {
        SpeechClient speechClient = SpeechClient.create();

        Path path = Paths.get("C:/Users/Pichau/Desktop/next-2022.2-t04/TranscricaoDeAudio/src/main/java/com/NExT/Projeto/TranscricaoDeAudio/audio/audioteste.m4a");
        byte[] data = Files.readAllBytes(path);
        ByteString audioBytes = ByteString.copyFrom(data);
        
        RecognitionConfig config = RecognitionConfig.newBuilder().setEnableAutomaticPunctuation(true)
                                    .setEncoding(AudioEncoding.LINEAR16)
                                    .setSampleRateHertz(48000)
                                    .setLanguageCode("pt-BR")
                                    .build();

        RecognitionAudio audio = RecognitionAudio.newBuilder().setContent(audioBytes).build();
        OperationFuture<LongRunningRecognizeResponse, LongRunningRecognizeMetadata> response =
            speechClient.longRunningRecognizeAsync(config, audio);
        
        while (!response.isDone()) {
            System.out.println("Esperando responder");
            Thread.sleep(10000);
        }    
       
        List<SpeechRecognitionResult> results = response.get().getResultsList();

        for (SpeechRecognitionResult result : results) {
            SpeechRecognitionAlternative alternative = result.getAlternativesList().get(0);
            return alternative.getTranscript();
        }
        return null;
    }
}
