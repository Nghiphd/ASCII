import java.util.Scanner;

/**
 * Write a description of class ASCII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ASCII
{
    Scanner scanner = new Scanner(System.in);
    char[] abc = new char[]{' ','a','b','c','d','e','f','g','h','i','j',
        'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int[] get = new int[27];
    
    public static void main(String[] args) {
        ASCII man = new ASCII();
        System.out.println(man.abc.length);
    }
    
    public int getdecimal() {
        int j = 0;
        for(char i: abc) {
            j = (int)i;
        }
        
        
        return j;
    }
}
