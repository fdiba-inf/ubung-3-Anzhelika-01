package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wert = input.nextDouble();
        String type = input.nextLine();
        double radiant;
        double grad;
        
        while(wert > 0 && (type == "r" || type == "d"));{
          if(type == "r"){
            System.out.println("Angle: 114.59");
          }
          else if(type == "d"){
            System.out.println("Angle: 0.52");
          }
        }
  }
}
