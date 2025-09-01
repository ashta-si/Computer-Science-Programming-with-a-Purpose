/*
 Name          : Gobal Krishnan V
 Date of Birth : 18/06/1995
 Compilation   : javac GeneralizedHarmonic.java
 Execution     : java GeneralizedHarmonic 2 3

 %java RandomWalkers 2 3
1.125
*/

public class GeneralizedHarmonic{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        if(n<0) return;

        double value = 0.0;
        for (int i = 1 ; i <= n; i++){
          value += (1.0 / Math.pow(i,r));
        }
        System.out.println(value);

    }
}