package ch.css;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MastermindLeonie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = null;
        System.out.println("Wie heisst du?");
        String eingabe = sc.next();
        System.out.println("Guten Tag, " + eingabe + ". Zuerst eine kurze Spiel Erklärung:");
        System.out.println("Es wird ein Farbcode mit vier Farben generiert, welchen du durch Raten heraus finden musst.\nEine Farbe kann auch mehrmals vorkommen. \nNach jeder geratenen Runde erfährst du bei wie vielen deiner Eingaben die Farbe und die Position stimmt \nund wie oft eine der geratenen Farben in der Kombination vorkommt.(an der falschen Position) \nDu startest, indem du vier der acht Farben in einer gewünschten Reihenfolge eingibst. \nDas Ziel ist es in wenigen Spielrunden die Farbkombination heraus zu finden. \nSchaffst du die Farbkombination zu finden in zwölf oder weniger Runden hast du gewonnen.");

        System.out.println("Zur Auswahl stehen folgende Farben:\n1 Blau\n2 Rot\n3 Gelb\n4 Grün\n5 Schwarz\n6 Weiss\n7 Lila\n8 Orange");

        System.out.println("Herzlichen Glückwunsch, du hast das Spiel gewonnen. Willst du erneut spielen? (Bitte klein schreiben)");


        Scanner Scanner = new Scanner(System.in);

        String wiederholung = Scanner.nextLine();

        if (wiederholung.equals("ja")) {
            System.out.println("Spielwiederholung");
        } else {
            System.out.println("Spiel beendet. \nVielen dank für deine Zeit.");
        }


    }

}