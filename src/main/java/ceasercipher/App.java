package ceasercipher;
import java.util.Scanner;

import static ceasercipher.ceasercipher.Cipher;
public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password;
        int key;

        System.out.print("Please enter the sentence: ");
        password = keyboard.nextLine();

        do {
            System.out.print("Please enter a key between 1 to 25: ");
            key = keyboard.nextInt();

            //here we handle key errors
            if (key < 1 || key > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", key);
            }
        } while (key < 1 || key > 25);


        System.out.println("Password:\t" + password);
        ceasercipher ceaserCipher = new ceasercipher(password,key);
        String encryption = ceaserCipher.Cipher();
        System.out.println("Encrypted:\t" + encryption);

        //decryption
        ceasercipher ceaserCipherDec = new ceasercipher(encryption,-key);
        System.out.println("Decrypted:\t" + ceaserCipherDec.Cipher());

    }
}