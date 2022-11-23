package com.NExT.Projeto.TranscricaoDeAudio.service;

import java.io.IOException;
import java.util.List;

import com.google.cloud.speech.v1.RecognitionAudio;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.cloud.speech.v1.RecognizeResponse;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.SpeechRecognitionAlternative;
import com.google.cloud.speech.v1.SpeechRecognitionResult;
import com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding;


public class Audiotranslate {
    
    public String audioToEnglish() throws IOException {
        SpeechClient speechClient = SpeechClient.create();
        String path = "gs://cloud-samples-data/speech/brooklyn_bridge.raw";   

        RecognitionConfig config = RecognitionConfig.newBuilder()
                                    .setEncoding(AudioEncoding.LINEAR16)
                                    .setSampleRateHertz(16000)
                                    .setLanguageCode("en-US")
                                    .build();

        RecognitionAudio audio = RecognitionAudio.newBuilder().setUri(path).build();
        RecognizeResponse response = speechClient.recognize(config, audio);
        List<SpeechRecognitionResult> results = response.getResultsList();

        for (SpeechRecognitionResult result : results) {
            SpeechRecognitionAlternative alternative = result.getAlternativesList().get(0);
            return alternative.getTranscript();
        }
        return null;
    }

}
