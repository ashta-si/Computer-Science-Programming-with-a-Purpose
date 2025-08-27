/*
Name          : Gobal Krishnan V
Date of Birth : 18/06/1995
Compilation   : javac  GreatCircle.java
Execution     : java  GreatCircle  40.35 74.65 48.87 -2.33

%java  40.35 74.65 48.87 -2.33
5902.927099258561 kilometers
%java GreatCircle 60.0 15.0 120.0 105.0
4604.53989281927 kilometers

*/

public class GreatCircle{


    public static void main(String[] args){
        double x1=Math.toRadians(Double.parseDouble(args[0])),
               y1=Math.toRadians(Double.parseDouble(args[1])),
               x2=Math.toRadians(Double.parseDouble(args[2])),
               y2=Math.toRadians(Double.parseDouble(args[3])),
                r= 6371.0, //is the mean radius of the Earth (in kilometers).
                // 2r*arcsin(sqrt(sin^2((x2-x1)/2)+ cos(x1)cos(x2)sin^2((xy-y1)/2)))
                distance =  2.0*r*Math.asin(Math.sqrt(Math.pow(Math.sin((x2-x1)/2.0),2)+(Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2.0),2))));
        System.out.println(distance+" kilometers");
    }
}