/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tim;

import tim.Tim.Konstruktor;

/**
 *
 * @author CJ
 */
public class Sasija {
    private String modelSasije;
    private Konstruktor konstruktor;

    public Sasija(String modelSasije, Konstruktor konstruktor) {
        this.modelSasije = modelSasije;
        this.konstruktor = konstruktor;
    }

//Modrlanovic


    public void setModelSasije(String modelSasije) {
        this.modelSasije = modelSasije;
    }

    @Override
    public String toString() {
        return  modelSasije  + konstruktor;
    }

}