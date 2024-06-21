/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sezona;

import java.time.LocalDate;

/**
 *
 * @author CJ
 */

public class Runda extends Dogadjaj {
    private int round;
    private GrandPrix gp;
    private Staza staza;


    public Runda(int round, LocalDate datum, GrandPrix gp, Staza staza) {
        super(datum);
        this.round = round;
        this.gp = gp;
        this.staza= staza;
    }

    public void setRunda(int round) {
        this.round = round;
    }

    public void setGp(GrandPrix gp) {
        this.gp = gp;
    }

    public void setStaza(Staza staza) {
        this.staza = staza;
    }

    public void otkaziRundu(String tbc) {
        gp.setGpNaziv(tbc);
    }

    public Staza getStaza() {
        return staza;
    }

    @Override
    public String toString() {
        return "\nRunda " + round + ": " + getDatum() + ",  " + gp.getGpNaziv() + ",  " + staza.getLokacija() + ",  " + staza.getDrzava();
    }


}