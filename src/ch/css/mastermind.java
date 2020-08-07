package ch.css;

import java.util.Random;
import java.util.Scanner;

public class mastermind {
    public static void main(String[] args) {

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


        while (tries > 1) {
            while (a < 4) {

                //generate 4 random numbers
                Random random = new Random();
                int upperbound = 7;
                int randomInt = random.nextInt(upperbound);


                if (randomInt == blue) {
                    //System.out.println("Blau");
                    colours[a] = "Blau";
                } else if (randomInt == red) {
                    //System.out.println("Rot");
                    colours[a] = "Rot";
                } else if (randomInt == yellow) {
                    //System.out.println("Gelb");
                    colours[a] = "Gelb";
                } else if (randomInt == green) {
                    //System.out.println("Grün");
                    colours[a] = "Grün";
                } else if (randomInt == black) {
                    //System.out.println("Schwarz");
                    colours[a] = "Schwarz";
                } else if (randomInt == white) {
                    //System.out.println("Weiss");
                    colours[a] = "Weiss";
                } else if (randomInt == lila) {
                    //System.out.println("Lila");
                    colours[a] = "Lila";
                } else if (randomInt == orange) {
                    //System.out.println("Orange");
                    colours[a] = "Orange";
                }

                a += 1;


            }

            System.out.println(colours[0]);
            System.out.println(colours[1]);
            System.out.println(colours[2]);
            System.out.println(colours[3]);

            int correctColoursPosition = 0;
            int correctColours = 0;

            try (Scanner scanner = new Scanner(System.in)) {
                while (correctColoursPosition <= 4) {

                    System.out.println(round + ". Round");
                    int b = 0;
                    int c = 1;
                    int d = 2;
                    int e = 3;


                    while (b <= 3) {


                        String[] colourInput = {"", "", "", ""};
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
                        int colourNumber = 1;
                        if (colourNumber == 4) {
                            colourNumber -= 3;
                        }

                        System.out.println("Colour " + colourNumber + ": ");
                        colourInput[b] = scanner.nextLine();
                        colourNumber += 1;

                        if (correctPositionColours[e] == false) {
                            if (correctPositionColours[b] == false) {
                                if (colourInput[b].equals(colours[b])) {
                                    correctColoursPosition += 1;
                                    correctPositionColours[b] = true;
                                } else if (colourInput[b].equals(colours[c])) {
                                    correctColours += 1;
                                } else if (colourInput[b].equals(colours[d])) {
                                    correctColours += 1;
                                } else if (colourInput[b].equals(colours[e])) {
                                    correctColours += 1;
                                }
                            } else {

                            }
                        }


                    }
                    b += 1;
                    c += 1;
                    d += 1;
                    e += 1;

                }

                System.out.println("Correctly Positioned Colours: " + correctColoursPosition);
                System.out.println("Correct Colours: " + correctColours);

                tries -= 1;
                round += 1;
                correctColours = 0;
                correctColoursPosition = 0;

                correctPositionColours[0] = false;
                correctPositionColours[1] = false;
                correctPositionColours[2] = false;
                correctPositionColours[3] = false;

            }

        }


    }
}






