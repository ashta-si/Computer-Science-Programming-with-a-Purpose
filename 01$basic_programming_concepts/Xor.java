import edu.princeton.cs.algs4.StdOut;
public class Xor{
    public static void main(String[] args){
        boolean a = Boolean.parseBoolean(args[0]),
                b = Boolean.parseBoolean(args[1]);

        StdOut.println("a = " +a+"!a = " +!a);
        StdOut.println("b = " +b+"!b = " +!b);
        boolean f = false, t = true;

        StdOut.println("=============================================");
        StdOut.println("a and b");
        StdOut.println("a = " +f+" | b = " +f+" | a && b = " + (f && f)+" |");
        StdOut.println("a = " +f+" | b = " +t+" | a && b = " + (f && t)+" |");
        StdOut.println("a = " +t+" | b = " +f+" | a && b = " + (t && f)+" |");
        StdOut.println("a = " +t+" | b = " +t+" | a && b = " + (t && t)+" |");

        StdOut.println("=============================================");
        StdOut.println("a or b");
        StdOut.println("a = " +f+" | b = " +f+" | a || b = " + (f || f)+" |");
        StdOut.println("a = " +f+" | b = " +t+" | a || b = " + (f || t)+" |");
        StdOut.println("a = " +t+" | b = " +f+" | a || b = " + (t || f)+" |");
        StdOut.println("a = " +t+" | b = " +t+" | a || b = " + (t || t)+" |");

        StdOut.println("=============================================");
        StdOut.println("XOR 1 = !a && b");
        StdOut.println("a = " +f+" | b = " +f+" | a && b = " + (!f && f) + " |");
        StdOut.println("a = " +f+" | b = " +t+" | a && b = " + (!f && t) + " |");
        StdOut.println("a = " +t+" | b = " +f+" | a && b = " + (!t && f) + " |");
        StdOut.println("a = " +t+" | b = " +t+" | a && b = " + (!t && t) + " |");

        StdOut.println("=============================================");
        StdOut.println("XOR 2 = a && !b");
        StdOut.println("a = " +f+" | b = " +f+" | a && b = " + (f && !f)+" |");
        StdOut.println("a = " +f+" | b = " +t+" | a && b = " + (f && !t)+" |");
        StdOut.println("a = " +t+" | b = " +f+" | a && b = " + (t && !f)+" |");
        StdOut.println("a = " +t+" | b = " +t+" | a && b = " + (t && !t)+" |");


        StdOut.println("=============================================");
        StdOut.println("((!a && b) || (a && !b) )");
        StdOut.println("a = " +f+" | b = " +f+" | a && b = " + ((!f && f) || (f && !f))+" |");
        StdOut.println("a = " +f+" | b = " +t+" | a && b = " + ((!f && t) || (f && !t))+" |");
        StdOut.println("a = " +t+" | b = " +f+" | a && b = " + ((!t && f) || (t && !f))+" |");
        StdOut.println("a = " +t+" | b = " +t+" | a && b = " + ((!t && t) || (t && !t))+" |");


    }
}