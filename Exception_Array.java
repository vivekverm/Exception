import java.util.Scanner;
public class Exception_Array {
    public static void main(String[] args) {
        int Size;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        Size=s.nextInt();
        int arr[]=new int[Size];
        System.out.println("Enter the element of the array:-");
        try
        {
            //int er = Integer.parseInt("abc");
            for (var i = 0; i < arr.length; i++)
            {
                arr[i] = s.nextInt();
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException");
        }
        int num;
        try
        {
            System.out.println("Enter the index of the array you want to access ");
            num=s.nextInt();
            System.out.println("The array element at index"+" "+num+"="+arr[num]);
            System.out.println("The Array element successfully");
        }
        catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
