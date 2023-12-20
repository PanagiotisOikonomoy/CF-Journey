package gr.aueb.cf.Projects;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Project01 {
    /**
     * A program that reads from text file numbers and then prints all possible combinations of six numbers
     * with all filters that we have.
     *
     * @param args
     * @throws IOException
     * @author Panagiotis Oikonomou
     */
    public static void main(String[] args) throws IOException {
        int n = 6;
        File inFile = new File("c:/Java/Numbers.txt");
        File output = new File("c:/Java/Combinations.word");
        Scanner in = new Scanner(inFile);
        PrintStream ps = new PrintStream(output,StandardCharsets.UTF_8);
        int[] row = new int[6];
        ArrayList<Integer> numbers = new ArrayList<>();


        while (in.hasNext()) {
            numbers.add(in.nextInt());
            Collections.sort(numbers);
        }

        for (int a = 0; a <= numbers.size() - n; a++) {
            for (int b = a + 1; b <= numbers.size() - n + 1; b++) {
                for (int c = b + 1; c <= numbers.size() - n + 2; c++) {
                    for (int d = c + 1; d <= numbers.size() - n + 3; d++) {
                        for (int e = d + 1; e <= numbers.size() - n + 4; e++) {
                            for (int f = e + 1; f < numbers.size(); f++) {
                                row[0] = numbers.get(a);
                                row[1] = numbers.get(b);
                                row[2] = numbers.get(c);
                                row[3] = numbers.get(d);
                                row[4] = numbers.get(e);
                                row[5] = numbers.get(f);


                                if (!isEven(row, 4) && (!isOdd(row, 4) && (!isSameEnding(row,3) && (!inRow(row,2)) && (!sameTen(row,3))))) {
                                    ps.printf("%d\t%d\t%d\t%d\t%d\t%d\n", row[0], row[1], row[2], row[3], row[4], row[5]);
                                    System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", row[0], row[1], row[2], row[3], row[4], row[5]);
                                }
                            }
                        }
                    }
                }
            }
        }
        ps.close();
    }

    public static boolean isEven(int[] row, int threshold) {
        int count = 0;
        for (int num : row) {
            if (num % 2 == 0) count++;
        }
        return count > threshold;
    }

    public static boolean isOdd(int[] row, int threshold) {
        int count = 0;

        for (int num : row) {
            if (num % 2 != 0) count++;
        }
        return count > threshold;
    }

    public static boolean inRow(int[] row,int threshold) {
        int count = 0;

        for (int i = 0; i < row.length - 1; i++) {
            if ((row[i] - row[i + 1]) == -1) count++;
        }
        return count > threshold;
    }

    public static boolean isSameEnding(int[] row,int threshold) {
        int count = 0;

        for (int i = 0; i < row.length - 1; i++) {
            for (int j = i; j < row.length -1; j++) {
                if (row[j] % 2 == row[j+1] % 2) count++;
            }
        }
        return count > threshold;
    }

    public static boolean sameTen(int[] row,int threshold){
        int count = 0;
        for (int i = 0; i < row.length -1; i++){
            if (row[i] / 10 == row[i +1] / 10)
                count++;
        }
        return count > threshold;
    }

}
