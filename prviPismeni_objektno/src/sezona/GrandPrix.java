package sezona;

public class GrandPrix {

    private String gpNaziv;
    private Staza staza;
    private Sezona sezona;

    public GrandPrix(String gpNaziv, Staza staza) {
        this.gpNaziv = gpNaziv;
        this.staza = staza;
    }

    public void setGpSezona(Sezona sezona) {
        this.sezona = sezona;
    }

    public String getGpNaziv() {
        return gpNaziv;
    }

    public int getGpSezona() {
        return sezona.getBrSez();
    }

    public void setGpNaziv(String tbc) {
        gpNaziv = tbc;
        staza.obrisiLokacijaDrzava();
    }

    @Override
    public String toString() {
        return gpNaziv + ", " + staza.getNazivStaze() + ", " + staza.getLokacija();
    }
}