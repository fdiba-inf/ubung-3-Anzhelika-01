package exercise3;
import java.util.Scanner;

public class NamePrinter
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    int count = 0;

    while(count <= name.lenght())
    {
      char name = in.CharAt(count);
      System.out.println("* " + name + " *");
      count++;
    }
  }
}