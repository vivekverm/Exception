import java.util.Scanner;
public class PersonError extends RuntimeException{
    PersonError(String s)
    {
        super(s);
    }
}
class NameAge
{
    public static void main(String[] args) {
        String Name;
        int Age;
        try(Scanner s=new Scanner(System.in))
        {
            System.out.println("Enter the Name of the Person ");
            Name=s.next();
            System.out.println("Enter the Age of the Person");
            Age=s.nextInt();
            if(Age>=18 && Age<60)
            {
                System.out.println("Proper Error Message");
            }
            else
            {
                throw new PersonError("Not proper");
            }
        }
        catch (PersonError obj)
        {
            System.out.println("Person Error");
        }
    }
}
