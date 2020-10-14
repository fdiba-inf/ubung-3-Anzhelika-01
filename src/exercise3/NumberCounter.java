package exercise3;
import java.util.Scanner;
  
  public class NumberCounter{
    public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      double num;
      int positiveNumbers = 0;
      int negativeNumbers = 0;
      double sum = 0.0;
      double average = 0.0;
      int count = 0;

      num = input.nextDouble();
      while(num != 0)
      {
        count++;
        if(num % 2 == 0)
        {
          positiveNumbers++;
        }
        else
        {
          negativeNumbers++;
        }
        sum += num;
      }
      average = sum/count;
      System.out.println("Positive numbers: " + positiveNumbers);
      System.out.println("Negative numbers: " + negativeNumbers);
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
    }
  }