//  program to print all odd number between 1 to n
import java.util.Scanner;
class Odd_Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number of Limit : ");
        int l =input.nextInt();
        for(int s=1;s<=l;s++)
        {
            if(s%2==1)
                System.out.println(s);
        }
    }
}// Shivanshu Deo