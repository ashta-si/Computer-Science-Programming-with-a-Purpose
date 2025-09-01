/*
% java


 Name          : Gobal Krishnan V
 Date of Birth : 18/06/1995
 Compilation   : javac RandomWalker.java
 Execution     : java RandomWalker 5

 %java RandomWalker 5
 (0,0)
(0,-1)
(0,0)
(0,1)
(-1,1)
(0,1)
(0,2)
(-1,2)
(-1,3)
(-1,2)
(-1,1)
(-2,1)
(-3,1)
(-3,0)
(-3,-1)
(-3,-2)
(-3,-1)
(-3,0)
(-4,0)
(-4,-1)
Steps = 20
 */


public class RandomWalker{
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, steps = 0;
        System.out.println("("+x+","+y+")");

        while(Math.abs(x) + Math.abs(y) < r){


           int direction = (int) (Math.random() * 4);
           switch (direction){
               case 0 : x = x+1;break;
               case 1 : x = x-1;break;
               case 2 : y = y+1;break;
               case 3 : y = y-1;break;
           }


           steps++;
           System.out.println("("+x+","+y+")");

        }
        System.out.println("steps = "+steps);


    }
}