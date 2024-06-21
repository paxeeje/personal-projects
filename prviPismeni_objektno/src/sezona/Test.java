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

public class Test extends Dogadjaj {
    private int test;
    private Staza staza;


    public Test(int test, LocalDate datum, Staza staza) {
        super(datum);
        this.test = test;
        this.staza = staza;
    }

    @Override
    public String toString() {
        return "\nTest " + test + ": " + getDatum() + ",  " + staza.getLokacija() + ",  " + staza.getDrzava();
    }
}