package eBayCommon;

import base.Base;

import java.util.Random;

/**
 * Created by Prithul on 4/25/2014.
 */
public class Essential extends Base {

    public String randomText(){

        String [] words = new String[13];
        words[0] = "Brad Pitt";
        words[1] = "Katy Perry";
        words[2] = "Micheal Phelps";
        words[3] = "George Clooney";
        words[4] = "Paula Deen";
        words[5] = "Tina Fey";
        words[6] = "Kim Kardashian";
        words[7] = "Nicole Kidman";
        words[8] = "Lady Gaga";
        words[9] = "Bruno Mars";
        words[10] = "Kevin Millar";
        words[11] = "Cole Hamels";
        words[12] = "Justin Bell";

        String text = "";
        Random random = new Random();
        int randomText = random.nextInt(12)+1;
        for(int i=0; i<words.length; i++){
            text = words[randomText];
            randomText = random.nextInt(12)+1;
        }
        return text;
    }
}
