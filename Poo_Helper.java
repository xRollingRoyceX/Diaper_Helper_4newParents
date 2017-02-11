/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_helper;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author xRollingRoyceX
 */
public class Poo_Helper {

    public static void main(String[] args) throws IOException {

        int mom = 0;
        int dad = 1;
        int whoIs;

        System.out.println("who is changing the baby:");
        Scanner keydInput = new Scanner(System.in);
        whoIs = keydInput.nextInt();

        System.out.print(whoIs);

        if (whoIs == dad) {
            FileWriter fwriter = new FileWriter("dad.txt", true);
            PrintWriter outputFile = new PrintWriter(fwriter);
            int totalDad = 0;

            File myFile = new File("dad.txt");
            Scanner inputFile = new Scanner(myFile);

            while (inputFile.hasNext()) {
                int accum = inputFile.nextInt();
                totalDad = accum + 1;
            }
            outputFile.println(totalDad);
            outputFile.close();

        } else if (whoIs == mom) {
            FileWriter fwriter = new FileWriter("mom.txt", true);
            PrintWriter outputFile = new PrintWriter(fwriter);
            int totalMom = 0;

            File myFile = new File("mom.txt");
            Scanner inputFile = new Scanner(myFile);

            while (inputFile.hasNext()) {
                int accum = inputFile.nextInt();

                totalMom = accum + 1;
            }

            outputFile.println(totalMom);
            outputFile.close();

        }
    }
}
