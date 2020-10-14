package exercise3;
import java.util.Scanner;

public class PrimeNumber{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  int num = input.nextInt();
  int count = 0;
  int i = 2;
  boolean prime = true;
  while(i <= num/2)
  {
    if(num <= 2)
    {
      break;
    }
    if(num % i == 0)
    {
      prime = false;
      break;
    }
    i++;
  }
    System.out.println("PrimeNumber: " + prime);
  }
}