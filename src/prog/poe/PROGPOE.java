package prog.poe;
import java.util.Scanner;

public class PROGPOE 
{

    public static void main(String[] args) 
    {
       Scanner sn = new Scanner(System.in);
       Validations vld = new Validations();
       
       String username;
       String password;
       boolean usrn;
       boolean spChar;
       boolean passlng;
       boolean capLr;
       
       usrn = false;
       spChar = false;
       passlng = false;
       capLr = false;
       
       while(usrn == false )
       {
        System.out.print("Enter Username : ");
        username = sn.next();
        
        usrn = vld.CheckUsername(username);
       }
       
       while(spChar == false || passlng == false || capLr == false)
       {
        System.out.print("Enter Password : ");
        password = sn.next();
       
        spChar = vld.CheckPassword(password);
        passlng = vld.CheckLength(password);
        capLr = vld.CheckCapitalLetter(password);
        
            if(spChar == false)
            {
                System.out.println("\nPASSWORD MUST CONTAIN AT LEAST ONE SPECIAL CHARACTER!!");
            }
            
            if(passlng == false)
            {
            System.out.println("PASSWORD SHOULD BE AT LEAST 7 CHARACTERS LONG!!");
            }
             
            if(capLr == false)
            {
            System.out.println("PASSWORD MUST CONTAIN AT LEAST ONE CAPITAL LETTER CHARACTER!!\n");
            }
    
       }
       if(usrn == true && spChar == true && passlng == true && capLr == true)
        {
            System.out.println("Password succefully saved!!\n");
            
            String logusr;
            String logpass;
            System.out.print("\nEnter your login Username : ");
            logusr = sn.next();
            System.out.print("Enter your login Password : ");
            logpass = sn.next();
                
        }
        if(logusr.compareTo(username) == 0)
            {
                
            }
    }
    
}
