import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan;
    private int xValueOfC1;
    private int yValueOfC1;
    private int xValueOfC2;
    private int yValueOfC2;
    private LinearEquation poop;

    public LinearEquationLogic() {
        scan = new Scanner(System.in);

    }

    public void start(){
        getInfo();
        printInfo();
    }

    public void getInfo(){
        System.out.println("Welcome to linear equation calculator");
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        int comma = coordinate1.indexOf(",");
        int parenthesis = coordinate1.indexOf(")");
        String xValueOfCoordinate1 = coordinate1.substring(1, comma);
        String yValueOfCoordinate1 = coordinate1.substring(comma+2, parenthesis);
        comma = coordinate2.indexOf(",");
        parenthesis = coordinate2.indexOf(")");
        String xValueOfCoordinate2 = coordinate2.substring(1, comma);
        String yvalueOfCoordinate2 = coordinate2.substring(comma+2, parenthesis);
        xValueOfC1 = Integer.parseInt(xValueOfCoordinate1);
        yValueOfC1 = Integer.parseInt(yValueOfCoordinate1);
        xValueOfC2 = Integer.parseInt(xValueOfCoordinate2);
        yValueOfC2 = Integer.parseInt(yvalueOfCoordinate2);
    }

    public void printInfo() {
        poop = new LinearEquation(xValueOfC1, yValueOfC1, xValueOfC2, yValueOfC2);
        System.out.println(poop.lineInfo());
    }

    public void askMore() {
        System.out.print("Enter a value for x: ");
        String xAgain = scan.nextLine();
        System.out.println("The point on the line is " + poop.coordinateForX());
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String answer = scan.nextLine();
        if (answer.equals("y")) {
            start();
        }
    }


}
