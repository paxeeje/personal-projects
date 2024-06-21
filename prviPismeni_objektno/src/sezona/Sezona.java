package sezona;

import java.util.ArrayList;
import java.util.List;
import tim.Tim;



public class Sezona {

    private int brSez;

    private String godina;

    private Kalendar kalendar;

    private List<Tim> tim = new ArrayList();


    public Sezona(int brSez, String godina) {
        this.brSez = brSez;
        this.godina = godina;
    }

    public void setKalendar(Kalendar kalendar) {
        this.kalendar = kalendar;
    }

    public void dodajTim(Tim tim) {
        this.tim.add(tim);
    }

    public int getBrSez() {
        return brSez;
    }
    public String getGodina() {
        return godina;
    }

    // Upotreba Lambda izraza za prikaz Naziva tima iz objekta Tim
    public void getTim() {
        tim.forEach((Tim t) -> {System.out.println(t.getNazivTima()); });
    }


    @Override
    public String toString() {
        return "\n" + getGodina() + " Formula One World Championship \n" +  kalendar;
    }


}