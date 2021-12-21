import java.util.Scanner;
public class If4
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int y,c,b,a = 0;
        System.out.println("how much kids you have in the group?");
        y=input.nextInt();
        c = y/10;
        b = y%10;
        if (b > 0)
            a = 1;
        System.out.println("you need " + (c + a) + " Instruction");
        }
    }
