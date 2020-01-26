package javaaplicaton1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Function {
    
    public static int InputMethod(int [][] ArrayF) throws FileNotFoundException
    {
        System.out.println("Введите метод ввода матрицы:");
        System.out.println("1 - Ввод данных с клавиатуры;");
        System.out.println("2 - Ввод данных из файла.");
        System.out.print("Метод - ");
        Scanner in = new Scanner(System.in);
        int Selection = in.nextInt();
        System.out.println();
        switch (Selection)
        {
            case 1:
                FillKey(ArrayF);
                break;
            case 2:
                FillFile(ArrayF);
                break;
            default:
                System.out.println("Введеные данные не соответствуют допустимым значениям метода ввода!");
                System.out.println();
        }  
        return Selection;
    }       
    
    public static void FillKey(int [][] ArrayF)
    {
        Scanner in = new Scanner(System.in);
        for(int LINE=0; LINE<ArrayF.length; LINE++)
        {
            for(int COL=0; COL<ArrayF[LINE].length;COL++)
            {
                System.out.print(("Введите элемент матрицы")+("[")+(LINE)+("]")+("[")+(COL)+("] = "));
                ArrayF[LINE][COL] = in.nextInt();
            }
        System.out.println();
        }
    }
    
    public static void FillFile(int [][] ArrayF) throws FileNotFoundException
    {
        File file = new File("Matrix.txt");
        Scanner in = new Scanner(file);
        while(in.hasNext())
        {
           for (int SIZE = 0; SIZE<ArrayF.length; SIZE++)
           {
               for(int COL = 0; COL<ArrayF[SIZE].length; COL++)
               {
                   ArrayF[SIZE][COL] = in.nextInt();
               }
           }
        }
        in.close();
    }

    public static void PrintArray(int [][] ArrayF)
{
    System.out.println("Матрица:");
    for (int LINE = 0; LINE<ArrayF.length; LINE++)
    {
        for(int COL = 0; COL<ArrayF[LINE].length; COL++)
        {
            System.out.print((ArrayF[LINE][COL])+"  ");
        }
        System.out.println();
        }
        System.out.println();
}

    public static void PrintArray(int [] ArrayF)
    {
        System.out.println("Массив:");
        for (int SIZE = 0; SIZE<ArrayF.length; SIZE++)
        {
            System.out.print((ArrayF[SIZE])+("  "));
        }
        System.out.println();
        System.out.println();
    }
    
    public static int ElementCalculation(int [] ArrayF)
    {
        int SUM = 0;
        for (int SIZE = 0; SIZE<ArrayF.length; SIZE++)
        {
            SUM = SUM + ArrayF[SIZE];
        } 
        return SUM;
    }
    
    public static void PrintElementCalculation(int [] ArrayF)
    {
        System.out.println(("Результат вычисления массива = ")+(ElementCalculation(ArrayF))+("."));
        System.out.println();
    }

    public static void PrintFileElementCalulation(int [] ArrayF) throws IOException
    {
         int SUM = 0;
         for (int SIZE = 0; SIZE<ArrayF.length; SIZE++)
        {
            SUM = SUM + ArrayF[SIZE];
        } 
        FileWriter fw = new FileWriter("ElementCalculation.txt");
        fw.write(("Результат вычисления массива = ")+(ElementCalculation(ArrayF))+("."));
        fw.close();
        System.out.println("Выполнен вывод результата вычисления массива в текстовый файл.");
        System.out.println();
    }
    
    public static int Job(char letter)
    {
        int number;
        switch (letter)
        {
            case ('a'):
                    {
                        number = 1;
                        break;
                    }
            case ('A'):
                    {
                        number = 1;
                        break;
                    }
            case ('b'):
                    {
                        number = 2;
                        break;
                    }
            case ('B'):
                    {
                        number = 2;
                        break;
                    }
            case ('c'):
                    {
                        number = 3;
                        break;
                    }
            case ('C'):
                    {
                        number = 3;
                        break;
                    }
            case ('d'):
                    {
                        number = 4;
                        break;
                    }
            case ('D'):
                    {
                        number = 4;
                        break;
                    }
            case ('e'):
                    {
                        number = 5;
                        break;
                    }
            case ('E'):
                    {
                        number = 5;
                        break;
                    }
            case ('f'):
                    {
                        number = 6;
                        break;
                    }
            case ('F'):
                    {
                        number = 6;
                        break;
                    }        
            case ('g'):
                    {
                        number = 7;
                        break;
                    }
            case ('G'):
                    {
                        number = 7;
                        break;
                    }
            case ('h'):
                    {
                        number = 8;
                        break;
                    }
            case ('H'):
                    {
                        number = 8;
                        break;
                    }
            case ('i'):
                    {
                        number = 9;
                        break;
                    }
            case ('I'):
                    {
                        number = 9;
                        break;
                    }
            case ('j'):
                    {
                        number = 10;
                        break;
                    }
            case ('J'):
                    {
                        number = 10;
                        break;
                    }
            case ('k'):
                    {
                        number = 11;
                        break;
                    }
            case ('K'):
                    {
                        number = 11;
                        break; 
                    }
            case ('l'):
                    {
                        number = 12;
                        break;
                    }
            case ('L'):
                    {
                        number = 12;
                        break;
                    }
            case ('m'):
                    {
                        number = 13;
                        break;
                    }
            case ('M'):
                    {
                        number = 13;
                        break;
                    }
            case ('n'):
                    {
                        number = 14;
                        break;
                    }
            case ('N'):
                    {
                        number = 14;
                        break; 
                    }
            case ('o'):
                    {
                        number = 15;
                        break;
                    }
            case ('O'):
                    {
                        number = 15;
                        break;
                    }  
            case ('p'):
                    {
                        number = 16;
                        break;
                    }
            case ('P'):
                    {
                        number = 16;
                        break; 
                    }
            case ('q'):
                    {
                        number = 17;
                        break;
                    }
            case ('Q'):
                    {
                        number = 17;
                        break;
                    }
            case ('r'):
                    {
                        number = 18;
                        break;
                    }
            case ('R'):
                    {
                        number = 18;
                        break;
                    }
            case ('s'):
                    {
                        number = 19;
                        break;
                    }
            case ('S'):
                    {
                        number = 19;
                        break; 
                    }
            case ('t'):
                    {
                        number = 20;
                        break;
                    }
            case ('T'):
                    {
                        number = 20;
                        break;
                    }
            case ('u'):
                    {
                        number = 21;
                        break;
                    }
            case ('U'):
                    {
                        number = 21;
                        break;
                    }
            case ('v'):
                    {
                        number = 22;
                        break;
                    }
            case ('V'):
                    {
                        number = 22;
                        break;
                    }
            case ('w'):
                    {
                        number = 23;
                        break;
                    }
            case ('W'):
                    {
                        number = 23;
                        break;
                    }
            case ('x'):
                    {
                        number = 24;
                        break;
                    }
            case ('X'):
                    {
                        number = 24;
                        break;
                    }
            case ('y'):
                    {
                        number = 25;
                        break;
                    }
            case ('Y'):
                    {
                        number = 25;
                        break;
                    }
            case ('z'):
                    {
                        number = 26;
                        break;
                    }
            case ('Z'):
                    {
                        number = 26;
                        break;
                    } 
            default:
                    {
                        number = 0;
                        break;
                    }
            case ('А'):
                    {
                        number = 1001;
                        break;           
                    }
        }
        return number;
    }
}
