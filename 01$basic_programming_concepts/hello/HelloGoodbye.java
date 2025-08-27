/*
Name          : Gobal Krishnan V
Date of Birth : 18/06/1995
Compilation   : javac  HelloGoodbye
Execution     : java  HelloGoodbye GobalKrishnan Hulk

%java  HelloGoodbye Hulk

Hello GobalKrishnan and Hulk
Goodbye GobalKrishnan and Hulk
*/

public class  HelloGoodbye{

    public static void main(String[] args){
        /*
        * String is DataType
        * String name1, name2 = Declaration Statement => Is Variable with Type
        * name1 = args[0], nama2 = args[1] = Assignment Statement => Is Value with Variable
        * name1 and name 2 is Variables
        * args[0] and args[1] is literals
        * */
        String name1 = args[0],name2 = args[1];
        System.out.println("Hello "+ name1+ " and " + name2+".");
        System.out.println("Goodbye "+ name2+" and " + name1+".");
    }
}