package org.example.Utils;

import java.util.HashMap;
import java.util.Map;

public class InitializeValues {

    public static void initializeCinemaSeats(String[][] cinemaSeat){
        cinemaSeat[0][0] = "A";
        cinemaSeat[1][0] = "B";
        cinemaSeat[2][0] = "C";
        cinemaSeat[3][0] = "D";
        cinemaSeat[4][0] = "E";
        cinemaSeat[5][0] = "F";
        cinemaSeat[6][0] = "G";
        cinemaSeat[7][0] = "H";
        cinemaSeat[8][0] = "I";
        cinemaSeat[9][0] = "J";
        cinemaSeat[10][0] = "K";
        cinemaSeat[11][0] = "L";
        cinemaSeat[12][0] = "M";
        cinemaSeat[13][0] = "N";
        cinemaSeat[14][0] = "O";
        cinemaSeat[15][0] = "P";
        cinemaSeat[16][0] = "Q";
        cinemaSeat[17][0] = "R";
        cinemaSeat[18][0] = "S";
        cinemaSeat[19][0] = "T";
        cinemaSeat[20][0] = "U";
        cinemaSeat[21][0] = "V";
        cinemaSeat[22][0] = "W";
        cinemaSeat[23][0] = "X";
        cinemaSeat[24][0] = "Y";
        cinemaSeat[25][0] = "Z";

        for(int x=0; x <26; x++){
            String value = cinemaSeat[x][0];
            for(int y =0; y<10; y++){
                cinemaSeat[x][y] = value + Integer.toString(y+1);
            }
        }
    }

    public static int mapLetterToNumber(String seat){
        Map<String,Integer> letterToNumber = new HashMap<>();
        letterToNumber.put("A",0);
        letterToNumber.put("B",1);
        letterToNumber.put("C",2);
        letterToNumber.put("D",3);
        letterToNumber.put("E",4);
        letterToNumber.put("F",5);
        letterToNumber.put("G",6);
        letterToNumber.put("H",7);
        letterToNumber.put("I",8);
        letterToNumber.put("J",9);
        letterToNumber.put("K",10);
        letterToNumber.put("L",11);
        letterToNumber.put("M",12);
        letterToNumber.put("N",13);
        letterToNumber.put("O",14);
        letterToNumber.put("P",15);
        letterToNumber.put("Q",16);
        letterToNumber.put("R",17);
        letterToNumber.put("S",18);
        letterToNumber.put("T",19);
        letterToNumber.put("U",20);
        letterToNumber.put("V",21);
        letterToNumber.put("W",22);
        letterToNumber.put("X",23);
        letterToNumber.put("Y",24);
        letterToNumber.put("Z",25);

        return letterToNumber.get(seat);
    }
}
