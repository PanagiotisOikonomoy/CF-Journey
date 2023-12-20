package gr.aueb.cf.EXC.ch7tests;

import java.util.Scanner;
/**
App για κρυπτογράφηση ενός string με την χρήση της switch.
Ελπίζω να μην σας κούρασαν τα πολλά case.
Θα μπορούσα να το επεκτείνω και παραπάνω με κεφαλαία και σύμβολα αλλά θα σας ήταν κουραστικό να το διαβάσετε.
 **/
public class EncryptApp {

    public static void main(String args[ ]) {
        String str4encryption ="";
        String EncryptedStr = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Insert a string for encryption(a-z): ");
        str4encryption = in.nextLine();

        for (int i = 0; i < str4encryption.length(); i++) {
            char charact=Character.toLowerCase(str4encryption.charAt(i));
            switch (charact) {
                case 'a':
                    EncryptedStr=EncryptedStr+"2";
                    break;
                case 'b':
                    EncryptedStr=EncryptedStr+"@";
                    break;
                case 'c':
                    EncryptedStr=EncryptedStr+"4";
                    break;
                case 'd':
                    EncryptedStr=EncryptedStr+"!";
                    break;
                case 'e':
                    EncryptedStr=EncryptedStr+"6";
                    break;
                case 'f':
                    EncryptedStr=EncryptedStr+"#";
                    break;
                case 'g':
                    EncryptedStr=EncryptedStr+"8";
                    break;
                case 'h':
                    EncryptedStr=EncryptedStr+"$";
                    break;
                case 'i':
                    EncryptedStr=EncryptedStr+"0";
                    break;
                case 'j':
                    EncryptedStr=EncryptedStr+"?";
                    break;
                case 'k':
                    EncryptedStr=EncryptedStr+"&";
                    break;
                case 'l':
                    EncryptedStr=EncryptedStr+"*";
                    break;
                case 'm':
                    EncryptedStr=EncryptedStr+"~";
                    break;
                case 'n':
                    EncryptedStr=EncryptedStr+"_";
                    break;
                case 'o':
                    EncryptedStr=EncryptedStr+"+";
                    break;
                case 'p':
                    EncryptedStr=EncryptedStr+"=";
                    break;
                case 'q':
                    EncryptedStr=EncryptedStr+"-";
                    break;
                case 'r':
                    EncryptedStr=EncryptedStr+"9";
                    break;
                case 's' :
                    EncryptedStr=EncryptedStr+";";
                    break;
                case 't':
                    EncryptedStr=EncryptedStr+"7";
                    break;
                case 'u':
                    EncryptedStr=EncryptedStr+":";
                    break;
                case 'v' :
                    EncryptedStr=EncryptedStr+"5";
                    break;
                case 'w':
                    EncryptedStr=EncryptedStr+"^";
                    break;
                case 'x' :
                    EncryptedStr=EncryptedStr+"3";
                    break;
                case 'y':
                    EncryptedStr=EncryptedStr+"%";
                    break;
                case 'z' :
                    EncryptedStr=EncryptedStr+"1";
                    break;
                }
            }
        System.out.println("Your string was encrypted to: " +EncryptedStr);
    }
}