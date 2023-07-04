package org.example;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.nlp.Pipeline;

import java.util.List;

public class POS {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "salut, ce mai faci, eu sunt foarte bine";

        CoreDocument document = new CoreDocument(text);

        stanfordCoreNLP.annotate(document);

        List<CoreLabel> coreLabelList = document.tokens();

        for(CoreLabel token : coreLabelList){

            String pos = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(token.originalText() + " " + pos);

        }

    }

}
