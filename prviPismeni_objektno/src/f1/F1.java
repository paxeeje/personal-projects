/*
Формат датума који се приказује у решењу, а који је у изворном Дата формату, што подразумева да је у
променљивој која чува датум, спаковано и време и временска зона и још неки подаци, да се
преформатира тако да приказује само датум, у формату који ћете сами одабрати (нпр. 23. Feb 21 или
Feb-23-21 и сл.).
 */
package f1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate; // Java 8, umesto Date class
import java.util.ArrayList;
import java.util.List;

import dobavljac.Gume;
import dobavljac.ProizvodjacMotora;
import tim.Tim;
import sezona.Runda;
import sezona.Sezona;
import sezona.Kalendar;
import sezona.GrandPrix;
import sezona.Staza;
import sezona.Test;
import tim.Menadzer;
import tim.Osoba.Uloga;
import tim.Sasija;
import tim.Vozac;

/**
 *
 * @author CJ
 */
public class F1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     *
     */


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {

        // Staze - lista svih staza
        System.out.println("Staze koje zadovoljavaju FIA standarde: ");

        List<Staza> staze = new ArrayList();

        Staza albertParkCircuit = new Staza("Albert Park Circuit", "Melbourne", "Australia", "Street circuit", 5.303, "u smeru kazaljke");
        staze.add(albertParkCircuit);
        Staza bahrainInternationalCircuit = new Staza("Bahrain International Circuit", "Sakhir", "Bahrain", "Race circuit", 3.543, "u smeru kazaljke");
        staze.add(bahrainInternationalCircuit);
        Staza shanghaiInternationalcircuit = new Staza("Shanghai International Circuit", "Shanghai", "China", "Race circuit", 5.451, "u smeru kazaljke");
        Staza hanoiStreetCircuit = new Staza("Hanoi Street Circuit", "Hanoi", "Vietnam", "Street circuit", 5.613, "suprotno od smera kazaljke");
        Staza barcelonaCatalunya = new Staza("Circuit de Barcelona-Catalunya", "Montmeleo", "Spain", "Race circuit", 4.665, "u smeru kazaljke");
        Staza circuitDeMonaco = new Staza("Circuit de Monaco", "Monte Carlo", "Monaco", "Street circuit", 3.337, "u smeru kazaljke");
        Staza bakuCityCircuit = new Staza("Baku City Circuit", "Baku", "Azerbaijan", "Street circuit", 6.003, "suprotno od smera kazaljke");
        Staza circuitGillesVilleneuve = new Staza("Circuit Gilles Villeneuve", "Montreal", "Canada", "Street circuit", 4.361, "u smeru kazaljke");
        Staza circuitPaulRicard = new Staza("Circuit Paul Ricard", "Le Castellet", "France", "Race circuit", 5.842, "u smeru kazaljke");
        Staza redBullRing = new Staza("Red Bull Ring", "Spielberg", "Austria", "Race circuit", 4.318, "u smeru kazaljke");
        Staza silverstoneCircuit = new Staza("Silverstone Circuit", "Silverstone", "United Kingdom", "Race circuit", 5.891, "u smeru kazaljke");
        Staza hungaroring = new Staza("Hungaroring", "Mogyorod", "Hungary", "Race circuit", 4.381, "u smeru kazaljke");
        Staza circuitDeSpaFrancorchamps = new Staza("Circuit de Spa-Francorchamps", "Stavelot", "Belgium", "Race circuit", 7.004, "u smeru kazaljke");
        Staza circuitParkZandvoort = new Staza("Circuit Park Zandvoort", "Zandvoort", "Netherlands", "Race circuit", 4.252, "u smeru kazaljke");
        Staza autodromoNazionaleMonza = new Staza("Autodromo Nazionale Monza", "Monza", "Italy", "Race circuit", 5.793, "u smeru kazaljke");
        Staza sochiAutodrom = new Staza("Sochi Autodrom", "Sochi", "Russia", "Race circuit", 5.848, "u smeru kazaljke");
        Staza marinaBayStreetCircuit = new Staza("Marina Bay Street Circuit", "Singapore", "Singapore", "Street circuit", 5.063, "suprotno od smera kazaljke");
        Staza suzakaCircuit = new Staza("Suzaka Circuit", "Suzaka", "Japan", "Race circuit", 5.807, "deo u smeru kazaljke i deo suprotno od smera kazaljke");
        Staza circuitOfTheAmericas = new Staza("Circuit of the Americas", "Austin", "United States", "Race circuit", 5.513, "suprotno od smera kazaljke");
        Staza autodromoHermanosRodriguez = new Staza("Autodromo Hermanos Rodriguez", "Mexico City", "Mexico", "Race circuit", 4.304, "u smeru kazaljke");
        Staza interlagosCircuit = new Staza("Interlagos Circuit", "Sao Paulo", "Brazil", "Race circuit", 4.309, "suprotno od smera kazaljke");
        Staza jeddahStreetCircuit = new Staza("Jeddah Street Circuit", "Jeddah", "Saudi Arabia", "Street circuit", 7.154, "TBD");
        Staza yasMarinaCircuit = new Staza("Yas Marina Circuit", "Abu Dhabi", "United Arab Emirates", "Race circuit", 5.554, "suprotno od smera kazaljke");
        Staza autodromoInternacionalNelsonPiquet = new Staza("Autodromo International Nelson Piquet", "Rio de Janeiro", "Brasil", "Race circuit", 5.031, "suprotno od smera kazaljke");
        Staza autodromoEnzoEDinoFerrari = new Staza ("Autodromo Enzo e Dino Ferrari", "Imola", "Italy", "", 5.554, ""); //




        System.out.println(albertParkCircuit);
        System.out.println(bahrainInternationalCircuit);
        System.out.println(shanghaiInternationalcircuit);
        System.out.println(hanoiStreetCircuit);
        System.out.println(barcelonaCatalunya);
        System.out.println(circuitDeMonaco);
        System.out.println(bakuCityCircuit);
        System.out.println(circuitGillesVilleneuve);
        System.out.println(circuitPaulRicard);
        System.out.println(redBullRing);
        System.out.println(silverstoneCircuit);
        System.out.println(hungaroring);
        System.out.println(circuitDeSpaFrancorchamps);
        System.out.println(circuitParkZandvoort);
        System.out.println(autodromoNazionaleMonza);
        System.out.println(sochiAutodrom);
        System.out.println(marinaBayStreetCircuit);
        System.out.println(suzakaCircuit);
        System.out.println(circuitOfTheAmericas);
        System.out.println(autodromoHermanosRodriguez);
        System.out.println(interlagosCircuit);
        System.out.println(jeddahStreetCircuit);
        System.out.println(yasMarinaCircuit);
        System.out.println(autodromoInternacionalNelsonPiquet);
        System.out.println(autodromoEnzoEDinoFerrari); //


        // Vozaci - lista svih vozača (sadašnji i bivši vozači)
        System.out.println("\nF1 Vozači (svi):");

        //      Mercedes
        Vozac lh = new Vozac("Lewis", "Hamilton");
        lh.setBroj(44);
        lh.setNacionalnost("GB");
        lh.setUloga(Uloga.DRIVERFIRST);
        lh.prikaziVozac();

        Vozac vb = new Vozac("Valtteri", "Bottas");
        vb.setBroj(77);
        vb.setNacionalnost("Finland");
        vb.setUloga(Uloga.DRIVERFIRST);
        vb.setImaUgovor(true);

        //      Alpine
        Vozac fa = new Vozac("Fernando", "Alonso");
        fa.setBroj(14);
        fa.setNacionalnost("Spain");
        fa.setUloga(Uloga.DRIVERFIRST);
        fa.setImaUgovor(true);

        Vozac eo = new Vozac("Esteban", "Ocon");
        eo.setBroj(31);
        eo.setNacionalnost("France");
        eo.setUloga(Uloga.DRIVERFIRST);
        eo.setImaUgovor(true);

        //      Haas
        Vozac ms = new Vozac("Mick", "Schumacher");
        ms.setBroj(47);
        ms.setNacionalnost("Germany");
        ms.setUloga(Uloga.DRIVERFIRST);
        ms.setImaUgovor(true);

        Vozac nm = new Vozac("Nikita", "Mazepin");
        nm.setBroj(9);
        nm.setNacionalnost("Russia");
        nm.setUloga(Uloga.DRIVERFIRST);
        nm.setImaUgovor(true);

        //      McLaren
        Vozac dr = new Vozac("Daniel", "Ricciardo");
        dr.setBroj(3);
        dr.setNacionalnost("Australia");
        dr.setUloga(Uloga.DRIVERFIRST);
        dr.setImaUgovor(true);

        Vozac ln = new Vozac("Lando", "Norris");
        ln.setBroj(4);
        ln.setNacionalnost("GB");
        ln.setUloga(Uloga.DRIVERFIRST);
        ln.setImaUgovor(true);

        //      Alfa Romeo
        Vozac kr = new Vozac("Kimi", "Räikkönen");
        kr.setBroj(7);
        kr.setNacionalnost("Finland");
        kr.setUloga(Uloga.DRIVERFIRST);
        kr.setImaUgovor(true);

        Vozac ag = new Vozac("Antonio", "Giovinazzi");
        ag.setBroj(99);
        ag.setNacionalnost("Italy");
        ag.setUloga(Uloga.DRIVERFIRST);
        ag.setImaUgovor(true);

        //      Red Bull
        Vozac mv = new Vozac("Max", "Verstappen");
        mv.setBroj(33);
        mv.setNacionalnost("Netherlands");
        mv.setUloga(Uloga.DRIVERFIRST);
        mv.setImaUgovor(true);

        Vozac sp = new Vozac("Sergio", "Perez");
        sp.setBroj(11);
        sp.setNacionalnost("Mexico");
        sp.setUloga(Uloga.DRIVERFIRST);
        sp.setImaUgovor(true);

        //      Aston Martin
        Vozac sv = new Vozac("Sebastian", "Vettel");
        sv.setBroj(5);
        sv.setNacionalnost("Germany");
        sv.setUloga(Uloga.DRIVERFIRST);
        sv.setImaUgovor(true);

        Vozac ls = new Vozac("Lance", "Stroll");
        ls.setBroj(18);
        ls.setNacionalnost("Canada");
        ls.setUloga(Uloga.DRIVERFIRST);
        ls.setImaUgovor(true);

        // Ferrari
        Vozac cl = new Vozac("Charles", "Leclerc");
        cl.setBroj(16);
        cl.setNacionalnost("France");
        cl.setUloga(Uloga.DRIVERFIRST);
        cl.setImaUgovor(true);

        Vozac cs = new Vozac("Carlos", "Sainz");
        cs.setBroj(55);
        cs.setNacionalnost("Spain");
        cs.setUloga(Uloga.DRIVERFIRST);
        cs.setImaUgovor(true);

        //      AlphaTauri
        Vozac pg = new Vozac("Pierre", "Gasly");
        pg.setBroj(10);
        pg.setNacionalnost("France");
        pg.setUloga(Uloga.DRIVERFIRST);
        pg.setImaUgovor(true);

        Vozac yt = new Vozac("Yuki", "Tsunoda");
        yt.setBroj(22);
        yt.setNacionalnost("Japan");
        yt.setUloga(Uloga.DRIVERFIRST);
        yt.setImaUgovor(true);

        //      Williams
        Vozac gr = new Vozac("George", "Russell");
        gr.setBroj(63);
        gr.setNacionalnost("GB");
        gr.setUloga(Uloga.DRIVERFIRST);
        gr.setImaUgovor(true);

        Vozac nl = new Vozac("Nicholas", "Latifi");
        nl.setBroj(6);
        nl.setNacionalnost("Canada");
        nl.setUloga(Uloga.DRIVERFIRST);
        nl.setImaUgovor(true);

        System.out.println(lh.prikaziVozac());
        System.out.println(vb.prikaziVozac());
        System.out.println(fa.prikaziVozac());
        System.out.println(eo.prikaziVozac());
        System.out.println(ms.prikaziVozac());
        System.out.println(nm.prikaziVozac());
        System.out.println(dr.prikaziVozac());
        System.out.println(ln.prikaziVozac());
        System.out.println(kr.prikaziVozac());
        System.out.println(ag.prikaziVozac());
        System.out.println(mv.prikaziVozac());
        System.out.println(sp.prikaziVozac());
        System.out.println(sv.prikaziVozac());
        System.out.println(ls.prikaziVozac());
        System.out.println(cl.prikaziVozac());
        System.out.println(cs.prikaziVozac());
        System.out.println(pg.prikaziVozac());
        System.out.println(yt.prikaziVozac());
        System.out.println(gr.prikaziVozac());
        System.out.println(nl.prikaziVozac());


        // F1 Timovi - lista svih timova
        System.out.println("\nF1 Timovi (svi):");

        //Modrlanovic

        ProizvodjacMotora.Motor Mercedes=new ProizvodjacMotora.Motor("Mercedes", "Germany","Mercedes",1.6, 120);
        ProizvodjacMotora.Motor Ferrari=new ProizvodjacMotora.Motor("Ferrari", "Italy","Ferrari",1.6, 120);
        ProizvodjacMotora.Motor Renault=new ProizvodjacMotora.Motor("Renault", "France","Renault E-Tech",1.6, 120);
        ProizvodjacMotora.Motor AMGM12=new ProizvodjacMotora.Motor("Mercedes", "Germany","Mercedes-AMG M12",1.6, 120);
        ProizvodjacMotora.Motor AMGM11=new ProizvodjacMotora.Motor("Mercedes", "Germany","BWT Mercedes-AMG F1 M11",1.6, 120);
        ProizvodjacMotora.Motor Honda=new ProizvodjacMotora.Motor("Honda", "Japan","Honda",1.6, 120);
        ProizvodjacMotora.Motor HONDARA621H=new ProizvodjacMotora.Motor("Honda", "Japan","Honda",1.6, 120);


        //      Mercedes
        Tim tMercedes = new Tim("Mercedes-AMG Petronas F1 Team", "Brackley");
        Tim.Konstruktor kMercedes = tMercedes.new Konstruktor("Mercedes", "Brackley", "UK");
        Menadzer tw = new Menadzer("Toto", "Wolf", Uloga.TEAMPRINCIPAL);
        tMercedes.setSefTima(tw);
        tMercedes.setVozac(lh);
        tMercedes.setVozac(vb);
        Sasija w11 = new Sasija("F1 W11 EQ Performance", kMercedes);
        Tim.Bolid m11 = tMercedes.new Bolid("M11",w11,Mercedes.getModelmotora(),"","");

        //      Ferrari
        Tim tFerrari = new Tim("Scuderia Ferrari Mission Winnow", "Maranello");
        Tim.Konstruktor kFerrari = tFerrari.new Konstruktor("Ferrari", "Maranello", "Italy");
        Menadzer mb = new Menadzer("Mattia", "Binotto", Uloga.TEAMPRINCIPAL);
        tFerrari.setSefTima(mb);
        tFerrari.setVozac(cl);
        tFerrari.setVozac(cs);
        Sasija sf21s = new Sasija("Ferrari SF21", kFerrari);
        Tim.Bolid sf21 = tFerrari.new Bolid("SF21",sf21s,Ferrari.getModelmotora(),"","");

        //      Alpine
        Tim tAlpine = new Tim("Alpine F1 Team", "Enstone");
        Tim.Konstruktor kAlpine = tAlpine.new Konstruktor("Alpine-Renault", "Enstone", "UK");
        Menadzer lr = new Menadzer("Laurent", "Rossi", Uloga.TEAMPRINCIPAL);
        tAlpine.setSefTima(lr);
        tAlpine.setVozac(eo);
        tAlpine.setVozac(fa);
        Sasija a521s = new Sasija("Alpine A521", kAlpine);
        Tim.Bolid a521 = tAlpine.new Bolid("SF21",a521s,Renault.getModelmotora(),"","");

        //      Haas
        Tim tHaas = new Tim("Haas F1 Team", "Kannapolis");
        Tim.Konstruktor kHaas = tHaas.new Konstruktor("Haas-Ferrari", "Kannapolis", "US");
        Menadzer gs = new Menadzer("Guenther", "Steiner", Uloga.TEAMPRINCIPAL);
        tHaas.setSefTima(gs);
        tHaas.setVozac(ms);
        tHaas.setVozac(nm);
        Sasija sHaas = new Sasija("tbc", kHaas); // nemaju sasiju, TBA, nemaju bolid
        Tim.Bolid bHaas = tHaas.new Bolid("tba",sHaas,Ferrari.getModelmotora(),"","");

        //      McLaren
        Tim tMcLaren = new Tim("McLaren F1 Team", "Woking"/*, "Andreas Seidl"*/);
        Tim.Konstruktor kMcLaren = tMcLaren.new Konstruktor("McLaren-Mercedes", "Woking", "UK");
        Menadzer as = new Menadzer("Andreas ", "Seidl", Uloga.TEAMPRINCIPAL);
        tMcLaren.setSefTima(as);
        tMcLaren.setVozac(ln);
        tMcLaren.setVozac(dr);
        Sasija mcl35ms = new Sasija("McLaren MCL35", kMcLaren);
        Tim.Bolid mcl35m = tMcLaren.new Bolid("MCL35M",mcl35ms,AMGM12.getModelmotora(),"","");

        //      Alfa Romeo
        Tim tAlfaRomeo = new Tim("Alfa Romeo Racing ORLEN", "Hinwil"/*, "Frederic Vasse*/);
        Tim.Konstruktor kAlfaRomeo = tAlfaRomeo.new Konstruktor("Alfa Romeo Racing-Ferrari", "Hinwil", "Switzerland");
        Menadzer fv = new Menadzer("Frederic", "Vasse", Uloga.TEAMPRINCIPAL);
        tAlfaRomeo.setSefTima(fv);
        tAlfaRomeo.setVozac(kr);
        tAlfaRomeo.setVozac(ag);
        Sasija C41s = new Sasija("Alfa Romeo Racing C41", kAlfaRomeo);
        Tim.Bolid C41 = tAlfaRomeo.new Bolid("C41",C41s,Ferrari.getModelmotora(),"","");

        //      Red Bull
        Tim tRedBull = new Tim("Red Bull Racing", "Milton Keynes"/*, "Christian Horner"*/);
        Tim.Konstruktor kRedBull = tRedBull.new Konstruktor("Red Bull Racing-Honda", "Milton Keynes", "UK");
        Menadzer ch = new Menadzer("Christian", "Horner", Uloga.TEAMPRINCIPAL);
        tRedBull.setSefTima(ch);
        tRedBull.setVozac(mv);
        tRedBull.setVozac(sp);
        Sasija rb16bs = new Sasija("Red Bull Racing RB16", kRedBull);
        Tim.Bolid rb16b = tRedBull.new Bolid("RB16B",rb16bs,Honda.getModelmotora(),"","");

        //      Aston Martin
        Tim tAstonMartin = new Tim("Aston Martin Cognizant Formula One Team", "Silverstone"/*, "Andrew Green"*/);
        Tim.Konstruktor kAstonMartin = tAstonMartin.new Konstruktor("Aston Martin-Mercedes", "Silverstone", "UK");
        Menadzer ag1 = new Menadzer("Andrew", "Green", Uloga.TEAMPRINCIPAL);
        tAstonMartin.setSefTima(ag1);
        tAstonMartin.setVozac(ls);
        tAstonMartin.setVozac(sv);
        Sasija ams = new Sasija("tbc", kAstonMartin); // nemaju sasiju, TBA, nemaju bolid
        Tim.Bolid am = tAstonMartin.new Bolid("tba",ams,Mercedes.getModelmotora(),"","");

        //     AlphaTauri
        Tim tAlphaTauri = new Tim("Scuderia AlphaTauri Honda", "Faenza"/*, "Franz Tost"*/);
        Tim.Konstruktor kAlphaTauri = tAlphaTauri.new Konstruktor("AlphaTauri-Honda", "Faenza", "Italy");
        Menadzer ft = new Menadzer("Franz", "Tost", Uloga.TEAMPRINCIPAL);
        tAlphaTauri.setSefTima(ft);
        tAlphaTauri.setVozac(pg);
        tAlphaTauri.setVozac(yt);
        Sasija at02s = new Sasija("AlphaTauri AT02", kAlphaTauri);
        Tim.Bolid at02 = tAlphaTauri.new Bolid("AT02",at02s,HONDARA621H.getModelmotora(),"","");

        //     Williams
        Tim tWilliams = new Tim("Williams Racing", "Grove"/*, "Simon Roberts"*/);
        Tim.Konstruktor kWilliams = tWilliams.new Konstruktor("Williams-Mercedes", "Grove", "UK");
        Menadzer sr = new Menadzer("Simon", "Roberts", Uloga.TEAMPRINCIPAL);
        tWilliams.setSefTima(sr);
        tWilliams.setVozac(gr);
        tWilliams.setVozac(nl);
        Sasija fw43bs = new Sasija("Williams FW43", kWilliams);
        Tim.Bolid fw43b = tWilliams.new Bolid("FW43B",fw43bs,Mercedes.getModelmotora(),"","");

        //     RacingPoint
        Tim tRacingPoint = new Tim("Sport Pesa Racing Point F1 Team", "Northamptonshire"/*, "Otmar Szafnauer"*/);
        Tim.Konstruktor kRacingPoint = tRacingPoint.new Konstruktor("Racing Point UK Limited", "Silverstone", "UK");
        Menadzer os = new Menadzer("Otmar", "Szafnauer", Uloga.TEAMPRINCIPAL);
        tRacingPoint.setSefTima(os);
        tRacingPoint.setVozac(sp);
        tRacingPoint.setVozac(ls);
        Sasija rp20s = new Sasija("Racing Point RP20", kRacingPoint);
        Tim.Bolid rp20 = tRacingPoint.new Bolid("RP20",rp20s,AMGM11.getModelmotora(),"","");


        System.out.println(tMercedes);
        System.out.println(tFerrari);
        System.out.println(tAlpine);
        System.out.println(tHaas);
        System.out.println(tMcLaren);
        System.out.println(tAlfaRomeo);
        System.out.println(tRedBull);
        System.out.println(tAstonMartin);
        System.out.println(tAlphaTauri);
        System.out.println(tWilliams);
        System.out.println(tRacingPoint);




        // F1 GP - lista svih Grand Prix
        System.out.println("\nGrand Prix  (svi): ");

        GrandPrix gpStyrian = new GrandPrix("Styrian GP", redBullRing);
        GrandPrix gp70thAnniversary = new GrandPrix("70th Anniversary GP", silverstoneCircuit);
        GrandPrix gpAustralian = new GrandPrix("Australian GP", albertParkCircuit);
        GrandPrix gpBahrain = new GrandPrix("Bahrain GP", bahrainInternationalCircuit);
        GrandPrix gpChinese = new GrandPrix("Chinese GP", shanghaiInternationalcircuit);
        GrandPrix gpVietnamese = new GrandPrix("Vietnam GP", hanoiStreetCircuit);
        GrandPrix gpSpanish = new GrandPrix("Spanish GP", barcelonaCatalunya);
        GrandPrix gpMonaco = new GrandPrix("Monaco GP", circuitDeMonaco);
        GrandPrix gpAzerbaijan = new GrandPrix("Azerbaijan GP", bakuCityCircuit);
        GrandPrix gpCanadian = new GrandPrix("Canadian GP", circuitGillesVilleneuve);
        GrandPrix gpFrench = new GrandPrix("French GP", circuitPaulRicard);
        GrandPrix gpAustrian = new GrandPrix("Austrian GP", redBullRing);
        GrandPrix gpBritish = new GrandPrix("British GP", silverstoneCircuit);
        GrandPrix gpHungarian = new GrandPrix("Hungarian GP", hungaroring);
        GrandPrix gpBelgian = new GrandPrix("Belgian GP", circuitDeSpaFrancorchamps);
        GrandPrix gpDutch = new GrandPrix("Dutch GP", circuitParkZandvoort);
        GrandPrix gpItalian = new GrandPrix("Italian GP", autodromoNazionaleMonza);
        GrandPrix gpRussian = new GrandPrix("Russian GP", sochiAutodrom);
        GrandPrix gpSingapore = new GrandPrix("Singapore GP", marinaBayStreetCircuit);
        GrandPrix gpJapanese = new GrandPrix("Japanese GP", suzakaCircuit);
        GrandPrix gpUnitedStates = new GrandPrix("United States GP", circuitOfTheAmericas);
        GrandPrix gpMexican = new GrandPrix("Mexican GP", autodromoHermanosRodriguez);
        GrandPrix gpBrazilian = new GrandPrix("Brazilian GP", interlagosCircuit);
        GrandPrix gpSaudiArabian = new GrandPrix("Saudi Arabian GP", jeddahStreetCircuit);
        GrandPrix gpAbuDhabi = new GrandPrix("Abu Dhabi GP", yasMarinaCircuit);
        GrandPrix gpEmiliaRomagna = new GrandPrix("Emilia Romagna GP", autodromoEnzoEDinoFerrari); //

        System.out.println(gpAustrian);
        System.out.println(gpStyrian);
        System.out.println(gpBritish);
        System.out.println(gp70thAnniversary);
        System.out.println(gpSpanish);



        // Sezona 2020 - prošla sezona
        Sezona s2020 = new Sezona(70, "2020");

        // Određivanje koji GP će se voziti u Sezoni 2020
        gpAustrian.setGpSezona(s2020);
        gpStyrian.setGpSezona(s2020);
        gpBritish.setGpSezona(s2020);
        gp70thAnniversary.setGpSezona(s2020);
        gpSpanish.setGpSezona(s2020);

        // Kreiranje kalendara za sezonu 2020
        Kalendar k2020 = new Kalendar("F1 2020 Season Calendar");
        s2020.setKalendar(k2020);

        // Kreiranje Rundi i Testova
        Runda r3s2020 = new Runda(4, LocalDate.of(2021, 8, 2) , gpBritish, silverstoneCircuit);
        Runda r4s2020 = new Runda(5, LocalDate.of(2021, 8, 9), gp70thAnniversary, silverstoneCircuit);
        Runda r5s2020 = new Runda(6, LocalDate.of(2021, 8, 16), gpSpanish, barcelonaCatalunya);
        Test t1s2020 = new Test(1, LocalDate.of(2021, 2, 21), barcelonaCatalunya);
        Runda r1s2020 = new Runda(1, LocalDate.of(2021, 7, 5), gpAustrian, redBullRing);
        Runda r2s2020 = new Runda(2, LocalDate.of(2021, 7, 12), gpStyrian, redBullRing);

        // Dodeljivanje Dogadjaja (Rundi i Testova) Kalendaru za Sezonu 2020
        k2020.dodajDogadjaj(r3s2020);
        k2020.dodajDogadjaj(r4s2020);
        k2020.dodajDogadjaj(r5s2020);
        k2020.dodajDogadjaj(t1s2020);
        k2020.dodajDogadjaj(r1s2020);
        k2020.dodajDogadjaj(r2s2020);

        // Prikazivanje nesortiranog Kalendara
        System.out.println(s2020);

        // Sortiranje Dogadjaja i prikazivanje sortiranog Kalendara
        k2020.sortiraj();
        System.out.println(s2020);

        // Kreiranje lista Timova koji se takmiče u Sezoni 2020
        System.out.println("\nTimovi 2020:");
        s2020.dodajTim(tMercedes);
        s2020.dodajTim(tFerrari);
        s2020.dodajTim(tAlpine);
        s2020.dodajTim(tHaas);
        s2020.dodajTim(tMcLaren);
        s2020.dodajTim(tAlfaRomeo);
        s2020.dodajTim(tRedBull);
        s2020.dodajTim(tAlphaTauri);
        s2020.dodajTim(tWilliams);
        s2020.dodajTim(tRacingPoint);

        // Prikazivanje liste Timova koji se takmiče u Sezoni 2020
        s2020.getTim(); //Lambda


        // Sezona 2021
        Sezona s2021 = new Sezona(71, "2021");


        // Određivanje koji GP će se voziti u Sezoni 2021
        gpAustralian.setGpSezona(s2021);
        gpBahrain.setGpSezona(s2021);
        gpChinese.setGpSezona(s2021);
        gpVietnamese.setGpSezona(s2021);
        gpSpanish.setGpSezona(s2021);
        gpMonaco.setGpSezona(s2021);
        gpAzerbaijan.setGpSezona(s2021);
        gpCanadian.setGpSezona(s2021);
        gpFrench.setGpSezona(s2021);
        gpAustrian.setGpSezona(s2021);
        gpBritish.setGpSezona(s2021);
        gpHungarian.setGpSezona(s2021);
        gpBelgian.setGpSezona(s2021);
        gpDutch.setGpSezona(s2021);
        gpItalian.setGpSezona(s2021);
        gpRussian.setGpSezona(s2021);
        gpSingapore.setGpSezona(s2021);
        gpJapanese.setGpSezona(s2021);
        gpUnitedStates.setGpSezona(s2021);
        gpMexican.setGpSezona(s2021);
        gpBrazilian.setGpSezona(s2021);
        gpSaudiArabian.setGpSezona(s2021);
        gpAbuDhabi.setGpSezona(s2021);

        // Kreiranje Kalendara za Sezonu 2021
        Kalendar k2021 = new Kalendar("F1 2021 Season Calendar");
        s2021.setKalendar(k2021);

        // Kreiranje Rundi i Testova
        Runda r1s2021 = new Runda(1, LocalDate.of(2021, 3, 21), gpAustralian, albertParkCircuit);
        Runda r2s2021 = new Runda(2, LocalDate.of(2021, 3, 28), gpBahrain, bahrainInternationalCircuit );
        Runda r3s2021 = new Runda(3, LocalDate.of(2021, 4, 11), gpChinese, shanghaiInternationalcircuit);
        Runda r4s2021 = new Runda(4, LocalDate.of(2021, 4, 25), gpVietnamese, hanoiStreetCircuit);
        Runda r5s2021 = new Runda(5, LocalDate.of(2021, 5, 9), gpSpanish, barcelonaCatalunya);
        Runda r6s2021 = new Runda(6, LocalDate.of(2021, 5, 23), gpMonaco, circuitDeMonaco);
        Runda r7s2021 = new Runda(7, LocalDate.of(2021, 6, 6), gpAzerbaijan, bakuCityCircuit);
        Runda r8s2021 = new Runda(8, LocalDate.of(2021, 6, 13), gpCanadian, circuitGillesVilleneuve);
        Runda r9s2021 = new Runda(9, LocalDate.of(2021, 6, 27), gpFrench, circuitPaulRicard);
        Runda r10s2021 = new Runda(10, LocalDate.of(2021, 7, 4), gpAustrian, redBullRing);
        Runda r11s2021 = new Runda(11, LocalDate.of(2021, 7, 18), gpBritish, silverstoneCircuit);
        Runda r12s2021 = new Runda(12, LocalDate.of(2021, 8, 1), gpHungarian, hungaroring);
        Runda r13s2021 = new Runda(13, LocalDate.of(2021, 8, 29), gpBelgian, circuitDeSpaFrancorchamps);
        Runda r14s2021 = new Runda(14, LocalDate.of(2021, 9, 5), gpDutch, circuitParkZandvoort);
        Runda r15s2021 = new Runda(15, LocalDate.of(2021, 9, 12), gpItalian, autodromoNazionaleMonza);
        Runda r16s2021 = new Runda(16, LocalDate.of(2021, 9, 26), gpRussian, sochiAutodrom);
        Runda r17s2021 = new Runda(17, LocalDate.of(2021, 10, 3), gpSingapore, marinaBayStreetCircuit);
        Runda r18s2021 = new Runda(18, LocalDate.of(2021, 10, 10), gpJapanese, suzakaCircuit);
        Runda r19s2021 = new Runda(19, LocalDate.of(2021, 10, 24), gpUnitedStates, circuitOfTheAmericas);
        Runda r20s2021 = new Runda(20, LocalDate.of(2021, 10, 31), gpMexican, autodromoHermanosRodriguez);
        Runda r21s2021 = new Runda(21, LocalDate.of(2021, 12, 14), gpBrazilian, interlagosCircuit);
        Runda r22s2021 = new Runda(22, LocalDate.of(2021, 11, 28), gpSaudiArabian, jeddahStreetCircuit);
        Runda r23s2021 = new Runda(23, LocalDate.of(2021, 12, 5), gpAbuDhabi, yasMarinaCircuit);


        // Dodeljivanje Rundi i Testova Kalendaru za Sezonu 2021
        k2021.dodajDogadjaj(r1s2021);
        k2021.dodajDogadjaj(r2s2021);
        k2021.dodajDogadjaj(r3s2021);
        k2021.dodajDogadjaj(r4s2021);
        k2021.dodajDogadjaj(r5s2021);
        k2021.dodajDogadjaj(r6s2021);
        k2021.dodajDogadjaj(r7s2021);
        k2021.dodajDogadjaj(r8s2021);
        k2021.dodajDogadjaj(r9s2021);
        k2021.dodajDogadjaj(r10s2021);
        k2021.dodajDogadjaj(r11s2021);
        k2021.dodajDogadjaj(r12s2021);
        k2021.dodajDogadjaj(r13s2021);
        k2021.dodajDogadjaj(r14s2021);
        k2021.dodajDogadjaj(r15s2021);
        k2021.dodajDogadjaj(r16s2021);
        k2021.dodajDogadjaj(r17s2021);
        k2021.dodajDogadjaj(r18s2021);
        k2021.dodajDogadjaj(r19s2021);
        k2021.dodajDogadjaj(r20s2021);
        k2021.dodajDogadjaj(r21s2021);
        k2021.dodajDogadjaj(r22s2021);
        k2021.dodajDogadjaj(r23s2021);

        // Prikazivanje Kalendara (prvo kreiranog) za Sezonu 2021
        System.out.println(s2021);

        // Kreiranje lista Timova koji se takmiče u Sezoni 2021
        System.out.println("\nTimovi 2021:");
        s2021.dodajTim(tMercedes);
        s2021.dodajTim(tFerrari);
        s2021.dodajTim(tAlpine);
        s2021.dodajTim(tHaas);
        s2021.dodajTim(tMcLaren);
        s2021.dodajTim(tAlfaRomeo);
        s2021.dodajTim(tRedBull);
        s2021.dodajTim(tAlphaTauri);
        s2021.dodajTim(tWilliams);
        s2021.dodajTim(tAstonMartin);

        // Prikazivanje liste Timova koji se takmiče u Sezoni 2021
        s2021.getTim(); //Lambda


        // Izmene Kalendara 2021     //  1. zadatak
        r1s2021.setDatum(LocalDate.of(2021, 3, 28));
        r1s2021.setGp(gpBahrain);
        r1s2021.setStaza(bahrainInternationalCircuit);

        r2s2021.setDatum(LocalDate.of(2021, 4, 18));
        r2s2021.setGp(gpEmiliaRomagna);
        r2s2021.setStaza(autodromoEnzoEDinoFerrari);

        r3s2021.setDatum(LocalDate.of(2021, 5, 2));
        r3s2021.otkaziRundu("tbc");

        r4s2021.setDatum(LocalDate.of(2021, 5, 9));
        r4s2021.setGp(gpSpanish);
        r4s2021.setStaza(barcelonaCatalunya);

        r6s2021.setRunda(5);
        r7s2021.setRunda(6);
        r8s2021.setRunda(7);
        r9s2021.setRunda(8);
        r10s2021.setRunda(9);
        r11s2021.setRunda(10);
        r12s2021.setRunda(11);
        r13s2021.setRunda(12);
        r14s2021.setRunda(13);
        r15s2021.setRunda(14);
        r16s2021.setRunda(15);
        r17s2021.setRunda(16);
        r18s2021.setRunda(17);
        r19s2021.setRunda(18);
        r20s2021.setRunda(19);

        r21s2021.setRunda(20);
        r21s2021.setDatum(LocalDate.of(2021, 11, 7));

        r5s2021.setRunda(21);
        r5s2021.setDatum(LocalDate.of(2021, 11, 21));
        r5s2021.setGp(gpAustralian);
        r5s2021.setStaza(albertParkCircuit);

        r22s2021.setDatum(LocalDate.of(2021, 12, 5));
        r23s2021.setDatum(LocalDate.of(2021, 12, 12));

        Test test1 = new Test(1, LocalDate.of(2021, 3, 12), bahrainInternationalCircuit);
        k2021.dodajDogadjaj(test1);

        // Sortiranje Kalendara nakon unetih izmena
        k2021.sortiraj();
        System.out.println(s2021);

        // Izmena, Hamilton je potpisao ugovor
        lh.setImaUgovor(true);
        System.out.println("\n" + lh.prikaziVozac());


        // Write file staze.ser
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("staze.ser"));
        oos.writeObject(staze);

        System.out.println(staze.toString());

        // Read from file staze.ser
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("staze.ser"));
        staze = (ArrayList<Staza>) ois.readObject();

        System.out.println("Read file staze.ser");

        // Izmena dužine staze - staza je učitana iz fajla
        for (Staza staza : staze)
            if (staza.getNazivStaze().equals("Albert Park Circuit"))
                staza.setDuzinaStaze(10000);

        System.out.println(staze.toString());




        //Modrlanovic resenje
        Sezona s2024 = new Sezona(75, "2024");

        gpHungarian.setGpSezona(s2024);
        gpBelgian.setGpSezona(s2024);
        gpDutch.setGpSezona(s2024);

        Kalendar k2024 = new Kalendar("F1 2024 Season Calendar");
        s2024.setKalendar(k2024);

        Test t1s2024 = new Test(1, LocalDate.of(2024, 2, 21), bahrainInternationalCircuit);
        Runda r1s2024 = new Runda(1, LocalDate.of(2024, 6, 21), gpHungarian, hungaroring);
        Runda r2s2024 = new Runda(2, LocalDate.of(2024, 6, 28), gpBelgian, circuitDeSpaFrancorchamps);
        Runda r3s2024 = new Runda(3, LocalDate.of(2024, 8, 25), gpDutch, circuitParkZandvoort);

        k2024.dodajDogadjaj(t1s2024);
        k2024.dodajDogadjaj(r1s2024);
        k2024.dodajDogadjaj(r2s2024);
        k2024.dodajDogadjaj(r3s2024);

        System.out.println(s2024);

        Vozac zg = new Vozac("Zhou", "Guanyu");
        zg.setBroj(24);
        zg.setNacionalnost("China");
        zg.setUloga(Uloga.DRIVERFIRST);
        zg.setImaUgovor(true);

        Vozac km = new Vozac("Kevin", "Magnussen");
        km.setBroj(20);
        km.setNacionalnost("Denmark");
        km.setUloga(Uloga.DRIVERFIRST);
        km.setImaUgovor(true);

        Vozac nh = new Vozac("Nico", "Hulkenberg");
        nh.setBroj(27);
        nh.setNacionalnost("Germany");
        nh.setUloga(Uloga.DRIVERFIRST);
        nh.setImaUgovor(true);

        Vozac op = new Vozac("Oscar", "Piastri");
        op.setBroj(81);
        op.setNacionalnost("Australia");
        op.setUloga(Uloga.DRIVERFIRST);
        op.setImaUgovor(true);

        Vozac lsa = new Vozac("Logan", "Sargeant");
        lsa.setBroj(2);
        lsa.setNacionalnost("USA");
        lsa.setUloga(Uloga.DRIVERFIRST);
        lsa.setImaUgovor(true);

        Vozac aa = new Vozac("Alexander", "Albon");
        aa.setBroj(23);
        aa.setNacionalnost("Thailand");
        aa.setUloga(Uloga.DRIVERFIRST);
        aa.setImaUgovor(true);

        tAlfaRomeo.setNazivTima("TBA Ferrari");
        tAlphaTauri.setNazivTima("TBA HONDA RBT");
        kAlfaRomeo.setNazivKonstruktora("TBA-Ferrari");
        kAlphaTauri.setNazivKonstruktora("TBA-Honda RBPT");

        Sasija TBA = new Sasija("TBA",kAlphaTauri);
        Sasija TBA1 = new Sasija("TBA",kFerrari);
        Sasija TBA2 = new Sasija("TBA",kMcLaren);


        tAlphaTauri.bolid.setModelSasije(TBA);
        tFerrari.bolid.setModelSasije(TBA1);
        tMcLaren.bolid.setModelSasije(TBA2);


        tAlfaRomeo.obrisivozaca(kr);
        tAlfaRomeo.obrisivozaca(ag);
        tAlfaRomeo.setVozac(zg);
        tAlfaRomeo.setVozac(vb);


        tAlphaTauri.obrisivozaca(pg);
        tAlphaTauri.setVozac(dr);
        tAlphaTauri.obrisivozaca(fa);
        tAlphaTauri.setVozac(pg);

        tAstonMartin.obrisivozaca(sv);
        tAstonMartin.setVozac(fa);

        tHaas.obrisivozaca(ms);
        tHaas.obrisivozaca(nm);
        tHaas.setVozac(km);
        tHaas.setVozac(nh);

        tMcLaren.obrisivozaca(dr);
        tMcLaren.setVozac(op);

        tMercedes.obrisivozaca(vb);
        tMercedes.setVozac(gr);

        tWilliams.obrisivozaca(gr);
        tWilliams.obrisivozaca(nl);
        tWilliams.setVozac(lsa);
        tWilliams.setVozac(aa);

        tAlpine.obrisivozaca(fa);
        tAlpine.setVozac(pg);

        System.out.println("\nTimovi 2024:");
        s2024.dodajTim(tAlfaRomeo);
        s2024.dodajTim(tAlphaTauri);
        s2024.dodajTim(tAlpine);
        s2024.dodajTim(tAstonMartin);
        s2024.dodajTim(tFerrari);
        s2024.dodajTim(tHaas);
        s2024.dodajTim(tMcLaren);
        s2024.dodajTim(tMercedes);
        s2024.dodajTim(tRedBull);
        s2024.dodajTim(tWilliams);
        s2024.getTim();

        System.out.println("");
        System.out.println("Timovi 2024, detaljnije:");
        System.out.println(tMercedes);
        System.out.println(tAlfaRomeo);
        System.out.println(tAlphaTauri);
        System.out.println(tAlpine);
        System.out.println(tAstonMartin);
        System.out.println(tFerrari);
        System.out.println(tHaas);
        System.out.println(tMcLaren);
        System.out.println(tMercedes);
        System.out.println(tRedBull);
        System.out.println(tWilliams);


        Gume.Slick HardC0=new Gume.Slick("Pirelli","Italy","P Zero","C0","Hard(white)","Slick","Dry",6,6,1);
        Gume.Slick Hard1=new Gume.Slick("Pirelli","Italy","P Zero","C1","Hard(white)","Slick","Dry",5,5,2);
        Gume.Slick HardC2=new Gume.Slick("Pirelli","Italy","P Zero","C2","Hard(white)","Slick","Dry",4,4,3);
        Gume.Slick HardC3=new Gume.Slick("Pirelli","Italy","P Zero","C3","Hard(white)","Slick","Dry",3,3,4);
        Gume.Slick MediumC1=new Gume.Slick("Pirelli","Italy","P Zero","C1","Medium(yellow)","Slick","Dry",5,5,2);
        Gume.Slick MediumC2=new Gume.Slick("Pirelli","Italy","P Zero","C2","Medium(yellow)","Slick","Dry",4,4,3);
        Gume.Slick MediumC3=new Gume.Slick("Pirelli","Italy","P Zero","C3","Medium(yellow)","Slick","Dry",3,3,4);
        Gume.Slick MediumC4=new Gume.Slick("Pirelli","Italy","P Zero","C4","Medium(yellow)","Slick","Dry",2,2,5);
        Gume.Slick SoftC2=new Gume.Slick("Pirelli","Italy","P Zero","C2","Soft(red)","Slick","Dry",4,4,3);
        Gume.Slick SoftC3=new Gume.Slick("Pirelli","Italy","P Zero","C3","Soft(red)","Slick","Dry",3,3,4);
        Gume.Slick SoftC4=new Gume.Slick("Pirelli","Italy","P Zero","C4","Soft(red)","Slick","Dry",2,2,5);
        Gume.Slick SoftC5=new Gume.Slick("Pirelli","Italy","P Zero","C5","Soft(red)","Slick","Dry",1,1,6);
        Gume.Mokre Intermediate=new Gume.Mokre("Pirelli","Italy","P Zero","Green","Treaded","Wet (light standing water)");
        Gume.Mokre Wet=new Gume.Mokre("Pirelli","Italy","P Zero","Blue","Treaded","Wet (Heavy standing water)");


    }



}