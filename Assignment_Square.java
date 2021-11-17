import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter the Number ");
        try
        {
            a=s.nextInt();
            System.out.println("Square of the number "+a+":- "+(a*a));
        }
        catch (Exception obj)
        {
            obj.printStackTrace();
        }
    }
}
