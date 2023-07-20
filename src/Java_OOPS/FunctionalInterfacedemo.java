package Java_OOPS;
@java.lang.FunctionalInterface
interface FunctionalInterface{

    public int multiplyNumber(int x, int y);

}
public class FunctionalInterfacedemo {
    public static void main(String[] args) {
        FunctionalInterface obj= (x,y)-> x*y;
        System.out.println(obj.multiplyNumber(3,4));

    }


}

