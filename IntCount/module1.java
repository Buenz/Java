/*
Harrison Bueno
CS207 - C2
Module 1 - Read int final
*/

import java.util.Scanner;
import java.io.*; //inputs both file types i & ii

public class ReadDataFromFileSetUp
{
  public static void main(String [] args)
  {
    try
    {
      //Scanner kbd= new Scanner(System.in);  /*cin but java*/
      Scanner fScanner = new Scanner(new File("integers2.txt"));
      int j=1;
      while(fScanner.hasNextLine())
      {
        int count=0;
        String line= fScanner.nextLine();
        ///turn line into list and split
        String[] elements= line.split(" ");

        for (int i=0; i<elements.length;i++)
        {
          if(Integer.parseInt(elements[i])==1 || Integer.parseInt(elements[i])%2==0)
          {
            continue;
          }
          else
          {
            count=count+1;
          }
        }
        System.out.println("Row " +j+": " + count + " odd values");
        j+=1;
      }
    }
      catch(FileNotFoundException fnf)
      {
        System.out.println("no file " + fnf);
      }
      System.out.println("DONE");
    }
  }
