// program to find maximum between two numbers
import java.util.Scanner;
class Max_Num
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = input.nextInt();
        if(n1>n2)
            System.out.println("Maximum Number is " +n1);
        else if(n1<n2)
            System.out.println("Maximum Number is " +n2);
        else
            System.out.println("Both are Equal " +n1);
    }
}// Shivanshu Deo