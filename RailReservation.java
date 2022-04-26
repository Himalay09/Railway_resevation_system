// your username is Aman@123 and password is 123
// you can only enter train number (1234, 2345,3456)
// your PNR is 147
import java.util.Scanner;
public class RailReservation {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n**Wellcome to indian Rail**");
        System.out.println("\nLogin");
        System.out.println("Enter yout login id");
        String loginid =sc.nextLine();
        System.out.println("\nEnter your password");
        String password = sc.nextLine();
        String lid = "Aman@123";
        String pass = "123";
        if(loginid.equals(lid) && password.equals(pass)){
            System.out.println("\n**Reservation form**");
            System.out.println("Enter train number");
            String tno = sc.nextLine();
            String tn = "1234";
            String tnom = "2345";
            String tnomb = "3456";
            if(tno.equals(tn)){
                System.out.println("Rajni express");
            }
            if(tno.equals(tnom)){
                System.out.println("patalkot express");
            }
            if(tno.equals(tnomb)){
                System.out.println("bhagat ki kothi");
            }
            System.out.println("\nEnter your class");
            String classs = sc.nextLine();
            System.out.println("\nEnter date for journy");
            String date = sc.nextLine();
            System.out.println("\nStart journy from");
            String start = sc.nextLine();
            System.out.println("\nEnd journy in");
            String end = sc.nextLine();
            System.out.println("\n\n\t\t***ETiket***\n");
            String pnr = "147";
            System.out.println("PNR                : 147");
            System.out.println("Train number       : " + tno);
            System.out.println("Arrival Stetion    : " + start );
            System.out.println("Departurte Stetion : " + end );
            System.out.println("Seet number        : 23");
            System.out.println("Class              : " + classs);
            System.out.println("Date               : " + date);
            System.out.println("\nTo cancel your tiket enter 1");
            String cancel = sc.nextLine();
            String cancell = "1";
            if(cancel.equals(cancell)){
                System.out.println("\nEnter your PNR number");
                String pnrr = sc.nextLine();
                if(pnrr.equals(pnr)){
                    System.out.println("\nPNR                : 147");
                    System.out.println("Train number       : " + tno);
                    System.out.println("Arrival Stetion    : " + start );
                    System.out.println("Departurte Stetion : " + end );
                    System.out.println("Seet number        : 23");
                    System.out.println("Class              : " + classs);
                    System.out.println("Date               : " + date);
                    System.out.println();
                    System.out.println("For cancelletion type yes");
                    String confurm = sc.nextLine();
                    String confu = "yes";
                    if(confurm.equals(confu)){
                    System.out.println("\nyour tiket has been cancelled");
                }}
            }
        }
        else{
                System.out.println("Userid or password is incorrect");
        }
    }
}
// your username is Aman@123 and password is 123
// you can only enter train number (1234, 2345,3456)
// your PNR is 147