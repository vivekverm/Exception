import java.util.Scanner;
public class InvalidCountryException extends Exception {
    InvalidCountryException(String s)
    {
        super(s);
    }
}
class UserRegistration
{
    public void RegisterUser(String userName,String userCountry) {
        try(Scanner s = new Scanner(System.in))                 //Try with Resources
        {
            System.out.println("Enter the User Name ");
            userName=s.next();
            System.out.println("Enter the Country Name ");
            userCountry = s.next();
            if (userCountry.equals("India"))
            {
                System.out.println("User Registered done Successfully");
            }
            else
            {
                throw new InvalidCountryException("User Outside India cannot be Register");
            }
        }
        catch (InvalidCountryException obj)
        {
            System.out.println("//Invalid Country Exception");
        }
    }

    public static void main(String[] args)
    {
        UserRegistration v=new UserRegistration();
        v.RegisterUser("Vv","in");
    }
}
