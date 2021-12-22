import java.util.Scanner;
public class If
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.println("enter a numbers");
        x=input.nextInt();
        if(x%2==0)
            System.out.println("hello");
    }
}
