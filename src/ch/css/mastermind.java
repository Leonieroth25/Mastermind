package ch.css;

import java.util.Random;
import java.util.Scanner;

public class mastermind {


    public static void main(String[] args) {
        String[] colourInput = {"", "", "", ""};
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
                    System.out.println("Es wird ein Farbcode mit vier Farben generiert, welchen du durch Raten herausfinden musst.\nEine Farbe kann auch mehrmals vorkommen. \nNach jeder geratenen Runde erfährst du bei wie vielen deiner Eingaben die Farbe und die Position stimmt \nund wie oft eine der geratenen Farben in der Kombination vorkommt.(an der falschen Position) \nDu startest, indem du vier der acht Farben in einer gewünschten Reihenfolge eingibst. \nDas Ziel ist es in wenigen Spielrunden die Farbkombination heraus zu finden. \nSchaffst du die Farbkombination in zwölf oder weniger Runden zu finden, so hast du das Spiel gewonnen.");

                    System.out.println("------------------------------");
                    System.out.println("Wähle 1, um das Spiel zu starten");
                    choice2 = sc.nextLine();

                }

                if (choice1.equals("1") || choice2.equals("1")) {


                    int round = 1;
                    int tries = 12;
                    int generatedColoursIndex = 0;


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


                    while (generatedColoursIndex < 4) {

                        //generate 4 random numbers
                        Random random = new Random();
                        int upperbound = 8;
                        int randomInt = random.nextInt(upperbound);


                        if (randomInt == blue) {
                            colours[generatedColoursIndex] = "blau";
                        } else if (randomInt == red) {
                            colours[generatedColoursIndex] = "rot";
                        } else if (randomInt == yellow) {
                            colours[generatedColoursIndex] = "gelb";
                        } else if (randomInt == green) {
                            colours[generatedColoursIndex] = "grün";
                        } else if (randomInt == black) {
                            colours[generatedColoursIndex] = "schwarz";
                        } else if (randomInt == white) {
                            colours[generatedColoursIndex] = "weiss";
                        } else if (randomInt == lila) {
                            colours[generatedColoursIndex] = "lila";
                        } else if (randomInt == orange) {
                            colours[generatedColoursIndex] = "orange";
                        }

                        generatedColoursIndex += 1;


                    }
                    //System.out.println(colours[0]);
                    //System.out.println(colours[1]);
                    //System.out.println(colours[2]);
                    //System.out.println(colours[3]);


                    int correctColoursPosition = 0;
                    int correctColours = 0;
                    while (correctColoursPosition <= 3 && round <= 12) {

                        System.out.println("------------------------------");
                        System.out.println("Zur Auswahl stehen folgende Farben:\n[1] Blau\n[2] Rot\n[3] Gelb\n[4] Grün\n[5] Schwarz\n[6] Weiss\n[7] Lila\n[8] Orange\n------------------------------");
                        System.out.println(round + ". Runde");
                        System.out.println("------------------------------");

                        int inputNumber = 0;

                        int colourNumber = 1;
                        if (colourNumber == 4) {
                            colourNumber -= 3;
                        }
                        int correctionIndex = 0;
                        int colorInputIndex = 0;
                        if (round < 13) {
                            inputNumber = 0;
                            while (colorInputIndex <= 3) {
                                if (inputNumber >= 4) {

                                }
                                String[] validColours = {"Blau", "blau", "Rot", "rot", "Gelb", "gelb", "Grün", "grün", "Schwarz", "schwarz", "Weiss", "weiss", "Lila", "lila", "Orange", "orange"};
                                System.out.println(colourNumber + ". Farbe : ");
                                colourInput[inputNumber] = sc.nextLine().toLowerCase();

                                while (!colourInput[inputNumber].equals(validColours[0]) &&
                                        !colourInput[inputNumber].equals(validColours[1]) &
                                                !colourInput[inputNumber].equals(validColours[2]) &&
                                        !colourInput[inputNumber].equals(validColours[3]) &&
                                        !colourInput[inputNumber].equals(validColours[4]) &&
                                        !colourInput[inputNumber].equals(validColours[5]) &&
                                        !colourInput[inputNumber].equals(validColours[6]) &&
                                        !colourInput[inputNumber].equals(validColours[7]) &&
                                        !colourInput[inputNumber].equals(validColours[8]) &&
                                        !colourInput[inputNumber].equals(validColours[9]) &&
                                        !colourInput[inputNumber].equals(validColours[10]) &&
                                        !colourInput[inputNumber].equals(validColours[11]) &&
                                        !colourInput[inputNumber].equals(validColours[12]) &&
                                        !colourInput[inputNumber].equals(validColours[13]) &&
                                        !colourInput[inputNumber].equals(validColours[14]) &&
                                        !colourInput[inputNumber].equals(validColours[15])) {
                                    System.out.println("Ungültige Eingabe!");
                                    colourInput[inputNumber] = sc.nextLine().toLowerCase();
                                }
                                inputNumber += 1;
                                colorInputIndex += 1;
                                colourNumber += 1;
                            }
                            String[] colourInputClone = colourInput.clone();
                            while (correctionIndex <= 3) {
                                int correctPositionIndex = 0;
                                while (correctPositionIndex <= 3) {
                                    if (inputNumber >= 4) {
                                        inputNumber = 0;
                                    }
                                    if (correctPositionColours[inputNumber] == false) {
                                        if (colourInputClone[inputNumber].equals(colours[inputNumber])) {

                                            correctColoursPosition += 1;
                                            correctPositionColours[inputNumber] = true;
                                            colourInputClone[inputNumber] = "empty";

                                        }
                                    }
                                    inputNumber += 1;
                                    correctPositionIndex += 1;

                                }

                                if (inputNumber >= 4) {
                                    inputNumber = 0;
                                }
                                if (correctPositionColours[0] == false) {

                                    if (colourInputClone[inputNumber].equals(colours[0])) {
                                        correctColours += 1;
                                        correctPositionColours[0] = true;
                                        colourInputClone[inputNumber] = "empty";

                                    }
                                }
                                if (correctPositionColours[1] == false) {
                                    if (colourInputClone[inputNumber].equals(colours[1])) {
                                        correctColours += 1;
                                        correctPositionColours[1] = true;
                                        colourInputClone[inputNumber] = "empty";
                                    }
                                }
                                if (correctPositionColours[2] == false) {
                                    if (colourInputClone[inputNumber].equals(colours[2])) {
                                        correctColours += 1;
                                        correctPositionColours[2] = true;
                                        colourInputClone[inputNumber] = "empty";
                                    }
                                }
                                if (correctPositionColours[3] == false) {
                                    if (colourInputClone[inputNumber].equals(colours[3])) {
                                        correctColours += 1;
                                        correctPositionColours[3] = true;
                                        colourInputClone[inputNumber] = "empty";
                                    }
                                }
                                correctionIndex += 1;

                                inputNumber += 1;


                            }
                            inputNumber = 0;


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
                    } else if (round >= 12) {

                        System.out.println("Du hast leider verloren!");
                        System.out.println("Lösung: " + colours[0] + ", " + colours[1] + ", " + colours[2] + ", " + colours[3]);
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
















