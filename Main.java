import java.util.Scanner;

/**
 * This program calculates the slope of a line given two points
 * @author DAfna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for the x coordinate of the first point
    System.out.println("Please enter in the x coordinate of the first point");
    double x1 = input.nextDouble();

    // ask the user for the y coordinate of the first point
    System.out.println("Please enter in the y coordinate of the first point");
    double y1 = input.nextDouble();

    // ask the user for the x coordinate of the second point
    System.out.println("Please enter in the x coordinate of the second point");
    double x2 = input.nextDouble();

    // ask the user for the y coordinate of the second point
    System.out.println("Please enter in the y coordinate of the second point");
    double y2 = input.nextDouble();

    // declare and calculate the slope of line
    double slope = (y2 - y1) / (x2 - x1);
    System.out.println("The slope of your line would be " + slope +  ".");
    
  }
}
