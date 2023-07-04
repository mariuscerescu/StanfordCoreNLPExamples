package org.example;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.nlp.Pipeline;

import java.nio.channels.Pipe;
import java.util.List;

public class NER {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "Mă numesc Marius, am 21 de ani și lucrez la Google";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabelList){

            String ner = coreLabel.ner();

            System.out.println(coreLabel.originalText() + " - " + ner);

        }


    }

}
