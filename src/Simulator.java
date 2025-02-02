import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Simulator {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                try{
                System.out.println("Enter the number of dice");
                int numberOfDice = sc.nextInt();
                System.out.println( "About to roll" +numberOfDice+ "dice");
                Random rand = new Random();
                for(int i=0;i< numberOfDice;i++){
                    int rolledNumber = rand.nextInt(6)+1;
                    System.out.println(display(rolledNumber));
                }
            }catch(InputMismatchException e){
                    System.out.println("Its not a valid number");
             }
            }
            static  String display(int value){
                return switch(value){
                    case 1 -> "---------\n|         |\n|    0    |\n|         |\n---------";
                    case 2 -> "---------\n|  0      |\n|         |\n|      0  |\n---------";
                    case 3 -> "---------\n|  0      |\n|    0    |\n|      0  |\n---------";
                    case 4 -> "---------\n|  0   0  |\n|         |\n|  0   0  |\n---------";
                    case 5 -> "---------\n|  0   0  |\n|    0    |\n|  0   0  |\n---------";
                    case 6 -> "---------\n|  0   0  |\n|  0   0  |\n|  0   0  |\n---------";
                    default -> "Not a valid dice value";
                };
            }
        }

