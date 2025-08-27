/*
 Name          : Gobal Krishnan V
 Date of Birth : 18/06/1995
 Compilation   : javac RightTriangle.java
 Execution     : java RightTriangle 1 2 3

 %java RightTriangle 1 2 3  is false
 %java RightTriangle 4 5 6  is true
*/

public class RightTriangle{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]),
            b = Integer.parseInt(args[1]),
            c = Integer.parseInt(args[2]);



        boolean rightTriangle = (a >0 && b>0 && c>0 ) && (((a*a) + (b*b) == c*c )|| ((a*a) + (c*c) == (b*b)) || (b*b + c*c == a*a)) ;
        System.out.println(rightTriangle);
    }
}