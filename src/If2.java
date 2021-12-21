import java.util.Scanner;
public class If2
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,y,c;
        System.out.println("enter a numbers");
        x=input.nextInt();
        y= input.nextInt();
        c=x/y;
        if(c > 0)
            System.out.println("the number is divided without number after the 0");
        else{
            System.out.println("the number is divided with number after the 0");
        }
    }
}
