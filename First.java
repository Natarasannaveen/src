import java.util.Scanner;
public class First {

        public static void main(String[] args) {
       /* Scanner inyh = new Scanner(System.in);
        String User;
        String Mob;
        String Quali;
        {
            System.out.println("Enter Username :");
        }
       User = inyh.nextLine();
        {
            System.out.println("Username is :" + User.toUpperCase());
        }
        {
            System.out.println("Enter mobile number :");
        }
        Mob = inyh.nextLine();
        {
            System.out.println("Mobile number is :" + Mob);
        }
        {
            System.out.println("Enter your Qualification :");
        }
        Quali = inyh.nextLine();
        {
            System.out.println("Your Qualification is :" + Quali);
        }
         --------------------------------------------------------------------------------------------------------------
         */

            String A = "hi i am naveen kumar, i have started using the java for new job...";

            System.out.println(A.toUpperCase());
            System.out.println(A.length());
            int Tickerprice = 699;
            int Passangers = 50;
            int Singletrip = (Tickerprice * (Passangers * 2));
            int TTPDay = 9;
            System.out.println(Singletrip * TTPDay);

            Scanner inyh = new Scanner(System.in);
            System.out.println("Enter User name :");
            String User = inyh.nextLine();
            System.out.println("User name is :" + User);
            if(User == "Naveenkumar") {
                System.out.println("Hi Naveenkumar welocme to secret society...");
            }
            else {
                System.out.println("You are unauthorised person to enter in this society...");
            }




        }
    }

