package ch.css;

import java.util.Random;
import java.util.Scanner;

public class mastermind {
    public static void main(String[] args) {
        boolean start = true;
        int scanner = 1;
        try (Scanner sc = new Scanner(System.in)) {
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


                System.out.println("Wähle 1, um das Spiel zu starten.");
                System.out.println("Wähle 2, um eine Anleitung zu sehen.");
                String choice1 = sc.nextLine();
                String choice2 = "";
                if (choice1.equals("2")) {
                    System.out.println("------------------------------");
                    System.out.println("Es wird ein Farbcode mit vier Farben generiert, welchen du durch Raten heraus finden musst.\nEine Farbe kann auch mehrmals vorkommen. \nNach jeder geratenen Runde erfährst du bei wie vielen deiner Eingaben die Farbe und die Position stimmt \nund wie oft eine der geratenen Farben in der Kombination vorkommt.(an der falschen Position) \nDu startest, indem du vier der acht Farben in einer gewünschten Reihenfolge eingibst. \nDas Ziel ist es in wenigen Spielrunden die Farbkombination heraus zu finden. \nSchaffst du die Farbkombination zu finden in zwölf oder weniger Runden hast du gewonnen.");

                    System.out.println("------------------------------");
                    System.out.println("Wähle 1, um das Spiel zu starten");
                    choice2 = sc.nextLine();

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
                    String[] coloursSmall = {"", "", "", ""};
                    boolean[] correctPositionColours = {false, false, false, false};
                    String[] colourInput = {"", "", "", ""};


                    while (a < 4) {

                        //generate 4 random numbers
                        Random random = new Random();
                        int upperbound = 7;
                        int randomInt = random.nextInt(upperbound);


                        if (randomInt == blue) {
                            //System.out.println("Blau");
                            colours[a] = "Blau";
                            coloursSmall[a] = "blau";
                        } else if (randomInt == red) {
                            //System.out.println("Rot");
                            colours[a] = "Rot";
                            coloursSmall[a] = "rot";
                        } else if (randomInt == yellow) {
                            //System.out.println("Gelb");
                            colours[a] = "Gelb";
                            coloursSmall[a] = "gelb";
                        } else if (randomInt == green) {
                            //System.out.println("Grün");
                            colours[a] = "Grün";
                            coloursSmall[a] = "grün";
                        } else if (randomInt == black) {
                            //System.out.println("Schwarz");
                            colours[a] = "Schwarz";
                            coloursSmall[a] = "schwarz";
                        } else if (randomInt == white) {
                            //System.out.println("Weiss");
                            colours[a] = "Weiss";
                            coloursSmall[a] = "weiss";
                        } else if (randomInt == lila) {
                            //System.out.println("Lila");
                            colours[a] = "Lila";
                            coloursSmall[a] = "lila";
                        } else if (randomInt == orange) {
                            //System.out.println("Orange");
                            colours[a] = "Orange";
                            coloursSmall[a] = "orange";
                        }

                        a += 1;


                    }
                    a = 0;
                    System.out.println(colours[0]);
                    System.out.println(colours[1]);
                    System.out.println(colours[2]);
                    System.out.println(colours[3]);


                    int correctColoursPosition = 0;
                    int correctColours = 0;
                    int ab = 0;
                    while (correctColoursPosition <= 3 && round <= 12) {

                        System.out.println(round + ". Runde");
                        System.out.println("------------------------------");

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
                        if (tries > 0) {
                            while (cd <= 0) {
                                while (bc <= 3) {
                                    String[] validColours = {"Blau", "blau", "Rot", "rot", "Gelb", "gelb", "Grün", "grün", "Schwarz", "schwarz", "Weiss", "weiss", "Lila", "lila", "Orange", "orange"};
                                    System.out.println(colourNumber + ". Farbe : ");
                                    colourInput[b] = sc.nextLine();
                                    if (!colourInput[b].equals(validColours[0]) &&
                                            !colourInput[b].equals(validColours[1]) &&
                                            !colourInput[b].equals(validColours[2]) &&
                                            !colourInput[b].equals(validColours[3]) &&
                                            !colourInput[b].equals(validColours[4]) &&
                                            !colourInput[b].equals(validColours[5]) &&
                                            !colourInput[b].equals(validColours[6]) &&
                                            !colourInput[b].equals(validColours[7]) &&
                                            !colourInput[b].equals(validColours[8]) &&
                                            !colourInput[b].equals(validColours[9]) &&
                                            !colourInput[b].equals(validColours[10]) &&
                                            !colourInput[b].equals(validColours[11]) &&
                                            !colourInput[b].equals(validColours[12]) &&
                                            !colourInput[b].equals(validColours[13]) &&
                                            !colourInput[b].equals(validColours[14]) &&
                                            !colourInput[b].equals(validColours[15])) {
                                        System.out.println("Ungültige Eingabe!");
                                        colourInput[b] = sc.nextLine();
                                    }                                               

                                    colourNumber += 1;


                                    if (correctPositionColours[b] == false) {         //at beginning: b=0
                                        if (colourInput[b].equals(colours[b]) || colourInput[b].equals(coloursSmall[b])) {
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

                                        if (colourInput[b].equals(colours[b]) || colourInput[b].equals(coloursSmall[b])) {
                                            correctColours += 1;
                                            correctPositionColours[b] = true;

                                        }
                                    }
                                    if (correctPositionColours[c] == false) {
                                        if (colourInput[b].equals(colours[c]) || colourInput[b].equals(coloursSmall[c])) {
                                            correctColours += 1;
                                            correctPositionColours[c] = true;
                                        }
                                    }
                                    if (correctPositionColours[d] == false) {
                                        if (colourInput[b].equals(colours[d]) || colourInput[b].equals(coloursSmall[d])) {
                                            correctColours += 1;
                                            correctPositionColours[d] = true;
                                        }
                                    }
                                    if (correctPositionColours[e] == false) {
                                        if (colourInput[b].equals(colours[e]) || colourInput[b].equals(coloursSmall[e])) {
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

                            System.out.println("Richtig positionierte Farben (rot) : [" + correctColoursPosition + "]");
                            System.out.println("------------------------------");
                            System.out.println("Stimmende Farben (weiss) : [" + correctColours + "]");
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


                        String reset = sc.nextLine();

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
                        System.out.println("Lösung: " + colours[0] + " " + colours[1] + " " + colours[2] + " " + colours[3]);
                        System.out.println("------------------------------");
                        System.out.println("______      __           _   _ \n" +
                                "|  _  \\    / _|         | | | |\n" +
                                "| | | |___| |_ ___  __ _| |_| |\n" +
                                "| | | / _ \\  _/ _ \\/ _` | __| |\n" +
                                "| |/ /  __/ ||  __/ (_| | |_|_|\n" +
                                "|___/ \\___|_| \\___|\\__,_|\\__(_)\n" +
                                "                               \n" +
                                "                               ");

                        System.out.println("Wähle 1, um nochmal zu spielen");
                        System.out.println("Wähle 2, um das Spiel zu beenden");
                        String reset2 = sc.nextLine();

                        if (reset2.equals("1")) {
                            System.out.println("Spielwiederholung");
                            start = true;
                        } else if (reset2.equals("2")) {

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
                        }
                    }

                }
            }
        }
    }
}














