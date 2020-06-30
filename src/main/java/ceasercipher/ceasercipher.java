package ceasercipher;

import java.util.Scanner;

public class ceasercipher {

    // a method to rotate the characters
    private String mText;
    private int mShift;

    public ceasercipher (String mText, int mShift){
        this.mText = mText;
        this.mShift = mShift;
    }
    public String getText() {
        return mText;
    }

    public int getShift() {
        return mShift;
    }
    public static char Cipher(char c, int k){

        //declaration of constants
        final int maxLength = 26;
        final int shift = k % maxLength;
        final char upperShift = Character.isUpperCase(c) ? 'A' : 'a';

        //loop through the 26 alphabets for a to z
        char shifted = (char) (c - upperShift);

        //rotation of the letters and iteration of the same when a negative number is returned by the method
        shifted = (char) ((shifted + shift + maxLength) % maxLength);
        return (char) (shifted + upperShift);
    }
    // Rotate a string k-positions
    public  String Cipher() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mText.length(); i++) {
            if(mText.charAt(i) == ' ')
            {
                sb.append(" ");
            }
            else
            {
                sb.append(Cipher (mText.charAt(i), mShift));
            }

        }
        return sb.toString();
    }
}
