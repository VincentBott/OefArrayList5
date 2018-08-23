package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        ArrayList<Persoon> personen = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        String naam;


        do {


            System.out.print("Geef naam (<RETURN> om te stoppen): ");

            naam = scanner.nextLine();

            /*
            int geboortejaar = 0;
            int geboortemaand = 0;
            int geboortedag = 0;
            */

            if (!naam.equals("")) {


                System.out.print("Geef geboortejaar: ");

                int geboortejaar = Integer.parseInt(scanner.nextLine());

                System.out.print("Geef geboortemaand: ");

                int geboortemaand = Integer.parseInt(scanner.nextLine());

                System.out.print("Geef geboortedag: ");

                int geboortedag = Integer.parseInt(scanner.nextLine());


                Persoon persoon = new Persoon(naam, geboortejaar, geboortemaand, geboortedag);

                personen.add(persoon);
            }


        } while (!naam.equals(""));


        Collections.reverse(personen);

        for (Persoon person: personen) {

            System.out.printf("\n%s is %d jaar oud.\n", person.getNaam(), person.getLeeftijd());
        }
    }

}



