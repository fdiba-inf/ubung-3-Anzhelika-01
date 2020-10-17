package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wert = input.nextDouble();
        String type = input.nextLine();
        double radiant;
        double grad;
        
        do{
          if(type == "r"){
            grad = (wert * 180) / (Math.PI / 180);
            System.out.println("Angle: " + grad + "d");
          }
          else{
            radiant = (wert * Math.PI) / 180;
            System.out.println("Angle: " + radiant + "r");
          }
        }while(wert > 0);
  }
}
