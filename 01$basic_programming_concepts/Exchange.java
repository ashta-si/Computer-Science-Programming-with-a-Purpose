public class Exchange{
    public static void main(String[] args){

        //int a = 1234;
        //int b = 99;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Before "+a+" and "+b);

        int t = a;
        a = b;
        b = t;
        System.out.println("After "+a+" and "+b);

    }
}