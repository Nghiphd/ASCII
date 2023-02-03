import java.util.Scanner;

/**
 * Write a description of class ASCII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ASCII
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ASCII man = new ASCII();
        while(true){
            char u = scanner.next().charAt(0);
            System.out.println(man.getDecimal(u));
            System.out.println(man.getHexaDecimal(man.getDecimal(u)));
        }
    }

    public int getDecimal(char a) {
        int j = 0;
        j = (int)a;
        return j;
    }
    
    public String getHexaDecimal(int dec) {
        String hex = Integer.toHexString(dec);
        return hex;
    }
}
