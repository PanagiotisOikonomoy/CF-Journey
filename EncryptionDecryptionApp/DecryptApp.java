package gr.aueb.cf.EXC.ch7tests;

import java.util.Scanner;
/**
 * App for decryption!
 **/
public class DecryptApp {

    public static void main(String[] args) {
        String str4decryption ="";
        String DecryptedStr = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Insert your encrypted string: ");
        str4decryption = in.nextLine();

        for (int i = 0; i < str4decryption.length(); i++) {
            char charact=Character.toLowerCase(str4decryption.charAt(i));
            switch (charact) {
                case '2':
                    DecryptedStr=DecryptedStr+"a";
                    break;
                case '@':
                    DecryptedStr=DecryptedStr+"b";
                    break;
                case '4':
                    DecryptedStr=DecryptedStr+"c";
                    break;
                case '!':
                    DecryptedStr=DecryptedStr+"d";
                    break;
                case '6':
                    DecryptedStr=DecryptedStr+"e";
                    break;
                case '#':
                    DecryptedStr=DecryptedStr+"f";
                    break;
                case '8':
                    DecryptedStr=DecryptedStr+"g";
                    break;
                case '$':
                    DecryptedStr=DecryptedStr+"h";
                    break;
                case '0':
                    DecryptedStr=DecryptedStr+"i";
                    break;
                case '?':
                    DecryptedStr=DecryptedStr+"j";
                    break;
                case '&':
                    DecryptedStr=DecryptedStr+"k";
                    break;
                case 'l':
                    DecryptedStr=DecryptedStr+"*";
                    break;
                case '~':
                    DecryptedStr=DecryptedStr+"m";
                    break;
                case '_':
                    DecryptedStr=DecryptedStr+"n";
                    break;
                case '+':
                    DecryptedStr=DecryptedStr+"o";
                    break;
                case '=':
                    DecryptedStr=DecryptedStr+"p";
                    break;
                case '-':
                    DecryptedStr=DecryptedStr+"q";
                    break;
                case '9':
                    DecryptedStr=DecryptedStr+"r";
                    break;
                case ';' :
                    DecryptedStr=DecryptedStr+"s";
                    break;
                case '7':
                    DecryptedStr=DecryptedStr+"t";
                    break;
                case ':':
                    DecryptedStr=DecryptedStr+"u";
                    break;
                case '5' :
                    DecryptedStr=DecryptedStr+"v";
                    break;
                case '^':
                    DecryptedStr=DecryptedStr+"w";
                    break;
                case '3' :
                    DecryptedStr=DecryptedStr+"x";
                    break;
                case '%':
                    DecryptedStr=DecryptedStr+"y";
                    break;
                case '1' :
                    DecryptedStr=DecryptedStr+"z";
                    break;
            }
        }
        System.out.println("The decryption process has completed: " +DecryptedStr);
    }
}