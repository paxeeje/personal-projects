package sezona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Kalendar {
    private String title;
    private int brRundi;
    // private List<Object> kalendar = new ArrayList();
    private List<Dogadjaj> kalendar = new ArrayList();


    public Kalendar(String title) {
        this.title = title;
    }

    public void dodajDogadjaj(Dogadjaj dogadjaj) {
        this.kalendar.add(dogadjaj);
    }

    public void sortiraj() {
        Collections.sort(kalendar);
    }


    @Override
    public String toString() {
        return title + kalendar;
    }


}