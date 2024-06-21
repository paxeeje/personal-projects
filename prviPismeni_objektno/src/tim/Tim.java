package tim;

import dobavljac.ProizvodjacMotora;

import java.util.ArrayList;
import java.util.List;

// Outer klasa Tim
public class Tim {


    private String nazivTima;

    private String sediste;

    private Menadzer sefTima;

    private List<Vozac> vozac = new ArrayList();

    // Konstruktor Outer klase
    public Tim(String nazivTima, String sediste) {
        this.nazivTima = nazivTima;
    }

    // Seteri Outer klase
    public void setSefTima(Menadzer sefTima) {
        this.sefTima = sefTima;
    }

    public void setVozac(Vozac vozac) {
        this.vozac.add(vozac);
    }
    // Modrlanovic
    public void obrisivozaca(Vozac vozac)
    {
        this.vozac.remove(vozac);
    }
    public void setNazivTima(String nazivTima) {
        this.nazivTima = nazivTima;
    }


    // Geteri Outer klase
    public String getNazivTima() {
        return nazivTima;
    }

    //Konstruktorи Inner klase (napravljenи zbog pistupa Inner klasi, inače nema potrebe za njimа)
    public Konstruktor konstruktor = new Konstruktor();
    public Bolid bolid = new Bolid();

    @Override
    public String toString() {
        return "Tim: " + nazivTima + ", " + konstruktor.getKonstruktor()
                + ", " + "Sef Tima: " + sefTima.getMenadzer()
                + ", \nVozači: " + vozac +  ", \nBolid: " + bolid.getBolid()
                + ", \nSasija: " + bolid.getModelSasije() + " "  + "\n";
    }


    // Inner klasa Konstruktor
    public class Konstruktor {
        private String nazivKonstruktora;
        private String sediste;
        private String drzava;

        //Modrlanovic
        public void setNazivKonstruktora(String nazivKonstruktora) {
            this.nazivKonstruktora = nazivKonstruktora;
        }

        // Konstruktori Inner klase
        public Konstruktor() {
        }

        public Konstruktor(String nazivKonstruktora, String sediste, String drzava) {
            konstruktor.nazivKonstruktora = nazivKonstruktora;
            konstruktor.sediste = sediste;
            konstruktor.drzava = drzava;
        }

        // Geteri Inner klase
        public String getKonstruktor() {
            return  nazivKonstruktora + ", " + drzava;
        }

        @Override
        public String toString() {
            return "\nKonstruktor: " + konstruktor.nazivKonstruktora + ", "
                    + konstruktor.sediste + ", " + konstruktor.drzava;
        }
    } // kraj Inner klase Konstruktor


    // Inner klasa Bolid
    public class Bolid {
        private String bolidModel;
        private Sasija sasija;
        private String motor;
        private String menjac;
        private String gume;


        // Konstruktori Inner klase
        public Bolid() {
        }

        public Bolid(String bolidModel, Sasija sasija, String motor, String menjac, String gume) {
            bolid.bolidModel = bolidModel;
            bolid.sasija = sasija;
            bolid.motor = motor;
            bolid.menjac = menjac;
            bolid.gume = gume;
        }

        public void setModelSasije(Sasija sasija) {
            this.sasija = sasija;
        }

        // Getteri Inner klase
        public String getBolid() {
            return  motor + ", " + bolidModel;
        }

        public Sasija getModelSasije() {  // Lambda
            return bolid.sasija;
        }


        @Override
        public String toString() {
            return "Bolid{" + "bolidModel=" + bolidModel + ", sasija=" + sasija + ", motor=" + motor + ", menjac=" + menjac + ", gume=" + gume + '}';
        }





    } // kraj Inner klase Bolid

} // kraj Outer klase Tim