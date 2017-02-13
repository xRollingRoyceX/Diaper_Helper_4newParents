/*
 *edit to your liking. add a time stamp for medical reasions if need be.
 do the things im still learning how to do!
 
 ______------*btw. this code can be transformed into a 
 self-propagating worm as I found out from 
 playing with the code. It would say 16kb, but it would
 actually be 1 GB+. Every time you try and
 delete it it would increese 0.10-0.20 GB. If you manage to do this 
 just shut off your computer/compiler depending on situation while
 playing with the code and delete the file.
 */
package poo_helper;

import java.util.Scanner;
import java.io.*;
import java.util.Date;
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
         
            int K = tStamp.getHours();
            int m = tStamp.getMinutes();
            outputFile.print(K + " ");
            outputFile.print(m + " ");
            //cant seem to make it read a ' : ' ...yet                         
            //but now its timestamped

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
             
            int K = tStamp.getHours();
            int m = tStamp.getMinutes();
            outputFile.print(K + " ");
            outputFile.print(m + " ");
            //cant seem to make it read a ' : ' ...yet                         
            //but now its timestamped
            //import java.io.StringReader;??

            while (inputFile.hasNext()) {
                int accum = inputFile.nextInt();

                totalMom = accum + 1;
            }

            outputFile.println(totalMom);
            outputFile.close();

        }
    }
}
