package dobavljac;

public class ProizvodjacMotora {
    private String nazivprodizvodjaca;
    private String drzavaproizvodjaca;

    public String getNazivprodizvodjaca() {
        return nazivprodizvodjaca;
    }

    public void setNazivprodizvodjaca(String nazivprodizvodjaca) {
        this.nazivprodizvodjaca = nazivprodizvodjaca;
    }

    public String getDrzavaproizvodjaca() {
        return drzavaproizvodjaca;
    }

    public void setDrzavaproizvodjaca(String drzavaproizvodjaca) {
        this.drzavaproizvodjaca = drzavaproizvodjaca;
    }

    public ProizvodjacMotora(String nazivprodizvodjaca, String drzavaproizvodjaca) {
        this.nazivprodizvodjaca = nazivprodizvodjaca;
        this.drzavaproizvodjaca = drzavaproizvodjaca;
    }

    public static class Motor extends ProizvodjacMotora {

        private String modelmotora;
        private Double zapreminamotora;
        private Integer snagamotora;
        public Motor(String nazivprodizvodjaca, String drzavaproizvodjaca, String modelmotora, Double zapreminamotora, Integer snagamotora) {
            super(nazivprodizvodjaca, drzavaproizvodjaca);
            this.modelmotora=modelmotora;
            this.zapreminamotora=zapreminamotora;
            this.snagamotora=snagamotora;

        }

        public String getModelmotora() {
            return modelmotora;
        }

        public void setModelmotora(String modelmotora) {
            this.modelmotora = modelmotora;
        }

        public Double getZapreminamotora() {
            return zapreminamotora;
        }

        public void setZapreminamotora(Double zapreminamotora) {
            this.zapreminamotora = zapreminamotora;
        }

        public Integer getSnagamotora() {
            return snagamotora;
        }

        public void setSnagamotora(Integer snagamotora) {
            this.snagamotora = snagamotora;
        }
    }

}

