package Java_OOPS;
import java.util.*;
interface Sample
{
    int sum(int a,int b);
}

public class Lambda_expression {

    public static void main(String[] args) {
        Sample s=(int x,int y)->{
            return (x+y);
        };
        System.out.println(s.sum(6,8));

    }



}
