import java.util.Scanner;

public class SwitchCaseExample{
    public static void main(String[] args){
        int day;
        Scanner SC=new Scanner(System.in);

        System.out.print("Enter a weekday number (1 to 7): ");
        day=SC.nextInt();


        //print weekday name according to give value
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Week sirf 7 Days Ka Hota Hai");
                break;
        }
    }

}





/////// Shivanshu Deo (2201010012)