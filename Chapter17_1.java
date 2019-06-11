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
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;


public class Chapter17_1 {

    // CLASS VARIABLE(s) declaration(s)



    public static void main(String[] args) {

        // LOCAL VARIABLE(s) declaration(s)
        String filename = "ch17_1.txt";
        File chapter17_1_File = new File("ch17_1.txt");
        Random random = new Random();
        PrintWriter printWriter = null;

        try{
            if(chapter17_1_File.exists()){
                FileWriter fileWriter = new FileWriter("ch17_1.txt", true);
                printWriter = new PrintWriter(fileWriter);

                for(int i = 0; i < 100; i++){
                    printWriter.println((random.nextInt(100) + 1));
                }
            }
            else{
                printWriter = new PrintWriter(filename);

                for(int i = 0; i < 100; i++){
                    printWriter.println((random.nextInt(100) + 1));
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        finally {
            if(printWriter != null){
                printWriter.close();
            }
        }
    }
}
