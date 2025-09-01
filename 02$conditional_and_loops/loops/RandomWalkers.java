/*
% java


 Name          : Gobal Krishnan V
 Date of Birth : 18/06/1995
 Compilation   : javac RandomWalkers.java
 Execution     : java RandomWalkers 5 1000000

 %java RandomWalkers 5 1000000
 71.594504
 */


public class RandomWalkers{
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);


        double average = 0.0;
        for(int i=0;i<trials;i++){
            int x = 0, y = 0, steps = 0;
            while((Math.abs(x) + Math.abs(y)) < r){


                int direction = (int) (Math.random() * 4);
                switch (direction){
                    case 0 : x = x+1;break;
                    case 1 : x = x-1;break;
                    case 2 : y = y+1;break;
                    case 3 : y = y-1;break;

                }


                steps++;
            }
            average += steps;

        }
        double average_value = average/trials;
        System.out.println("average number of steps  = "+average_value);


    }
}