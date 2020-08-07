package ch.css;

import java.util.Random;
import java.util.Scanner;

public class mastermind {
    public static void main(String[] args) {
        boolean start = true;
        while (start = true) {
            start = false;

            System.out.println("___  ___          _                      _           _ \n" +
                    "|  \\/  |         | |                    (_)         | |\n" +
                    "| .  . | __ _ ___| |_ ___ _ __ _ __ ___  _ _ __   __| |\n" +
                    "| |\\/| |/ _` / __| __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |\n" +
                    "| |  | | (_| \\__ \\ ||  __/ |  | | | | | | | | | | (_| |\n" +
                    "\\_|  |_/\\__,_|___/\\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|\n" +
                    "                                                       \n" +
                    "                                                       ");

            try (Scanner sc = new Scanner(System.in)) {

                System.out.println("Wähle 1, um das Spiel zu starten.");
                System.out.println("Wähle 2, um eine Anleitung zu sehen.");
                String choice1 = sc.nextLine();
                String choice2 = "";
                if (choice1.equals("2")) {
                    System.out.println("------------------------------");
                    System.out.println("Es wird ein Farbcode mit vier Farben generiert, welchen du durch Raten heraus finden musst.\nEine Farbe kann auch mehrmals vorkommen. \nNach jeder geratenen Runde erfährst du bei wie vielen deiner Eingaben die Farbe und die Position stimmt \nund wie oft eine der geratenen Farben in der Kombination vorkommt.(an der falschen Position) \nDu startest, indem du vier der acht Farben in einer gewünschten Reihenfolge eingibst. \nDas Ziel ist es in wenigen Spielrunden die Farbkombination heraus zu finden. \nSchaffst du die Farbkombination zu finden in zwölf oder weniger Runden hast du gewonnen.");
                    try (Scanner sc2 = new Scanner(System.in)) {
                        System.out.println("------------------------------");
                        System.out.println("Wähle 1, um das Spiel zu starten");
                        choice2 = sc.nextLine();
                    }
                }
                if (choice1.equals("1") || choice2.equals("1")) {
                    System.out.println("Zur Auswahl stehen folgende Farben:\n[1] Blau\n[2] Rot\n[3] Gelb\n[4] Grün\n[5] Schwarz\n[6] Weiss\n[7] Lila\n[8] Orange\n------------------------------");

                    int round = 1;
                    int tries = 12;
                    int a = 0;

                    //convert randomInt to a colour
                    int blue = 0;
                    int red = 1;
                    int yellow = 2;
                    int green = 3;
                    int black = 4;
                    int white = 5;
                    int lila = 6;
                    int orange = 7;

                    String[] colours = {"", "", "", ""};
                    boolean[] correctPositionColours = {false, false, false, false};
                    String[] colourInput = {"", "", "", ""};


                    while (a < 4) {

                        //generate 4 random numbers
                        Random random = new Random();
                        int upperbound = 7;
                        int randomInt = random.nextInt(upperbound);


                        if (randomInt == blue) {
                            //System.out.println("Blau");
                            colours[a] = "1";
                        } else if (randomInt == red) {
                            //System.out.println("Rot");
                            colours[a] = "2";
                        } else if (randomInt == yellow) {
                            //System.out.println("Gelb");
                            colours[a] = "3";
                        } else if (randomInt == green) {
                            //System.out.println("Grün");
                            colours[a] = "4";
                        } else if (randomInt == black) {
                            //System.out.println("Schwarz");
                            colours[a] = "5";
                        } else if (randomInt == white) {
                            //System.out.println("Weiss");
                            colours[a] = "6";
                        } else if (randomInt == lila) {
                            //System.out.println("Lila");
                            colours[a] = "7";
                        } else if (randomInt == orange) {
                            //System.out.println("Orange");
                            colours[a] = "8";
                        }

                        a += 1;


                    }
                    a = 0;
                    System.out.println(colours[0]);
                    System.out.println(colours[1]);
                    System.out.println(colours[2]);
                    System.out.println(colours[3]);


                    try (Scanner scanner = new Scanner(System.in)) {
                        int correctColoursPosition = 0;
                        int correctColours = 0;
                        int ab = 0;
                        while (correctColoursPosition <= 3) {

                            System.out.println(round + ". Runde");
                            int b = 0;
                            int c = 1;
                            int d = 2;
                            int e = 3;


                            int colourNumber = 1;
                            if (colourNumber == 4) {
                                colourNumber -= 3;
                            }
                            int bc = 0;
                            int cd = 0;
                            while (cd <= 0) {
                                while (bc <= 3) {
                                    System.out.println("Colour " + colourNumber + ": ");
                                    colourInput[b] = scanner.nextLine();
                                    colourNumber += 1;


                                    if (correctPositionColours[b] == false) {         //at beginning: b=0
                                        if (colourInput[b].equals(colours[b])) {
                                            if (b == 4) {
                                                b -= 4;
                                            }
                                            if (c == 4) {
                                                c -= 4;
                                            }
                                            if (d == 4) {
                                                d -= 4;
                                            }
                                            if (e == 4) {
                                                e -= 4;
                                            }
                                            correctColoursPosition += 1;
                                            ab += 1;
                                            correctPositionColours[b] = true;


                                        }
                                        b += 1;
                                        c += 1;
                                        d += 1;
                                        e += 1;

                                    }
                                    bc += 1;
                                }
                                b = 0;
                                c = 1;
                                d = 2;
                                e = 3;


                                int de = 0;
                                while (de <= 3) {
                                    if (b == 4) {
                                        b -= 4;
                                    }
                                    if (c == 4) {
                                        c -= 4;
                                    }
                                    if (d == 4) {
                                        d -= 4;
                                    }
                                    if (e == 4) {
                                        e -= 4;
                                    }
                                    if (correctPositionColours[b] == false) {

                                        if (colourInput[b].equals(colours[b])) {
                                            correctColours += 1;
                                            correctPositionColours[b] = true;

                                        }
                                    }
                                    if (correctPositionColours[c] == false) {
                                        if (colourInput[b].equals(colours[c])) {
                                            correctColours += 1;
                                            correctPositionColours[c] = true;
                                        }
                                    }
                                    if (correctPositionColours[d] == false) {
                                        if (colourInput[b].equals(colours[d])) {
                                            correctColours += 1;
                                            correctPositionColours[d] = true;
                                        }
                                    }
                                    if (correctPositionColours[e] == false) {
                                        if (colourInput[b].equals(colours[e])) {
                                            correctColours += 1;
                                            correctPositionColours[e] = true;
                                        }
                                    }

                                    b += 1;
                                    c += 1;
                                    d += 1;
                                    e += 1;
                                    de += 1;

                                }

                                cd += 1;
                            }
                            System.out.println("Richtig positionierte Farben: [" + correctColoursPosition + "]");
                            System.out.println("------------------------------");
                            System.out.println("Stimmende Farben: [" + correctColours + "]");
                            System.out.println("------------------------------");
                            correctPositionColours[0] = false;
                            correctPositionColours[1] = false;
                            correctPositionColours[2] = false;
                            correctPositionColours[3] = false;
                            if (correctColoursPosition <= 3) {
                                correctColours = 0;
                                correctColoursPosition = 0;
                            }
                            tries -= 1;
                            round += 1;


                        }
                        if (correctColoursPosition == 4) {
                            System.out.println(" _   _ _      _                   _ \n" +
                                    "| | | (_)    | |                 | |\n" +
                                    "| | | |_  ___| |_ ___  _ __ _   _| |\n" +
                                    "| | | | |/ __| __/ _ \\| '__| | | | |\n" +
                                    "\\ \\_/ / | (__| || (_) | |  | |_| |_|\n" +
                                    " \\___/|_|\\___|\\__\\___/|_|   \\__, (_)\n" +
                                    "                             __/ |  \n" +
                                    "                            |___/   ");
                            System.out.println("Herzlichen Glückwunsch, du hast das Spiel gewonnen. Willst du erneut spielen?");
                            System.out.println("Wähle 1, um nochmal zu spielen");
                            System.out.println("Wähle 2, um das Spiel zu beenden");


                            Scanner Scanner = new Scanner(System.in);

                            String reset = Scanner.nextLine();

                            if (reset.equals("1")) {
                                System.out.println("Spielwiederholung");
                                start = true;

                            } else if (reset.equals("2")) {

                                System.out.println(" _____ _            _____          _ \n" +
                                        "|_   _| |          |  ___|        | |\n" +
                                        "  | | | |__   ___  | |__ _ __   __| |\n" +
                                        "  | | | '_ \\ / _ \\ |  __| '_ \\ / _` |\n" +
                                        "  | | | | | |  __/ | |__| | | | (_| |\n" +
                                        "  \\_/ |_| |_|\\___| \\____/_| |_|\\__,_|\n" +
                                        "                                     \n" +
                                        "                                     ");
                                System.out.println("Spiel beendet. \nVielen dank für deine Zeit.");
                                System.exit(0);
                            } else {
                                System.out.println("Ungültige Eingabe!");
                                System.exit(0);
                            }
                        } else if (tries == 0) {
                            System.out.println("Du hast leider verloren!");
                            System.out.println("Lösung: " + colours[0] + colours[1] + colours[2] + colours[3]);
                            System.out.println("------------------------------");
                            System.out.println(" _____ _            _____          _ \n" +
                                    "|_   _| |          |  ___|        | |\n" +
                                    "  | | | |__   ___  | |__ _ __   __| |\n" +
                                    "  | | | '_ \\ / _ \\ |  __| '_ \\ / _` |\n" +
                                    "  | | | | | |  __/ | |__| | | | (_| |\n" +
                                    "  \\_/ |_| |_|\\___| \\____/_| |_|\\__,_|\n" +
                                    "                                     \n" +
                                    "                                     ");
                            System.out.println("Spiel beendet. \nVielen dank für deine Zeit.");
                            System.exit(0);
                        } else {
                            System.out.println("Ungültige Eingabe!");
                            System.exit(0);
                        }
                    }
                }

            }
        }
    }
}








