package ch.css;

import java.util.Random;

public class mastermind {
    public static void main(String[] args) {

        int a = 1;

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


        while (a < 4) {
            a += 0;
            //generate 4 random numbers
            Random random = new Random();
            int upperbound = 7;
            ;
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

            System.out.println(colours[0]);


        }


        }





    }





