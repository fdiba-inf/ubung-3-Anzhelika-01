package exercise3;
import java.util.Scanner;
  
  public class NumberCounter{
    public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      int positiveNumbers = 0;
      int negativeNumbers = 0;
      double sum = 0.0;
      double averageOfNum = 0.0;
      double count = 0.0;

      while(true)
      {
      int num = input.nextInt();
        if(num == 0)
        {
          break;
        }
        if(num > 0)
        {
          positiveNumbers++;
        }
        else
        {
          negativeNumbers++;
        }
        count++;
        sum += num;
      }
      averageOfNum = sum / count;
      System.out.println("Positive numbers: " + positiveNumbers);
      System.out.println("Negative numbers: " + negativeNumbers);
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + averageOfNum);
    }
  }