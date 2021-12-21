import java.util.Scanner;
public class If3
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int y,c;
        System.out.println("what year is today?");
        y=input.nextInt();
        c=y%4;
        if(c == 0)
            System.out.println("in this year the february have 29 days");
        else{
            System.out.println("in this year the february have 28 days");
        }
    }
}
