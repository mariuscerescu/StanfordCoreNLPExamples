package org.example;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.nlp.Pipeline;

import java.util.List;

public class SentimentAnalysis {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "I really don't like you, I hate you with all my life, I hope you die";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> coreSentenceList = coreDocument.sentences();

        for(CoreSentence sentence : coreSentenceList){

            System.out.println(sentence.sentiment());

        }

    }

}
