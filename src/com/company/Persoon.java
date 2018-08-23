package com.company;

import java.time.LocalDate;


public class Persoon {


    private String naam;

    private LocalDate geboortedatum;



    public Persoon(String naam, int geboortejaar, int geboortemaand, int geboortedag) {

        this.naam = naam;

        this.geboortedatum = LocalDate.of(geboortejaar, geboortemaand, geboortedag);

    }



    public int getLeeftijd() {


        /* De onderstaande manier werkt ook.


        LocalDate vandaag = LocalDate.now();

        leeftijd = vandaag.getYear() - geboortedatum.getYear();


        LocalDate verjaardag = geboortedatum.plusYears(leeftijd);


        if (verjaardag.compareTo(vandaag) > 0){
            leeftijd--;
        }
        */

        /*  De onderstaande, eigen manier is niet volledig juist.

        if (this.geboortedatum.getMonthValue() == vandaag.getMonthValue()) {
            if (this.geboortedatum.getDayOfYear() < vandaag.getDayOfYear())
                leeftijd--;
        }

        if (this.geboortedatum.getMonthValue() < vandaag.getMonthValue())
                leeftijd--;
        */


        // De onderstaande manier is de werkende versie van de docent, Jef.

        LocalDate vandaag = LocalDate.now();

        int leeftijd = vandaag.getYear() - geboortedatum.getYear();

        if (geboortedatum.getDayOfYear() > vandaag.getDayOfYear()){
            leeftijd --;
        }
        return leeftijd;

    }


    public String getNaam() {

        return this.naam;
    }

}
