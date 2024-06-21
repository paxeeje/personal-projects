/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sezona;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

/**
 *
 * @author CJ
 */
public class Staza implements Serializable {
    private String nazivStaze;
    private String lokacija;
    private String drzava;
    private String tipStaze; // Race, Street, Road  circuit
    private double duzinaStaze;
    private String smerVoznje; // u smeru kazaljke, suprotno
    private Object slikaStaze;
    private int brKrugova;  // 1. zadatak

    public Staza(String nazivStaze, String lokacija, String drzava, String tipStaze, double duzinaStaze, String smerVoznje) {
        this.nazivStaze = nazivStaze;
        this.lokacija = lokacija;
        this.drzava = drzava;
        this.tipStaze = tipStaze;
        this.duzinaStaze = duzinaStaze;
        this.smerVoznje = smerVoznje;
        brKrugova = (int)((305/duzinaStaze)+1);  // 1. zadatak 
    }

    public void setDuzinaStaze(int duzinaStaze) {
        this.duzinaStaze = duzinaStaze;
    }

    public double getDuzinaStaze() {
        return duzinaStaze;
    }

    public String getNazivStaze() {
        return nazivStaze;
    }

    public String getLokacija() {
        return lokacija;
    }
    public String getDrzava() {
        return drzava;
    }

    public int getBrKrugova() {  // 1. zadatak
        return  brKrugova;
    }

    public void obrisiLokacijaDrzava() {
        lokacija = "tbc";
        drzava = "tbc";
    }


    @Override
    public String toString() {
        return nazivStaze + ", " + lokacija + ", " + drzava + ", " + tipStaze + ", "
                + duzinaStaze + " km, " + smerVoznje + ", broj krugova: " + brKrugova + ", ";  // 1. zadatak
    }



}