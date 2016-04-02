/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author administrator
 */
public class Translator {
    
    private String[] adjektiv = {
        "stor",
        "liten",
        "stark",
        "svag",
        "mjuk",
        "hård",
        "snabb",
        "vacker",
        "ljus",
        "mörk"
    };
    
    private String[] substantiv = {
        "en lönehöjning",
        "en lönesänkning",
        "en fotboja",
        "en katt",
        "en hund",
        "ett hus",
        "ett barn",
        "ett elstängsel",
        "ljen datorus",
        "ett golv"
    };

    private String[] verb = {
        "springa",
        "ljuga",
        "flyga",
        "se",
        "vara",
        "äta",
        "mäta",
        "gå",
        "röra",
        "resa"
    };
    
    public String getAdjektiv(int index){
        return adjektiv[index];
    }
    
    public String getSubstantiv(int index){
        return substantiv[index];
    }
    
    public String getVerb(int index){
        return verb[index];
    }
    
    /*
    public enum Strings {
    STRING_ONE("ONE"),
    STRING_TWO("TWO")
    ;

    private final String text;

    /**
     * @param text
     
    private Strings(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     
    @Override
    public String toString() {
        return text;
    }
}*/
    
}
