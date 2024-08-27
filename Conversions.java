import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Inches to Centimeters");
        System.out.println("8. Centimetes to Inches");
        System.out.println("9. Miles to Kilometers");
        System.out.println("10. Kilometers to Miles");

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit:  ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit -32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");

        }
        if (selection == 3)
        {
            System.out.println("Enter Feet:   ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = (feet / 3.28);
            System.out.println(feet + " feet is " + meters + " meters ");

        }
        if (selection == 4)
        {
            System.out.println("Enter Meters:  ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = (meters * 3.28);
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces:  ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = (ounces * 29.57);
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");
        
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters:  ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = (milliliters/29.57);
            System.out.println(milliliters + " milliliters is " + ounces + " ounces");

        }
        if (selection == 7)
        {
            System.out.print("Enter Inches:  ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double centimeters = (inches * 2.54);
            System.out.println(inches + " inches is " + centimeters + " centimeters");

        }
        if (selection == 8)
        {
            System.out.println("Enter Centimeters:  ");
            double centimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = (centimeters/2.54);
            System.out.println(centimeters + " centimeters is " + inches + " inches");
        }

        if (selection == 9)
        {
            System.out.println("Enter Miles:   ");
            double miles = keyboard.nextDouble();
            keyboard.nextLine();
            double Kilometers = (miles * 1.609344);
            System.out.println(miles + " miles is " + Kilometers + " kilometers");

        }
        if (selection == 10)
        {
            System.out.println("Enter Kilometers:   ");
            double kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = (kilometers/1.609344);
            System.out.println(kilometers + " kilometers is " + miles + " miles");

        }




           
        }
    }
