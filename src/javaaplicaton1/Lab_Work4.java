package javaaplicaton1; 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import static javaaplicaton1.Function.Job;

public class Lab_Work4
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        System.setProperty("console.encoding","Cp866");
  
        System.out.print("Строка на английском: ");
        Scanner in = new Scanner(System.in);
        String strLetter = in.nextLine();
        String strNumber = "Строка номеров : ";
                
        for (int i = 0; i < strLetter.length(); i++)
        {
            char letter = strLetter.charAt(i);
            strNumber = strNumber + Job(letter) + "  ";
        }
            System.out.println(strNumber);
       
            
        /*char [] CharArray = str.toCharArray();
        int number = 0;
        for (int i = 0; i < str.length(); i++)
        {
           System.out.print((CharArray[i])+"  ");
        }
        
        System.out.println();
        
        for (int i = 0; i < str.length(); i++)
        {
           System.out.print((Function.Job(CharArray[i]))+"  ");
        }  */

        
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество строк матрицы - ");
        int LINE = in.nextInt();
        System.out.print("Введите колличество столбцов матрицы - ");
        int COL = in.nextInt();
        System.out.println();
        int [][] Matrix = new int [LINE][COL];
        int [] Array = new int [COL];

        int Selection = Function.InputMethod(Matrix);
        if (Selection == 1 || Selection == 2)
            {
                System.out.println("Вариант №5");
                System.out.println();
                Function.PrintArray(Matrix);
            
                for (COL = 0; COL<Array.length; COL++)
                {   
                    Array[COL] = Matrix[0][COL];
                    for (LINE = 0; LINE<Matrix.length; LINE++)
                        {
                            if (Matrix[LINE][COL]<Array[COL])
                            {
                                Array[COL] = Matrix[LINE][COL];
                            }
                        }
                }     
        Function.PrintArray(Array);
        Function.PrintElementCalculation(Array);
        Function.PrintFileElementCalulation(Array);
            }else{}*/
    }
}
