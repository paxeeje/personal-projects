/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sezona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Petar Obradovic
 */
public class Dogadjaj implements Comparable<Dogadjaj> {
    LocalDate datum;     // Zadatak 3

    public Dogadjaj(LocalDate datum){
        this.datum = datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getDatum() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd");
        String datumStr = formatter.format(datum);
        return datumStr;
    }


    @Override
    public int compareTo(Dogadjaj dogadjaj) {
        return this.datum.compareTo(dogadjaj.datum);
    }


}