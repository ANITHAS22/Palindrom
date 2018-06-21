import java.util.*;
class Gprime
{
    public static void main(String args[])
    {
        Scanner io=new Scanner(System.in);
        int num=io.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
