package org.nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {

    private static Properties properties;
    private static String propertiesName = "tokenize, ssplit, pos, lemma, ner, parse, sentiment";
    private static StanfordCoreNLP stanfordCoreNLP = null;

    static {
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
    }

    private Pipeline(){}

    public static synchronized StanfordCoreNLP getPipeline(){

        if(stanfordCoreNLP == null){
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        }

        return stanfordCoreNLP;

    }

}
