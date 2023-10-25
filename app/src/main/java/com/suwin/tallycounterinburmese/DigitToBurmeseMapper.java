package com.suwin.tallycounterinburmese;
//Written by Su Win
//GitHub: https://github.com/su-win

import java.util.HashMap;

public class DigitToBurmeseMapper {
    private HashMap<Character, String> digitToBurmese = new HashMap<>();

    public DigitToBurmeseMapper(){
        digitToBurmese.put('0', "၀");
        digitToBurmese.put('1', "၁");
        digitToBurmese.put('2', "၂");
        digitToBurmese.put('3', "၃");
        digitToBurmese.put('4', "၄");
        digitToBurmese.put('5', "၅");
        digitToBurmese.put('6', "၆");
        digitToBurmese.put('7', "၇");
        digitToBurmese.put('8', "၈");
        digitToBurmese.put('9', "၉");
    }

    public String getBumeseCharacter(char digit){

        return digitToBurmese.get(digit);
    }

}
