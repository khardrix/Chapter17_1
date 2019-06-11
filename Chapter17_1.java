/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                         Chapter 17: Problem 1                                            *****
 *****__________________________________________________________________________________________________________*****
 *****                       1. Write a program that creates a file called ch17_1.txt                           *****
 *****                           which consists of 100 randomly generated integers.                             *****
 *****                  If the file already exists, append to it rather than overwriting it.                    *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import java.io.*;
import java.util.Random;

/* IMPORTS FOR MY SOLUTION / ALTERNATE SOLUTION
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
*/


public class Chapter17_1 {

    // CLASS VARIABLE(s) declaration(s)



    public static void main(String[] args) {

        /* MY .dat (BINARY) FILE SOLUTION
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////                            THIS CODE IS FOR CREATING A .dat (binary) FILE                           /////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // LOCAL VARIABLE(s) declaration(s)
        Random random = new Random();
        int tempInt;

        // try block to attempt to create a DataOutputStream and create the file "ch17_1.dat"
        try {
            DataOutputStream dOS = new DataOutputStream(new FileOutputStream("ch17_1.dat", true));

            for(int i = 0; i < 100; i++){
                tempInt = random.nextInt();
                dOS.writeInt(tempInt);
            }

            dOS.close();
        }
        catch(IOException iOExc){
            System.out.println(iOExc);
        }
        */




        /* PROFESSOR'S SOLUTION
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////                            THIS CODE IS FOR CREATING A .dat (binary) FILE                           /////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Random g = new Random();
        int temp;					// used to store each int value temporarily
        try {						// try to create and output to the data stream
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("ch17_1.dat", true));	// if the file exists, append to it
            for(int i=0;i<100;i++)
            {
                temp = g.nextInt();	// get the next random int
                dos.writeInt(temp);	// output it to the binary file as an integer value
            }
            dos.close();			// close the file
        }
        catch(IOException e) {		// reach here if we have an error
            System.out.println(e);
        }
        */




        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////                             THIS CODE IS FOR CREATING A .txt (text) FILE                            /////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // MY SOLUTION / ANOTHER POSSIBLE SOLUTION
        // LOCAL VARIABLE(s) declaration(s)
        Random random = new Random();
        String filename = "ch17_1.txt";
        PrintWriter printWriter = null;

        try{
            FileWriter fileWriter = new FileWriter(filename, true);
            printWriter = new PrintWriter(fileWriter);

            for(int i = 0; i < 100; i++){
                printWriter.println((random.nextInt(100) + 1));
            }

            printWriter.close();
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
