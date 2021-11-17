import java.util.Scanner;
public class MathOperation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Size;
        System.out.println("Enter the Size of the Array");
        Size=s.nextInt();
        int arr[]=new int[Size];
        try
        {
            System.out.println("Enter the element of the array ");
            for(var i=0;i< arr.length;i++) {
                arr[i] = s.nextInt();
            }
            int Sum=0;
            for(var j=0;j<arr.length;j++)
            {
                Sum= Sum+arr[j];
            }
            System.out.println("Sum of the element of the Array="+Sum);
            System.out.println();
            System.out.println("The average of all the element="+(Sum/Size));
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch (NumberFormatException obj)
        {
            System.out.println("NumberFormat Exception");
        }

    }
}
