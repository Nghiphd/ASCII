
/**
 * Write a description of class Hexadecimal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hexadecimal
{
    public static void main(String[] args)
    {
 
        /* Decimal number to be converted */
        int i = 257;
 
        // Using toHexString() method for getting decNum and
        // Storing the hexaDecNum in a string
        String hex = Integer.toHexString(i);
 
        // Printing hexaDecNum of decNum
        System.out.println("Hex value is " + hex);
    }
}
