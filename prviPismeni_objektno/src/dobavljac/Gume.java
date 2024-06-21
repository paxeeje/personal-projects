package dobavljac;

public class Gume {
    private String imedobavljaca="Pirelli";
    private String drzavadobavljacaguma="Italy";

    private String imeguma="P Zero";

    public Gume(String imedobavljaca, String drzavadobavljacaguma, String imeguma) {
        this.imedobavljaca = imedobavljaca;
        this.drzavadobavljacaguma = drzavadobavljacaguma;
        this.imeguma = imeguma;
    }

    public static class Slick extends Gume{
        private String boje;
        private String No;

        private Integer speed;
        private Integer grip;
        private Integer durability;
        private String tread;
        private String drivingconditions;
        public Slick(String imedobavljaca, String drzavadobavljacaguma, String imeguma,String No, String boje, String tread, String drivingconditions, Integer speed, Integer grip, Integer durability) {
            super(imedobavljaca, drzavadobavljacaguma, imeguma);
            this.boje=boje;
            this.No=No;
            this.speed=speed;
            this.grip=grip;
            this.durability=durability;
            this.tread=tread;
            this.drivingconditions=drivingconditions;
        }
    }

    public static class Mokre extends Gume{
        private String  boje;
        private String tread;
        private String drivingcondition;


        public Mokre(String imedobavljaca, String drzavadobavljacaguma, String imeguma, String boje, String tread, String drivingcondition) {
            super(imedobavljaca, drzavadobavljacaguma, imeguma);

            this.boje = boje;
            this.tread = tread;
            this.drivingcondition = drivingcondition;
        }
    }


}
